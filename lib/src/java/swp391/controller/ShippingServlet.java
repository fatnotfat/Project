/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import swp391.customer.CustomerCreateError;
import swp391.customer.CustomerDAO;
import swp391.customer.CustomerDTO;
import swp391.orders.OrdersDTO;
import swp391.shippingmethod.ShippingMethodDAO;
import swp391.shippingmethod.ShippingMethodDTO;
import swp391.utils.MyApplicationConstants;

/**
 *
 * @author Duy
 */
@WebServlet(name = "ShippingServlet", urlPatterns = {"/ShippingServlet"})
public class ShippingServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        ServletContext context = this.getServletContext();
        Properties siteMaps = (Properties) context.getAttribute("SITE_MAP");
        String url = siteMaps.getProperty(
                MyApplicationConstants.ShippingServlet.SHIPPING_PAGE);
        HttpSession session = request.getSession();
        String txtShippingID = request.getParameter("location");

        String defaultOrNewShippingInfo = request.getParameter("defaultOrNewShippingInfor");
        session.setAttribute("defaultOrNewShippingInfo", defaultOrNewShippingInfo);
        String ordersID = request.getParameter("stored-infoCus-by-orDetID");

        boolean errorFound = false;
        CustomerCreateError errors = new CustomerCreateError();
        try {
            if (txtShippingID == null) {
                errors.setShippingIDLengthError("Please choose the shipping method");
                request.setAttribute("SIGNUPFORSHIPPING_ERROR", errors);
            } else {
                Object emailOfSession = session.getAttribute("USER");
                if (emailOfSession != null) {
                    int shippingID = Integer.parseInt(txtShippingID);
                    request.setAttribute("SHIPPING_ID", shippingID);

                    ShippingMethodDAO shippingDAO = new ShippingMethodDAO();
                    ArrayList<ShippingMethodDTO> shippingList = shippingDAO.getListShippingMethodGPT();
                    session.setAttribute("SHIPPINGMETHOD_LIST", shippingList);

                    if (defaultOrNewShippingInfo == null) {
                        errors.setDefaultOrNewShippingInforLengthError("You cannot leave the shipping information option empty");
                        request.setAttribute("SIGNUPFORSHIPPING_ERROR", errors);
                    } else {
                        List<OrdersDTO> ordersDTOs = (List<OrdersDTO>) session.getAttribute("USER_SHIPPINGINFO");
                        if (ordersDTOs != null) {

                            if (defaultOrNewShippingInfo.equals("0")) {
                                if (ordersID.length()<1) {
                                    errors.setCusInfoLengthError("you have to choose your shipping information");
                                    request.setAttribute("SIGNUPFORSHIPPING_ERROR", errors);
                                } else {
                                    int ordersIDInt = Integer.parseInt(ordersID);
                                    for (OrdersDTO customer : ordersDTOs) {
                                        if (customer.getOrdersID() == ordersIDInt) {
                                            String cusName = customer.getCusName();
                                            byte[] bytes0 = cusName.getBytes(StandardCharsets.ISO_8859_1);
                                            cusName = new String(bytes0, StandardCharsets.UTF_8);

                                            String cusPhone = customer.getCusPhone();

                                            String cusAddress = customer.getCusAddress();
                                            byte[] bytes = cusAddress.getBytes(StandardCharsets.ISO_8859_1);
                                            cusAddress = new String(bytes, StandardCharsets.UTF_8);

                                            session.setAttribute("customerName", cusName);
                                            session.setAttribute("customerAddress", cusAddress);
                                            session.setAttribute("customerPhone", cusPhone);
                                            break;
                                        }
                                    }
                                    url = siteMaps.getProperty(
                                            MyApplicationConstants.ShippingServlet.PAYMENT_PAGE);
                                }

                            } else {
                                String firstName = request.getParameter("txtFirstName");
                                byte[] bytes1 = firstName.getBytes(StandardCharsets.ISO_8859_1);
                                firstName = new String(bytes1, StandardCharsets.UTF_8);

                                String lastName = request.getParameter("txtLastName");
                                byte[] bytes2 = lastName.getBytes(StandardCharsets.ISO_8859_1);
                                lastName = new String(bytes2, StandardCharsets.UTF_8);

                                String customerAddress = request.getParameter("txtAddress");
                                byte[] bytes3 = customerAddress.getBytes(StandardCharsets.ISO_8859_1);
                                customerAddress = new String(bytes3, StandardCharsets.UTF_8);

                                String customerPhone = request.getParameter("txtPhone");

                                if (firstName.trim().length() < 1) {
                                    errorFound = true;
                                    errors.setFirstNameLengthError("You can't leave first name empty");
                                }
                                if (lastName.trim().length() < 1) {
                                    errorFound = true;
                                    errors.setLastNameLengthError("You can't leave last name empty");
                                }
                                if (shippingID != 2) {
                                    if (customerAddress.trim().length() < 1) {
                                        errorFound = true;
                                        errors.setAddressLengthError("You can't leave address empty");
                                    }
                                } else {
                                    customerAddress = "Pick up at the store";
                                }
                                if (customerPhone.trim().length() < 1) {
                                    errorFound = true;
                                    errors.setPhoneLengthError("You can't leave phone empty");
                                }
                                if (errorFound) {
                                    request.setAttribute("SIGNUPFORSHIPPING_ERROR", errors);
                                } else {
                                    session.setAttribute("firstName", firstName);
                                    session.setAttribute("lastName", lastName);
                                    session.setAttribute("customerAddress", customerAddress);
                                    session.setAttribute("customerPhone", customerPhone);
                                    url = siteMaps.getProperty(
                                            MyApplicationConstants.ShippingServlet.PAYMENT_PAGE);
                                }
                            }
                        }
                    }
                } else {
                    String firstName = request.getParameter("txtFirstName");
                    byte[] bytes1 = firstName.getBytes(StandardCharsets.ISO_8859_1);
                    firstName = new String(bytes1, StandardCharsets.UTF_8);
                    String lastName = request.getParameter("txtLastName");
                    byte[] bytes2 = lastName.getBytes(StandardCharsets.ISO_8859_1);
                    lastName = new String(bytes2, StandardCharsets.UTF_8);
                    String address = request.getParameter("txtAddress");
                    String phone = request.getParameter("txtPhone");
                    String email = request.getParameter("txtEmail");
                    int shippingID = Integer.parseInt(txtShippingID);
                    CustomerDAO dao = new CustomerDAO();

                    if (firstName.trim().length() < 1) {
                        errorFound = true;
                        errors.setFirstNameLengthError("You can't leave first name empty");
                    }
                    if (lastName.trim().length() < 1) {
                        errorFound = true;
                        errors.setLastNameLengthError("You can't leave last name empty");
                    }

                    if (shippingID != 2) {
                        if (address.trim().length() < 1) {
                            errorFound = true;
                            errors.setAddressLengthError("You can't leave address empty");
                        }
                    } else {
                        address = "Pick up at the store";
                    }

                    if (phone.trim().length() < 1) {
                        errorFound = true;
                        errors.setPhoneLengthError("You can't leave phone empty");
                    }
                    if (email.trim().length() < 1) {
                        errorFound = true;
                        errors.setEmailLengthError("You can't leave email address empty");
                    } else if (dao.checkEmail(email)) {
                        errorFound = true;
                        errors.setEmailIsExisted(email + " is existed!!!");
                    }
                    if (errorFound) {
                        request.setAttribute("SIGNUPFORSHIPPING_ERROR", errors);
                    } else {
                        session.setAttribute("txtFirstName", firstName);
                        session.setAttribute("txtLastName", lastName);
                        session.setAttribute("txtAddress", address);
                        session.setAttribute("txtPhone", phone);
                        session.setAttribute("txtEmail", email);

                        dao.createAccountForShipping(firstName + " " + lastName,
                                email, phone);

                        CustomerDTO result = dao.loadInformationForPayment(email);
                        session.setAttribute("USER", result);

                        ShippingMethodDAO shippingDAO = new ShippingMethodDAO();
                        ArrayList<ShippingMethodDTO> shippingList = shippingDAO.getListShippingMethodGPT();
                        
                        session.setAttribute("SHIPPINGMETHOD_LIST", shippingList);

                        session.setAttribute("SHIPPING_ID", shippingID);
                        url = siteMaps.getProperty(
                                MyApplicationConstants.ShippingServlet.PAYMENT_PAGE);
                    }
                }
            }
        } catch (NamingException ex) {
            log("ShippingServlet _ Naming _ " + ex.getMessage());
        } catch (SQLException ex) {
            log("ShippingServlet _ SQL _ " + ex.getMessage());
        } finally {
            RequestDispatcher rd = request.getRequestDispatcher(url);
            rd.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(ShippingServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(ShippingServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
