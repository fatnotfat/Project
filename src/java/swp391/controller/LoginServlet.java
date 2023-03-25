/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import swp391.cart.CartDAO;
import swp391.cart.CartDTO;
import swp391.cart.CartObject;
import swp391.category.CategoryDAO;
import swp391.category.CategoryDTO;
import swp391.login.LoginError;
import swp391.customer.CustomerDAO;
import swp391.customer.CustomerDTO;
import swp391.orders.OrdersDAO;
import swp391.orders.OrdersDTO;
import swp391.product.ProductDAO;
import swp391.product.ProductDTO;
import swp391.utils.MyApplicationConstants;

/**
 *
 * @author Chau Nhat Truong
 */
public class LoginServlet extends HttpServlet {

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
                MyApplicationConstants.LoginServlet.LOGIN_PAGE);
        String email = request.getParameter("txtEmail");
        String password = request.getParameter("txtPassword");
        String checkLogged = request.getParameter("create-acc");
        boolean errorFound = false;
        LoginError errors = new LoginError();
        try {
            //Check all user error
            if (email.trim().length() < 1) {
                errorFound = true;
                errors.setEmailLengthError("You can't leave this empty");
            }
            if (password.trim().length() < 1) {
                errorFound = true;
                errors.setPasswordLengthError("You can't leave this empty");
            }
            if (errorFound) {
                //catch error
                request.setAttribute("LOGIN_ERROR", errors);
                //transfer to inform users
            } else {
                //Call Model/DAO ==> new object & call method of that object
                CustomerDAO dao = new CustomerDAO();
//            boolean result = dao.checkLogin(email, password);
                CartDAO cartDao = new CartDAO();
                CartObject cartObject = new CartObject();
                CustomerDTO result = dao.checkLogin(email, password);
                ProductDAO productDao = new ProductDAO();
                CategoryDAO categoryDao = new CategoryDAO();
                if (result == null) {
                    errorFound = true;
                    errors.setLoginFail("Incorrect email or password");
                }
                if (errorFound) {
                    //catch error
                    request.setAttribute("LOGIN_ERROR", errors);
                    //transfer to inform users
                } else {

                    HttpSession session = request.getSession();
                    String url2 = (String) session.getAttribute("uri");
                    OrdersDAO ordersDAO = new OrdersDAO();
                    List<OrdersDTO> customerOrders = ordersDAO.getCustomerShippingInFoByCusID(result.getCustomerID());
                    session.setAttribute("USER_SHIPPINGINFO", customerOrders);

                    if (url2 == null) {
                        url = siteMaps.getProperty(
                                MyApplicationConstants.LoginServlet.MAIN_PAGE);
                        session.setAttribute("USER", result);
//                        String sessionid = session.getId();
//                        session.setAttribute("USER_SESSION_ID", sessionid);
                        List<CartDTO> list = cartDao.getCart(result.getCustomerID());
                        if (list != null) {
                            cartObject.insertToCartUser(list);
                        }
                        session.setAttribute("CART", cartObject);

                        //get newest product
                        List<ProductDTO> productList = productDao.getNewestProduct();
                        session.setAttribute("NEWEST_PRODUCT", productList);
                        List<ProductDTO> productList2 = productDao.getSecondNewestProduct();
                        session.setAttribute("SECOND_NEWEST_PRODUCT", productList2);
                        List<CategoryDTO> categoryList = categoryDao.getListCategory();
                        session.setAttribute("CATEGORY", categoryList);
                        if (checkLogged != null) {
                            email = URLEncoder.encode(email, "UTF-8");
                            Cookie cookie = new Cookie(email, password);
                            cookie.setMaxAge(60 * 99999);
                            response.addCookie(cookie);
                        }//check if user want to logged for next access
                    } else {
                        String latestPart = url2.substring(url2.lastIndexOf("/") + 1);
                        url = latestPart;
                        session.setAttribute("USER", result);
                        List<CartDTO> list = cartDao.getCart(result.getCustomerID());
                        if (list != null) {
                            cartObject.insertToCartUser(list);
                        }
                        session.setAttribute("CART", cartObject);

                        //get newest product
                        List<ProductDTO> productList = productDao.getNewestProduct();
                        session.setAttribute("NEWEST_PRODUCT", productList);
                        List<ProductDTO> productList2 = productDao.getSecondNewestProduct();
                        session.setAttribute("SECOND_NEWEST_PRODUCT", productList2);
                        List<CategoryDTO> categoryList = categoryDao.getListCategory();
                        session.setAttribute("CATEGORY", categoryList);
                        if (checkLogged != null) {
                            email = URLEncoder.encode(email, "UTF-8");
                            Cookie cookie = new Cookie(email, password);
                            cookie.setMaxAge(60 * 99999);
                            response.addCookie(cookie);

                        }//check if user want to logged for next access
                    }

                }
            }//end user is existed
        } catch (NamingException ex) {
            log("LoginServlet _ Naming _ " + ex.getMessage());
        } catch (SQLException ex) {
            log("LoginServlet _ SQL _ " + ex.getMessage());
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
