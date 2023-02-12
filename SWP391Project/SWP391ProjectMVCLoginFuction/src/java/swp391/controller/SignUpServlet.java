/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.controller;

import java.io.IOException;
import java.sql.SQLException;
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
import swp391.customer.CustomerCreateError;
import swp391.customer.CustomerDAO;
import swp391.customer.CustomerDTO;
import swp391.utils.MyApplicationConstants;

/**
 *
 * @author Chau Nhat Truong
 */
@WebServlet(name = "SignUpServlet", urlPatterns = {"/SignUpServlet"})
public class SignUpServlet extends HttpServlet {

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
                MyApplicationConstants.CreateAccountServlet.ERROR_PAGE);
        String name = request.getParameter("txtName");
        String password = request.getParameter("txtPassword");
        String email = request.getParameter("txtEmail");
        String phone = request.getParameter("txtPhone");
        String address = request.getParameter("txtAddress");
        String birthDateTxt = request.getParameter("txtBirthDate");
        String sexTxt = request.getParameter("txtSex");
        String confirm = request.getParameter("txtConfirm");
        boolean errorFound = false;
        CustomerCreateError errors = new CustomerCreateError();
        try {
            //Check all user error
            if (name.trim().length() < 1) {
                errorFound = true;
                errors.setNameLengthError("You can't leave this empty");
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
            if (email.trim().length() < 1) {
                errorFound = true;
                errors.setEmailLengthError("You can't leave this empty");
            }
            if (phone.trim().length() < 1) {
                errorFound = true;
                errors.setPhoneLengthError("You can't leave this empty");
            }
            if (address.trim().length() < 1) {
                errorFound = true;
                errors.setAddressLengthError("You can't leave this empty");
            }
            if (errorFound) {
                //catch error
                request.setAttribute("SIGNUP_ERROR", errors);
                //transfer to inform users
            } else {
                //Call DAO to insert DB
                Date birthDate = new Date(birthDateTxt);
                boolean sex = new Boolean(sexTxt);
                CustomerDAO dao = new CustomerDAO();
                CustomerDTO dto
                        = new CustomerDTO(name, password, email, phone, address, birthDate, sex, true);
                boolean result = dao.createAccount(dto);
                if (result) {
                    url = siteMaps.getProperty(
                            MyApplicationConstants.CreateAccountServlet.LOGIN_PAGE);
                }
            }
        } catch (SQLException ex) {
            String msg = ex.getMessage();
            log("SignUp _ SQL _ " + msg);
            if (msg.contains("duplicate")) {
                errors.setEmailIsExisted(email + " is existed!!!!");
                request.setAttribute("SIGNUP_ERROR", errors);
            }
        } catch (NamingException ex) {
            log("SignUp _ Naming _ " + ex.getMessage());
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
