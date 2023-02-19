/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.controller;

import com.google.gson.Gson;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import swp391.product.ProductDAO;
import swp391.product.ProductDTO;
import swp391.utils.MyApplicationConstants;

/**
 *
 * @author nguye
 */
public class SearchTextServlet extends HttpServlet {

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
                MyApplicationConstants.SearchServlet.SEARCH_TEXT_PAGE);
        String searchValue = request.getParameter("txtSearch");
        String indexPage = request.getParameter("index");
        if(indexPage == null){
            indexPage = "1";
        }
        int index = Integer.parseInt(indexPage);
        
        try {
            if (searchValue.trim().length() > 0) {
                //Call DAO
                ProductDAO dao = new ProductDAO();
                int size = dao.searchProduct(searchValue);
                List<ProductDTO> list = dao.getListProduct();
                request.setAttribute("PRODUCT_RESULT", list);
                
                //paging 
                int recordsPerPage = 5;
                int endPage = 0;
                    endPage = size / recordsPerPage;
                if(size % recordsPerPage != 0){
                    endPage++;
                }              
                
                List<ProductDTO> pagingList = dao.pagingAccount(index, searchValue, recordsPerPage);
                request.setAttribute("PAGING_RESULT", pagingList);
                request.setAttribute("END_PAGE", endPage);  
                request.setAttribute("CURRENT_PAGE", index);
//                //pagination
//                int page = 1;
//                int recordsPerPage = 5;
//                if (request.getParameter("page") != null) {
//                    page = Integer.parseInt(request.getParameter("page"));
//                }
//                List<ProductDTO> paginationList = dao.getProducts((page - 1) * recordsPerPage, recordsPerPage);
//                int noOfRecords = dao.searchProduct(searchValue);
//                int noOfPages = (int) Math.ceil(noOfRecords * 1.0 / recordsPerPage);
//                request.setAttribute("productList", list);
//                request.setAttribute("noOfPages", noOfPages);
//                request.setAttribute("currentPage", page);
//
//                response.setContentType("application/json");
//                response.setCharacterEncoding("UTF-8");
//                response.getWriter().write(new Gson().toJson(list));
//                //end pagination
                  

            }
        } 
//        catch (IOException ex) {
//            log("IOException :" + ex.getMessage());
//        } 
        catch (NumberFormatException ex) {
            log("NumberFormatException :" + ex.getMessage());
        } catch (NamingException ex) {
            log("Naming exception :" + ex.getMessage());
        } catch (SQLException ex) {
            log("SQL exception :" + ex.getMessage());
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
