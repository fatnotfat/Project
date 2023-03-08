/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.controller;

import java.io.IOException;
import java.net.URLDecoder;
import java.sql.SQLException;
import java.util.List;
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
import swp391.product.ProductDAO;
import swp391.product.ProductDTO;
import swp391.utils.MyApplicationConstants;

/**
 *
 * @author Chau Nhat Truong
 */
@WebServlet(name = "LogoutServlet", urlPatterns = {"/LogoutServlet"})
public class LogoutServlet extends HttpServlet {

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
                MyApplicationConstants.LogoutServlet.MAIN_PAGE);
        try {
            HttpSession session = request.getSession(true);
//            if (session != null) {
//                CustomerDTO result = (CustomerDTO) session.getAttribute("USER");
//                if (result != null) {
//                    username = result.getEmail();
//                }
//                session.invalidate();
//            }//end of destroy session 
//            Cookie cookies[] = request.getCookies();
//            if (cookies != null) {
//                for (Cookie ck : cookies) {
//                    if (ck.getName().equals(username)) {
//                        cookie = new Cookie(username, "");
//                        cookie.setMaxAge(0);
//                        response.addCookie(cookie);
//                    }//end of destroy cookie
//                }//end of traverse cookie
//            }//end of user is logout
//        } finally {
//            response.sendRedirect(url);
//        }
            Cookie[] cookies = request.getCookies();
            for (Cookie cookie : cookies) {
                String username = cookie.getName();
                String email = URLDecoder.decode(username, "UTF-8");
                String password = cookie.getValue();
                //Call DAO 
                CustomerDAO dao = new CustomerDAO();
                CustomerDTO dto = dao.checkLogin(email, password);
                if (dto != null) {
                    //end session
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                }   
            }
            session.invalidate();
            session = request.getSession(true);
            ProductDAO productDao = new ProductDAO();
            List<ProductDTO> productList = productDao.getNewestProduct();
            session.setAttribute("NEWEST_PRODUCT", productList);
            List<ProductDTO> productList2 = productDao.getSecondNewestProduct();
            session.setAttribute("SECOND_NEWEST_PRODUCT", productList2);
        } catch (SQLException ex) {
            log("LogoutServlet_SQLException:" + ex.getMessage());
        } catch (NamingException ex) {
            log("LogoutServlet_NamingException:" + ex.getMessage());
        }finally{
            response.sendRedirect(url);
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
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
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
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>

    }
