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
import swp391.feedback.FeedBackDAO;
import swp391.feedback.FeedBackErrorDTO;
import swp391.utils.MyApplicationConstants;

/**
 *
 * @author nguye
 */
@WebServlet(name = "AddCommentOfProductServlet", urlPatterns = {"/AddCommentOfProductServlet"})
public class AddCommentOfProductServlet extends HttpServlet {

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
                MyApplicationConstants.CommentFeature.PRODUCT_PAGE);
        String customerId = request.getParameter("txtCustomerID");
        String productID = request.getParameter("txtProductID");
        String voting = request.getParameter("txtVoting");
        String comment = request.getParameter("txtComment");
        boolean error = false;
        FeedBackErrorDTO fbError = new FeedBackErrorDTO();

        try {
            if (voting.trim().length() < 1) {
                fbError.setVotingError("You must rating star!!");
                request.setAttribute("FEEDBACK_ERROR_RESULT", "An error occurred while adding your comment!");
                error = true;
            }

            if (comment.trim().length() < 1) {
                fbError.setCommentError("You must input something!!");
                request.setAttribute("FEEDBACK_ERROR_RESULT", "An error occurred while adding your comment!");
                error = true;
            }
            if (error) {
                request.setAttribute("FEEDBACK_ERROR", fbError);
            } else {
                FeedBackDAO dao = new FeedBackDAO();
                boolean result = dao.addComment(Integer.parseInt(productID), Integer.parseInt(customerId), comment, Integer.parseInt(voting));
                if (result) {
                    request.setAttribute("FEEDBACK_SUCCESS", "Your comment was sent successfully!");
                } else {
                    request.setAttribute("FEEDBACK_ERROR_RESULT", "An error occurred while adding your comment!");
                }
            }
        } catch (NamingException ex) {
            log("Add_Comment_Naming" + ex.getMessage());
        } catch (SQLException ex) {
            log("Add_Comment_SQL" + ex.getMessage());
        } catch (ParseException ex) {
            log("Parse_Comment_SQL" + ex.getMessage());
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
