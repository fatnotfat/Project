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
import swp391.product.ProductDAO;
import swp391.utils.MyApplicationConstants;

/**
 *
 * @author Chau Nhat Truong
 */
@WebServlet(name = "AdminUpdateProductServlet", urlPatterns = {"/AdminUpdateProductServlet"})
public class AdminUpdateProductServlet extends HttpServlet {

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
                MyApplicationConstants.AdminUpdateProductServlet.ADMINSEARCHPRODUCT_PAGE);
        String searchValue = request.getParameter("lastSearchValue");
        String txtProductID = request.getParameter("txtProductID");
        int productID = Integer.parseInt(txtProductID);
        String name = request.getParameter("txtName");
        String description = request.getParameter("txtDescription");
        String txtQuantity = request.getParameter("txtQuantity");
        int quantity = Integer.parseInt(txtQuantity);
        String txtPrice = request.getParameter("txtPrice");
        float price = Float.parseFloat(txtPrice);
        String txtStatus = request.getParameter("chkStatus");
        boolean status = false;
        if (txtStatus != null) {
            status = true;
        }
        String txtSize = request.getParameter("txtSize");
        int size = Integer.parseInt(txtSize);
        boolean errorFound = false;
        AdminCreateError errors = new AdminCreateError();
        try {
            if (name.trim().length() < 1) {
                errorFound = true;
                errors.setNameLengthError("You can't leave name empty");
            }
            if (description.trim().length() < 1) {
                errorFound = true;
                errors.setDescriptionLengthError("You can't leave description empty");
            }
            if (quantity < 0) {
                errorFound = true;
                errors.setQuantityError("You can't put quantity less than 0");
            }
            if (price < 0) {
                errorFound = true;
                errors.setPriceError("You can't put price less than 0");
            }
            if (size < 0) {
                errorFound = true;
                errors.setSizeError("You can't put size less than 0");
            }
            if (errorFound) {
                request.setAttribute("UPDATE_ERROR", errors);
                url = "AdminSearchProductServlet"
                        + "?txtSearchValue=" + searchValue;
            } else {
                ProductDAO dao = new ProductDAO();
                boolean result = dao.updateProduct(productID, name, description,
                        quantity, price, status, size);
                if (result) {
                    url = "AdminSearchProductServlet"
                            + "?txtSearchValue=" + searchValue;
                }
            }
        } catch (NamingException ex) {
            log("AdminUpdateProductServlet _ Naming _ " + ex.getMessage());
        } catch (SQLException ex) {
            log("AdminUpdateProductServlet _ SQL _ " + ex.getMessage());
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
