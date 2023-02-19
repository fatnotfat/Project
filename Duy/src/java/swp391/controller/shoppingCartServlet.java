/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import swp391.ordersDetail.OrdersDetailDAO;

/**
 *
 * @author Duy
 */
public class shoppingCartServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           HttpSession session = request.getSession(false);
            if (session != null) {
                String name = (String) session.getAttribute("name");
                String email = (String) session.getAttribute("email");
                HashMap<String, Integer> cart = (HashMap<String, Integer>) session.getAttribute("cart");
                if (cart != null && !cart.isEmpty()) {
                    if (name == null || name.equals("")) {
                        request.setAttribute("WARNING", "You must login to finish the shopping");
                        request.getRequestDispatcher("shoppingCart.jsp").forward(request, response);
                    } else {
                        boolean result = OrdersDetailDAO.insertOrder(email, cart);
                        if (result) {
                            session.setAttribute("cart", null);
                            request.setAttribute("WARNING", "save your cart sucessfully");
                            request.getRequestDispatcher("shoppingCart.jsp").forward(request, response);
                        } else {
                            request.setAttribute("WARNING", "these products are out of stock");
                            request.getRequestDispatcher("shoppingCart.jsp").forward(request, response);
                        }
                    }
                } else {
                    request.setAttribute("WARNING", "your cart is empty");
                    request.getRequestDispatcher("shoppingCart.jsp").forward(request, response);
                }
            } else {
                response.sendRedirect("index.jsp");
            }
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
