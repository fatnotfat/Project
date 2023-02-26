/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.controller;

import java.io.IOException;
import java.net.URLDecoder;
import java.sql.SQLException;
import java.util.Properties;
import javax.naming.NamingException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import swp391.customer.CustomerDAO;
import swp391.customer.CustomerDTO;
import swp391.utils.MyApplicationConstants;

/**
 *
 * @author Chau Nhat Truong
 */
@WebServlet(name = "FisrtTimeRequestServlet", urlPatterns = {"/FisrtTimeRequestServlet"})
public class FisrtTimeRequestServlet extends HttpServlet {

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
        try {
//            //end session before login
            HttpSession session = request.getSession(true);
            session.invalidate();
            //Get cookies
            Cookie[] cookies = request.getCookies();
            //Read last cookies
            if (cookies != null) {
//                Cookie lastCookies = cookies[cookies.length - 1];
                for (Cookie cookie : cookies) {
                    String email = cookie.getName();
                    email = URLDecoder.decode(email, "UTF-8");
                    String password = cookie.getValue();
                    //Call DAO to checkLogin
                    CustomerDAO dao = new CustomerDAO();
                    CustomerDTO result = dao.checkLogin(email, password);

                    //Process
                    if (result != null) {
//                        url = siteMaps.getProperty(
//                                MyApplicationConstants.FirstTimeRequestServlet.MAIN_PAGE);
                        session = request.getSession(true);
                        session.setAttribute("USER", result);
                        break;
                    }//end user has existed
                }
            }//end cookies has existed
        } catch (SQLException ex) {
            log("FirstTimeRequestServlet _ SQL _ " + ex.getMessage());
        } catch (NamingException ex) {
            log("FirstTimeRequestServlet _ Naming _ " + ex.getMessage());
        } finally {
            response.sendRedirect(url);
            //cái nào cũng được vì trình duyệt hỗ trợ hàm lưu cookie nên send Redirect 
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
