/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
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
import swp391.customer.CustomerForgotPassword;
import swp391.utils.MyApplicationConstants;
import swp391.verify.VerifyError;

/**
 *
 * @author Chau Nhat Truong
 */
@WebServlet(name = "VerifyCodeServlet", urlPatterns = {"/VerifyCodeServlet"})
public class VerifyCodeServlet extends HttpServlet {

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
                MyApplicationConstants.VerifyCodeServlet.VERIFYCODE_PAGE);
        String code1 = request.getParameter("txtCode1");
        String code2 = request.getParameter("txtCode2");
        String code3 = request.getParameter("txtCode3");
        String code4 = request.getParameter("txtCode4");
        String stringCode = code1 + code2 + code3 + code4;
        HttpSession session = request.getSession();
        CustomerForgotPassword customer = (CustomerForgotPassword) session.getAttribute("authcode");
        boolean errorFound = false;
        VerifyError errors = new VerifyError();
        try {
            if (stringCode.trim().length() < 1) {
                errorFound = true;
                errors.setCodeLengthError("You can't leave this empty");
            }
            if (errorFound) {
                request.setAttribute("VERIFYCODE_SCOPE", errors);
            } else {
                if (stringCode.equals(customer.getCode())) {
                    url = (String) session.getAttribute("SIGNUP_URL");
                    if (url != null) {
                        CustomerDAO dao = new CustomerDAO();
                        CustomerDTO dto = (CustomerDTO) session.getAttribute("CREATE_ACCOUNT");
                        boolean result = dao.createAccount(dto);
                        if (result) {
                            session.setAttribute("SIGNUP-NOTI", "Sign Up successfully!!");
                            url = siteMaps.getProperty(
                                    MyApplicationConstants.CreateAccountServlet.LOGIN_PAGE);
                            session.invalidate();
                        }
                    } else {
                        session.setAttribute("RESET-NOTI", "Reset password successfully!!");
                        url = siteMaps.getProperty(
                                MyApplicationConstants.VerifyCodeServlet.RESETPASSWORD_PAGE);
                    }
                } else {
                    errors.setCodeNotExisted("Sorry, code is not wrong, please recheck and try again!");
                    request.setAttribute("VERIFYCODE_SCOPE", errors);
                }
            }
        } catch (NamingException ex) {
            log("VerifyCodeServlet _ Naming _ " + ex.getMessage());
        } catch (ParseException ex) {
            log("VerifyCodeServlet _ Parse _ " + ex.getMessage());
        } catch (SQLException ex) {
            log("VerifyCodeServlet _ SQL _ " + ex.getMessage());
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
