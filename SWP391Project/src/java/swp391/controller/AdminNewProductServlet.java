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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import swp391.admin.AdminCreateError;
import swp391.category.CategoryDAO;
import swp391.category.CategoryDTO;
import swp391.product.ProductDAO;
import swp391.product.ProductDTO;
import swp391.utils.MyApplicationConstants;

/**
 *
 * @author Chau Nhat Truong
 */
@WebServlet(name = "AdminNewProductServlet", urlPatterns = {"/AdminNewProductServlet"})
public class AdminNewProductServlet extends HttpServlet {

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
                MyApplicationConstants.AdminNewProductServlet.ADMINNEWPRODUCT_PAGE);
        String name = request.getParameter("txtName");
        String description = request.getParameter("txtDescription");
        String txtQuantity = request.getParameter("txtQuantity");
        int quantity = Integer.parseInt(txtQuantity);
        String txtPrice = request.getParameter("txtPrice");
        float price = Float.parseFloat(txtPrice);
        String txtSize = request.getParameter("txtSize");
        int size = Integer.parseInt(txtSize);
        String txtCategoryID = request.getParameter("txtCategoryID");
        int categoryID = Integer.parseInt(txtCategoryID);
        String txtBrandID = request.getParameter("txtBrandID");
        int brandID = Integer.parseInt(txtBrandID);
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
                request.setAttribute("ADMINNEWPRODUCT_ERROR", errors);
            } else {
                ProductDAO dao = new ProductDAO();
                ProductDTO dto = new ProductDTO(name, description, quantity,
                        price, size, categoryID, brandID);
                boolean result = dao.createProduct(dto);
                if (result) {
                    url = siteMaps.getProperty(
                            MyApplicationConstants.AdminNewProductServlet.ADMINMAIN_PAGE);
                }
            }
        } catch (NamingException ex) {
            log("AdminNewProductServlet _ Naming _ " + ex.getMessage());
        } catch (SQLException ex) {
            log("AdminNewProductServlet _ SQL _ " + ex.getMessage());
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
