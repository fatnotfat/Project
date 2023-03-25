/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.controller;

import com.google.gson.Gson;
import java.io.IOException;
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
import swp391.customer.CustomerDAO;
import swp391.customer.CustomerDTO;
import swp391.feedback.FeedBackDAO;
import swp391.feedback.FeedBackDTO;
import swp391.product.ProductDAO;
import swp391.product.ProductDTO;
import swp391.utils.MyApplicationConstants;

/**
 *
 * @author nguye
 */
@WebServlet(name = "ViewProductServlet", urlPatterns = {"/ViewProductServlet"})
public class ViewProductServlet extends HttpServlet {

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
                MyApplicationConstants.ProductFeature.PRODUCT_PAGE);
        try {
            String id = request.getParameter("txtProductID");
            if (id != null) {
                ProductDAO dao = new ProductDAO();
                FeedBackDAO fbDao = new FeedBackDAO();
                CustomerDAO cusDao = new CustomerDAO();
                ProductDTO dto = dao.getItemByID(id);
                List<ProductDTO> relatedList = dao.searchRelatedProduct(dto.getCateID());
                List<FeedBackDTO> feedbackList = fbDao.getListFeedBackOfProduct(dto.getId());
                List<CustomerDTO> customerFbList = cusDao.getListFeedBackCustomer(Integer.parseInt(id));
                request.setAttribute("CUSTOMER_FEEDBACK", customerFbList);        
//                String json = new Gson().toJson(relatedList);
                HttpSession session = request.getSession();
                session.setAttribute("ITEM_DETAIL", dto);
                request.setAttribute("RELATED_PRODUCT", relatedList);
                request.setAttribute("FEEDBACK_LIST", feedbackList);
            }

        } catch (NamingException ex) {
            log("NumberFormatException :" + ex.getMessage());
        } catch (SQLException ex) {
            log("SQLException :" + ex.getMessage());
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
