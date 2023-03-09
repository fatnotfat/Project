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
import java.util.Properties;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import swp391.admin.AdminCreateError;
import swp391.customer.CustomerDAO;
import swp391.utils.MyApplicationConstants;

/**
 *
 * @author Chau Nhat Truong
 */
@WebServlet(name = "AdminNewAccountServlet", urlPatterns = {"/AdminNewAccountServlet"})
public class AdminNewAccountServlet extends HttpServlet {

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
                MyApplicationConstants.AdminNewAccountServlet.ADMINACCOUNTLIST_PAGE);
        String name = request.getParameter("txtName");
        byte[] bytes1 = name.getBytes(StandardCharsets.ISO_8859_1);
        name = new String(bytes1, StandardCharsets.UTF_8);
        String password = request.getParameter("txtPassword");
        String phone = request.getParameter("txtPhone");
        String email = request.getParameter("txtEmail");
        String txtRole = request.getParameter("cboRole");
        boolean role = Boolean.parseBoolean(txtRole);
        boolean errorFound = false;
        AdminCreateError errors = new AdminCreateError();
        try {
            CustomerDAO dao = new CustomerDAO();
            if (dao.checkEmail(email)) {
                errorFound = true;
                errors.setEmailIsExisted(email + " is existed!!!");
            }
            if (errorFound) {
                request.setAttribute("EMAIL_EXISTED", errors);
            } else {
                boolean result = dao.adminCreateAccount(
                        name, password, email, phone, role);
                if (result) {
                    url = siteMaps.getProperty(
                            MyApplicationConstants.AdminNewAccountServlet.ADMINACCOUNTLIST_PAGE);
                }
            }
        } catch (SQLException ex) {
            log("AdminNewAccountServlet _ SQL _ " + ex.getMessage());
        } catch (NamingException ex) {
            log("AdminNewAccountServlet _ Naming _ " + ex.getMessage());
        } catch (ParseException ex) {
            log("AdminNewAccountServlet _ Parse _ " + ex.getMessage());
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
