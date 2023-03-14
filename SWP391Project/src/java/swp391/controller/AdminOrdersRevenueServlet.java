/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
import swp391.orders.OrdersDAO;
import swp391.orders.OrdersDTO;
import swp391.utils.MyApplicationConstants;

/**
 *
 * @author Chau Nhat Truong
 */
@WebServlet(name = "AdminOrdersRevenueServlet", urlPatterns = {"/AdminOrdersRevenueServlet"})
public class AdminOrdersRevenueServlet extends HttpServlet {

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
                MyApplicationConstants.AdminOrdersRevenueServlet.ADMIN_PAGE);
        String date = request.getParameter("txtDate");
        try {
            if (date == null) {
                OrdersDAO dao1 = new OrdersDAO();
                dao1.showOrdersRevenueByMonth();
                List<OrdersDTO> result1 = dao1.getOrdersList1();
                request.setAttribute("MONTHREVENUE_RESULT", result1);

                OrdersDAO dao2 = new OrdersDAO();
                dao2.showOrdersRevenueByYear();
                List<OrdersDTO> result2 = dao2.getOrdersList2();
                request.setAttribute("YEARREVENUE_RESULT", result2);
                
                OrdersDAO dao3 = new OrdersDAO();
                dao3.showOrdersRevenueByMonth();
                List<OrdersDTO> result3 = dao3.getOrdersList3();
                request.setAttribute("TOTALORDERSINMONTH_RESULT", result3);
                
                OrdersDAO dao4 = new OrdersDAO();
                dao4.showTotalOrdersByYear();
                List<OrdersDTO> result4 = dao4.getOrdersList4();
                request.setAttribute("TOTALORDERSINYEAR_RESULT", result4);

                url = siteMaps.getProperty(
                        MyApplicationConstants.AdminOrdersRevenueServlet.ADMIN_PAGE);
            } else {
                date += "-01";
                LocalDate dateSep = LocalDate.parse(
                        date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                int year = dateSep.getYear();
                int month = dateSep.getMonthValue();
                
                OrdersDAO dao1 = new OrdersDAO();
                dao1.showOrdersRevenueByMonthAndYear(year, month);
                List<OrdersDTO> result1 = dao1.getOrdersList1();
                if (result1 == null) {
                    dao1.showOrdersRevenueByMonth();
                    result1 = dao1.getOrdersList1();
                    request.setAttribute("MONTHREVENUE_RESULT", result1);

                    OrdersDAO dao2 = new OrdersDAO();
                    dao2.showOrdersRevenueByYear();
                    List<OrdersDTO> result2 = dao2.getOrdersList2();
                    request.setAttribute("YEARREVENUE_RESULT", result2);

                    url = siteMaps.getProperty(
                            MyApplicationConstants.AdminOrdersRevenueServlet.ADMIN_PAGE);
                } else {
                    request.setAttribute("MONTHREVENUE_RESULT", result1);
                    OrdersDAO dao2 = new OrdersDAO();
                    dao2.showOrdersRevenueByYear();
                    List<OrdersDTO> result2 = dao2.getOrdersList2();
                    request.setAttribute("YEARREVENUE_RESULT", result2);

                    url = siteMaps.getProperty(
                            MyApplicationConstants.AdminOrdersRevenueServlet.ADMIN_PAGE);
                }
            }
        } catch (NamingException ex) {
            log("AdminOrdersRevenueServlet _ Naming _ " + ex.getMessage());
        } catch (SQLException ex) {
            log("AdminOrdersRevenueServlet _ SQL _ " + ex.getMessage());
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
