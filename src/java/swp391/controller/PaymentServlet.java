/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import swp391.customer.CustomerCreateError;
import swp391.orders.OrdersDAO;
import swp391.ordersdetail.OrdersDetailDAO;
import swp391.utils.MyApplicationConstants;

/**
 *
 * @author Duy
 */
@WebServlet(name = "PaymentServlet", urlPatterns = {"/PaymentServlet"})
public class PaymentServlet extends HttpServlet {

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
            throws ServletException, IOException, ParseException, SQLException, NamingException {
        response.setContentType("text/html;charset=UTF-8");
        ServletContext context = this.getServletContext();
        Properties siteMaps = (Properties) context.getAttribute("SITE_MAP");
        String url = siteMaps.getProperty(
                MyApplicationConstants.PaymentServlet.PAYMENT_PAGE);
        HttpSession session = request.getSession();

        //Khai báo parameter của cart trên trang paymentPage đem xuống
        String txtPaymentID = request.getParameter("method");
        String txtShippingID = request.getParameter("location");
        String txtCustomerID = request.getParameter("txtCustomerID");

        CustomerCreateError errors = new CustomerCreateError();
        try {
            if (txtPaymentID == null) {
                errors.setPaymentIDLengthError("Please choose the payment method");
                request.setAttribute("PAYMENT_ERROR", errors);
            } else {
                CartObject cart = (CartObject) request.getSession().getAttribute("CART");
                int paymentID = Integer.parseInt(txtPaymentID);
                if (paymentID == 1 || paymentID == 2) {
                    int customerID = Integer.parseInt(txtCustomerID);
                    int shippingID = Integer.parseInt(txtShippingID);
                    float discount = 0;
                    int status = 0;
                    OrdersDetailDAO ordersDetailDAO = new OrdersDetailDAO();
                    String defaultOrNewShippingInfo = (String) session.getAttribute("defaultOrNewShippingInfo");
                    if (defaultOrNewShippingInfo != null && defaultOrNewShippingInfo.equals("0")) {
                        // Người dùng đã chọn địa chỉ giao hàng mặc định
                        String cusName = "";
                        String cusAddress = "";
                        String cusPhone = "";
                        List<Integer> orderDetails = ordersDetailDAO.addToOrdersDetail(cart, discount, paymentID, shippingID, status, cusName, cusPhone, cusAddress);
                        OrdersDAO ordersDAO = new OrdersDAO();
                        for (Integer orderDetail : orderDetails) {
                            ordersDAO.addToOrders(customerID, orderDetail);
                        }
                    } else {
                        // Người dùng đã thêm thông tin giao hàng mới
                        String firstName = (String) session.getAttribute("firstName");
                        String lastName = (String) session.getAttribute("lastName");
                        String customerAddress = (String) session.getAttribute("customerAddress");
                        String customerPhone = (String) session.getAttribute("customerPhone");
                        List<Integer> orderDetails = ordersDetailDAO.addToOrdersDetail(cart, discount, paymentID, shippingID, status, firstName + " " + lastName, customerPhone, customerAddress);
                        OrdersDAO ordersDAO = new OrdersDAO();
                        for (Integer orderDetail : orderDetails) {
                            ordersDAO.addToOrders(customerID, orderDetail);
                        }
                    }
                    url = siteMaps.getProperty(
                            MyApplicationConstants.PaymentServlet.CHECKOUT_PAGE);
                } else {
                    //Call API PayPal then forward to checkout page
                }
            }
        } catch (NamingException ex) {
            log("PaymentServlet _ Naming _ " + ex.getMessage());
        } catch (SQLException ex) {
            log("PaymentServlet _ SQL _ " + ex.getMessage());
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(PaymentServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PaymentServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NamingException ex) {
            Logger.getLogger(PaymentServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(PaymentServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PaymentServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NamingException ex) {
            Logger.getLogger(PaymentServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
