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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import swp391.customer.CustomerDAO;
import swp391.customer.CustomerDTO;
import swp391.customer.CustomerUpdateError;
import swp391.utils.MyApplicationConstants;

/**
 *
 * @author nguye
 */
@WebServlet(name = "UpdateAccountServlet", urlPatterns = {"/UpdateAccountServlet"})
public class UpdateAccountServlet extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        ServletContext context = this.getServletContext();
        Properties siteMaps = (Properties) context.getAttribute("SITE_MAP");
        String url = siteMaps.getProperty(
                MyApplicationConstants.AccountFeature.ACCOUNT_UPDATE_PAGE);
        HttpSession session = request.getSession();
        CustomerDTO user = (CustomerDTO) session.getAttribute("USER");
        if (!user.isTypeOfLogin()) {
            String firstName = request.getParameter("txtFirstName");
            String lastName = request.getParameter("txtLastName");
            String birthDateTxt = request.getParameter("txtBirthDate");
            String phone = request.getParameter("txtPhoneNumber");
            String address = request.getParameter("txtAddressDetail");
            String city = request.getParameter("txtCityDataName");
            String district = request.getParameter("txtDistrictDataName");
            String ward = request.getParameter("txtWardDataName");
            String txtSex = request.getParameter("txtSex");
            String confirm = request.getParameter("txtConfirm");
            String password = request.getParameter("txtPassword");
            boolean errorFound = false;
            CustomerUpdateError errors = new CustomerUpdateError();
            try {
                if (firstName.trim().length() < 1) {
                    errorFound = true;
                    errors.setFirstNameLengthError("You can't leave this empty");
                }
                if (lastName.trim().length() < 1) {
                    errorFound = true;
                    errors.setLastNameLengthError("You can't leave this empty");
                }

                if (password.trim().length() < 1) {
                    errorFound = true;
                    errors.setPasswordLengthError("You can't leave this empty");
                } else if (password.trim().length() < 6 || password.trim().length() > 30) {
                    errorFound = true;
                    errors.setPasswordLengthError(
                            "Password is required input from 6 to 30 characters");
                } else if (!password.trim().equals(confirm.trim())) {
                    errorFound = true;
                    errors.setConfirmNotMatched("Confirm must be matched password");
                }
                if (birthDateTxt.trim().length() < 1) {
                    errorFound = true;
                    errors.setBirthDateLengthError("You must set your birthday!!!");
                }
                if (phone.trim().length() < 1) {
                    errorFound = true;
                    errors.setPhoneLengthError("You can't leave this empty!!!");
                }
                if (address.trim().length() < 1 || city.trim().length() < 1 || district.trim().length() < 1 || ward.trim().length() < 1) {
                    errorFound = true;
                    errors.setAddressLengthError("You can't leave this empty!!!");
                }

                if (txtSex == null || txtSex.trim().length() < 1) {
                    errorFound = true;
                    errors.setSexLengthError("You can't leave this empty!!!");
                }
                if (errorFound) {
                    //catch error
                    request.setAttribute("UPDATE_ERROR", errors);
                    //transfer to inform users
                } else {
                    Date birthday = new SimpleDateFormat("yyyy-MM-dd").parse(birthDateTxt);
                    boolean sex = false;
                    if (txtSex.equals("Male")) {
                        sex = true;
                    }

                    CustomerDTO dto
                            = new CustomerDTO(firstName + " " + lastName, password, birthday, user.getEmail(), phone, address + ", " + ward + ", " + district + ", " + city, user.isRole(), user.getRankID(), sex, false);
                    CustomerDAO dao = new CustomerDAO();
                    boolean result = dao.updateAccount(dto);
                    if (result) {
                        url = siteMaps.getProperty(
                                MyApplicationConstants.AccountFeature.ACCOUNT_INFOR_PAGE);
                        request.setAttribute("SUCCESS_UPDATE_NOTI", "Update successfully !!");
                        session.setAttribute("USER", dto);
                    }
                }

            } catch (NamingException ex) {
                log("Update_Naming_ " + ex.getMessage());
            } catch (SQLException ex) {
                log("Update_SQL_ " + ex.getMessage());
            } catch (ParseException ex) {
                log("Update_Parse_ " + ex.getMessage());
            } finally {
                RequestDispatcher rd = request.getRequestDispatcher(url);
                rd.forward(request, response);
            }
        } else {
            String firstName = request.getParameter("txtFirstName");
            String lastName = request.getParameter("txtLastName");
            String birthDateTxt = request.getParameter("txtBirthDate");
            String phone = request.getParameter("txtPhoneNumber");
            String address = request.getParameter("txtAddressDetail");
            String city = request.getParameter("txtCityDataName");
            String district = request.getParameter("txtDistrictDataName");
            String ward = request.getParameter("txtWardDataName");
            String txtSex = request.getParameter("txtSex");
            boolean errorFound = false;
            CustomerUpdateError errors = new CustomerUpdateError();
            try {
                if (firstName.trim().length() < 1) {
                    errorFound = true;
                    errors.setFirstNameLengthError("You can't leave this empty");
                }
                if (lastName.trim().length() < 1) {
                    errorFound = true;
                    errors.setLastNameLengthError("You can't leave this empty");
                }
                if (birthDateTxt.trim().length() < 1) {
                    errorFound = true;
                    errors.setBirthDateLengthError("You must set your birthday!!!");
                }
                if (phone.trim().length() < 1) {
                    errorFound = true;
                    errors.setPhoneLengthError("You can't leave this empty!!!");
                }
                if (address.trim().length() < 1 || city.trim().length() < 1 || district.trim().length() < 1 || ward.trim().length() < 1) {
                    errorFound = true;
                    errors.setAddressLengthError("You can't leave this empty!!!");
                }

                if (txtSex == null || txtSex.trim().length() < 1) {
                    errorFound = true;
                    errors.setSexLengthError("You can't leave this empty!!!");
                }
                if (errorFound) {
                    //catch error
                    request.setAttribute("UPDATE_ERROR", errors);
                    //transfer to inform users
                } else {
                    Date birthday = new SimpleDateFormat("yyyy-MM-dd").parse(birthDateTxt);
                    boolean sex = false;
                    if (txtSex.equals("Male")) {
                        sex = true;
                    }

                    CustomerDTO dto
                            = new CustomerDTO(firstName + " " + lastName, birthday, user.getEmail(), phone, address + ", " + ward + ", " + district + ", " + city, user.isRole(), user.getRankID(), sex, true);
                    CustomerDAO dao = new CustomerDAO();
                    boolean result = dao.updateAccount(dto);
                    if (result) {
                        url = siteMaps.getProperty(
                                MyApplicationConstants.AccountFeature.ACCOUNT_INFOR_PAGE);
                        request.setAttribute("SUCCESS_UPDATE_NOTI", "Update successfully !!");
                        session.setAttribute("USER", dto);
                    }
                }

            } catch (NamingException ex) {
                log("Update_Naming_ " + ex.getMessage());
            } catch (SQLException ex) {
                log("Update_SQL_ " + ex.getMessage());
            } catch (ParseException ex) {
                log("Update_Parse_ " + ex.getMessage());
            } finally {
                RequestDispatcher rd = request.getRequestDispatcher(url);
                rd.forward(request, response);
            }
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
        processRequest(request, response);
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
        processRequest(request, response);
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
