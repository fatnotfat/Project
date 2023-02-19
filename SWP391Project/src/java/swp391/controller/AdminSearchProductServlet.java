/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import swp391.product.ProductDAO;
import swp391.product.ProductDTO;
import swp391.utils.MyApplicationConstants;

/**
 *
 * @author Chau Nhat Truong
 */
@WebServlet(name = "AdminSearchProductServlet", urlPatterns = {"/AdminSearchProductServlet"})
public class AdminSearchProductServlet extends HttpServlet {

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
        String searchValue = request.getParameter("txtSearchValue");
        ServletContext context = this.getServletContext();
        Properties siteMaps = (Properties) context.getAttribute("SITE_MAP");
        String url = siteMaps.getProperty(
                MyApplicationConstants.AdminSearchProductServlet.ADMINSEARCHPRODUCT_PAGE);
        try {
            if (searchValue.trim().length() > 0) {
                ProductDAO dao = new ProductDAO();
                dao.searchProduct(searchValue);
                List<ProductDTO> result = dao.getItemsList();
                request.setAttribute("SEARCH_RESULT", result);
                url = siteMaps.getProperty(
                        MyApplicationConstants.AdminSearchProductServlet.ADMINSEARCHPRODUCT_PAGE);
            }
            if (searchValue.equals("all") || searchValue.equals("All") || searchValue.equals("ALL")) {
                ProductDAO dao = new ProductDAO();
                dao.showProduct();
                List<ProductDTO> result = dao.getItemsList();
                request.setAttribute("SEARCH_RESULT", result);
                url = siteMaps.getProperty(
                        MyApplicationConstants.AdminSearchProductServlet.ADMINSEARCHPRODUCT_PAGE);
            }
        } catch (NamingException ex) {
            log("AdminSearchProductServlet _ Naming _ " + ex.getMessage());
        } catch (SQLException ex) {
            log("AdminSearchProductServlet _ SQL _ " + ex.getMessage());
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
