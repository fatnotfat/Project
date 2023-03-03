/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.controller;

import java.io.IOException;
import java.sql.SQLException;
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
import swp391.category.CategoryDAO;
import swp391.category.CategoryDTO;
import swp391.utils.MyApplicationConstants;

/**
 *
 * @author Chau Nhat Truong
 */
@WebServlet(name = "AdminNewCategoryServlet", urlPatterns = {"/AdminNewCategoryServlet"})
public class AdminNewCategoryServlet extends HttpServlet {

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
                MyApplicationConstants.AdminNewCategoryServlet.ADMINNEWCATEGORY_PAGE);
        String name = request.getParameter("txtName");
        String description = request.getParameter("txtDescription");
        boolean errorFound = false;
        AdminCreateError errors = new AdminCreateError();
        try {
            if (name.trim().length() < 1) {
                errorFound = true;
                errors.setNameLengthError("You can't leave this empty");
            }
            if (description.trim().length() < 1) {
                errorFound = true;
                errors.setDescriptionLengthError("You can't leave this empty");
            }
            if (errorFound) {
                request.setAttribute("ADMINNEWCATEGORY_ERROR", errors);
            } else {
                CategoryDAO dao = new CategoryDAO();
                CategoryDTO dto = new CategoryDTO(name, description);
                boolean result = dao.createCategory(dto);
                if (result) {
                    url = siteMaps.getProperty(
                            MyApplicationConstants.AdminNewCategoryServlet.ADMINMAIN_PAGE);
                }
            }
        } catch (NamingException ex) {
            log("AdminNewCategoryServlet _ Naming _ " + ex.getMessage());
        } catch (SQLException ex) {
            log("AdminNewCategoryServlet _ SQL _ " + ex.getMessage());
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
