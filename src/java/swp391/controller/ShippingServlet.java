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
        String txtShippingID = request.getParameter("location");
        String txtTypeOfShippingInfo = request.getParameter("defaultOrNewShippingInfor");
        boolean errorFound = false;
        CustomerCreateError errors = new CustomerCreateError();
        HttpSession session = request.getSession();
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
                    
                    url = siteMaps.getProperty(
                            MyApplicationConstants.ShippingServlet.PAYMENT_PAGE);
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
                    if (address.trim().length() < 1) {
                        errorFound = true;
                        errors.setAddressLengthError("You can't leave address empty");
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
                        dao.createAccountForShipping(firstName + " " + lastName,
                                email, phone, address);
                        CustomerDTO result = dao.loadInformationForPayment(email);
                        session.setAttribute("USER", result);

                        ShippingMethodDAO shippingDAO = new ShippingMethodDAO();
//                        ShippingMethodDTO shippingList = shipningDAO.getListShippingMethod();
//                        session.setAttribute("SHIPPINGMETHOD_LIST", shippingList);
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
