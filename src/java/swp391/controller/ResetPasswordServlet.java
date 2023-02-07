/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Properties;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import swp391.customer.CustomerCreateError;
import swp391.customer.CustomerDAO;
import swp391.utils.MyApplicationConstants;

/**
 *
 * @author Chau Nhat Truong
 */
@WebServlet(name = "ResetPasswordServlet", urlPatterns = {"/ResetPasswordServlet"})
public class ResetPasswordServlet extends HttpServlet {

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
                MyApplicationConstants.ResetPasswordServlet.RESETPASSWORD_PAGE);
        String password = request.getParameter("txtPassword");
        String confirm = request.getParameter("txtConfirm");
        boolean errorFound = false;
        CustomerCreateError errors = new CustomerCreateError();
        try {
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
            if (errorFound) {
                //catch error
                request.setAttribute("RESETPASSWORD_ERROR", errors);
                //transfer to inform users
            } else {
                HttpSession session = request.getSession();
                String email = (String) session.getAttribute("email");
                CustomerDAO dao = new CustomerDAO();
                boolean result = dao.updatePassword(email, password);
                if (result) {
                    url = siteMaps.getProperty(
                            MyApplicationConstants.ResetPasswordServlet.LOGIN_PAGE);
                }
            }
        } catch (NamingException ex) {
            log("ResetPassword _ Naming _ " + ex.getMessage());
        } catch (SQLException ex) {
            log("ResetPassword _ SQL _ " + ex.getMessage());
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
