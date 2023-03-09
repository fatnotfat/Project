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
import javax.servlet.http.HttpSession;
import swp391.cart.CartObject;
import swp391.customer.CustomerDTO;
import swp391.ordersdetail.OrdersDetailDAO;
import swp391.ordersdetail.OrdersDetailDTO;
import swp391.utils.MyApplicationConstants;

/**
 *
 * @author nguye
 */
@WebServlet(name = "AddToCartServlet", urlPatterns = {"/AddToCartServlet"})
public class AddToCartServlet extends HttpServlet {

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
//        ServletContext context = this.getServletContext();
//        Properties siteMaps = (Properties) context.getAttribute("SITE_MAP");
//        String url = siteMaps.getProperty(
//                MyApplicationConstants.SearchServlet.SEARCH_FILTER_PAGE);

        try {
            //1. Cust go to cart place
            HttpSession session = request.getSession();
            //2. Customer take a cart
            CartObject cart = (CartObject) session.getAttribute("CART");
            if (cart == null) {
                cart = new CartObject();
            }
            //3. Customer takes item
            String id = request.getParameter("txtID");
//            String quantity = request.getParameter("txtQuantity");
            //4. Customer drop items into cart
            cart.addItemToCart(id);
            session.setAttribute("CART", cart);
            
             CustomerDTO user = (CustomerDTO) session.getAttribute("USER");
             if (user != null) {
                        OrdersDetailDAO ordersDetailDAO = new OrdersDetailDAO();
                        List<OrdersDetailDTO> customerOrders = ordersDetailDAO.getCustomerDetailsByCusID(user.getCustomerID());
                        session.setAttribute("USER_SHIPPINGINFO", customerOrders);
                    }
        } catch (NamingException ex) {
            log("AddToCartServlet _ Naming _ " + ex.getMessage());
        } catch (SQLException ex) {
            log("AddToCartServlet _ SQL _ " + ex.getMessage());
        } finally {
            //5. Redirect to online shopping page
//            RequestDispatcher rd = request.getRequestDispatcher(url);
//            rd.forward(request, response);
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
