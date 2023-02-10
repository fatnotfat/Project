///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package swp391.controller;
//
//import java.io.IOException;
//import java.sql.SQLException;
//import java.util.Properties;
//import javax.naming.NamingException;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import swp391.registration.RegistrationDAO;
//import swp391.registration.RegistrationUpdateError;
//import swp391.utils.MyApplicationConstants;
//
///**
// *
// * @author Chau Nhat Truong
// */
//@WebServlet(name = "UpdateAccountServlet", urlPatterns = {"/UpdateAccountServlet"})
//public class UpdateAccountServlet extends HttpServlet {
//
////    private final String ERROR_PAGE = "errors.html";
//    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//
//        String username = request.getParameter("txtUsername");
//        String password = request.getParameter("txtPassword");
//        String isAdmin = request.getParameter("chkAdmin");
//        boolean role = false;
//        if (isAdmin != null) {
//            role = true;
//        }
//        String searchValue = request.getParameter("lastSearchValue");
////        String url = ERROR_PAGE;
//        ServletContext context = this.getServletContext();
//        Properties siteMaps = (Properties) context.getAttribute("SITE_MAP");
//        String url = siteMaps.getProperty(
//                MyApplicationConstants.UpdateAccountServlet.ERROR_PAGE);
//        RegistrationUpdateError error = new RegistrationUpdateError();
//        boolean errorFound = false;
//        try {
//            //1. Check all user error
//            if (password.trim().length() < 6 || password.trim().length() > 30) {
//                errorFound = true;
//                error.setPasswordLengthError(
//                        "Password is required update from 6 to 30 characters");
//            }
//            if (errorFound) {
//                request.setAttribute("UPDATE_ERROR", error);
//                url = "SearchLastnameServlet"
//                        + "?txtSearchValue=" + searchValue;
//            } else {
//                //2. Call DAO
//                RegistrationDAO dao = new RegistrationDAO();
//                boolean result = dao.updateAccount(username, password, role);
//                //3. refresh data grid --> call search
//                if (result) {
//                    url = "SearchLastnameServlet"
//                            + "?txtSearchValue=" + searchValue;
//                }
//            }//end update is successful 
//        } catch (SQLException ex) {
////            ex.printStackTrace();
//            log("UpdateAccountServlet _ SQL _ " + ex.getMessage());
//        } catch (NamingException ex) {
////            ex.printStackTrace();
//            log("UpdateAccountServlet _ Naming _ " + ex.getMessage());
//        } finally {
////            response.sendRedirect(url);
//            RequestDispatcher rd = request.getRequestDispatcher(url);
//            rd.forward(request, response);
//        }
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}
