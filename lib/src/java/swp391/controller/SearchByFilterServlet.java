/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.controller;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
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
import javax.servlet.http.HttpSession;
import swp391.product.ProductDAO;
import swp391.product.ProductDTO;
import swp391.utils.MyApplicationConstants;

/**
 *
 * @author Chau Nhat Truong
 */
@WebServlet(name = "SearchByFilterServlet", urlPatterns = {"/SearchByFilterServlet"})
public class SearchByFilterServlet extends HttpServlet {

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
                MyApplicationConstants.FirstTimeRequestServlet.MAIN_PAGE);
        String txtProductCateID = request.getParameter("txtProductCateID");
        int cateID = Integer.parseInt(txtProductCateID);
        String txtPriceFrom = request.getParameter("txtPriceFrom");
        if (txtPriceFrom == null || txtPriceFrom.isEmpty()) {
            txtPriceFrom = "-1";
        }
        float priceFrom = Float.parseFloat(txtPriceFrom);
        String txtPriceTo = request.getParameter("txtPriceTo");
        if (txtPriceTo == null || txtPriceTo.isEmpty()) {
            txtPriceTo = "0";
        }
        float priceTo = Float.parseFloat(txtPriceTo);
        String txtSize = request.getParameter("cboSize");
        if (txtSize == null) {
            txtSize = "0";
        }
        int size = Integer.parseInt(txtSize);
        try {
            ProductDAO dao = new ProductDAO();
            dao.searchByFilter(cateID, priceFrom, priceTo, size);
            List<ProductDTO> result = dao.getListProductByFilter();
            request.setAttribute("SEARCHBYFILTER_RESULT", result);
            url = siteMaps.getProperty(
                    MyApplicationConstants.SearchServlet.SEARCH_FILTER_PAGE);
            String json = new Gson().toJson(result);
            HttpSession session = request.getSession();
            session.setAttribute("products", json);
        } catch (NamingException ex) {
            log("SearchByFilterServlet _ Naming _ " + ex.getMessage());
        } catch (SQLException ex) {
            log("SearchByFilterServlet _ SQL _ " + ex.getMessage());
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
