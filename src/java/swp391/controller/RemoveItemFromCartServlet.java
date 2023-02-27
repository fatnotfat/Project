/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import swp391.cart.CartObject;
import com.google.gson.Gson;
import java.sql.SQLException;
import javax.naming.NamingException;
import swp391.cart.CartDAO;
import swp391.customer.CustomerDTO;

/**
 *
 * @author nguye
 */
@WebServlet(name = "RemoveItemFromCartServlet", urlPatterns = {"/RemoveItemFromCartServlet"})
public class RemoveItemFromCartServlet extends HttpServlet {

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
        String id = request.getParameter("txtId");
        if (id != null && !id.isEmpty()) {
            HttpSession session = request.getSession();
            CartObject cart = (CartObject) session.getAttribute("CART");
            CartDAO dao = new CartDAO();
            CustomerDTO cusDTO = (CustomerDTO) session.getAttribute("USER");
            try {
                if (cart.getItems().remove(id) != null) {
                    cart.getItemDetail().remove(id);
                    session.setAttribute("CART", cart);
                    if (cusDTO != null) {
                        if (dao.checkProduct(cusDTO.getCustomerID(), Integer.parseInt(id))) {
                            dao.removeProduct(cusDTO.getCustomerID(), Integer.parseInt(id));
                        }
                    }
                    // return a success response with the updated cart data
                }
            } catch (NamingException ex) {
                log("RemoveItemFromCartServlet _ NamingException _ " + ex.getMessage());
            } catch (SQLException ex) {
                log("RemoveItemFromCartServlet _ SQLException _ " + ex.getMessage());
            } finally {
                Gson gson = new Gson();
                String cartJson = gson.toJson(cart);
                response.setContentType("application/json");
                response.setCharacterEncoding("UTF-8");
                response.getWriter().write("{\"success\": true, \"cart\": " + cartJson + "}");
            }
        } else {
            // return a failure response if the item was not found in the cart
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write("{\"success\": false, \"message\": \"Item not found in cart\"}");
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
