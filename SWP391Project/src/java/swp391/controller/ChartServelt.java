package swp391.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Base64;
import java.util.List;
import javax.naming.NamingException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.labels.StandardPieToolTipGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import swp391.dashboard.ProductDAO;
import swp391.dashboard.ProductDTO;

/**
 *
 * @author User
 */
public class ChartServelt extends HttpServlet {

    private static final long serialVersionUID = 1L;

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

        try {
            ProductDAO dao = new ProductDAO();

            dao.getTop10Products();

            List<ProductDTO> top10Products = dao.getItemsList();
            // Create a dataset
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            for (ProductDTO product : top10Products) {
                dataset.addValue((Number) product.getQuantity(), product.getProductID(), "");
            }
            // Create a chart
            JFreeChart chart = ChartFactory.createBarChart(
                    "Top 10 Products",
                    "Product ID",
                    "Sales",
                    dataset,
                    PlotOrientation.VERTICAL,
                    true,
                    true,
                    false);

            // Customize the chart
            chart.getTitle().setFont(new Font("SansSerif", Font.BOLD, 18));
            chart.setBackgroundPaint(Color.WHITE);

            // Generate a PNG image of the chart
            byte[] chartImage = ChartUtils.encodeAsPNG(chart.createBufferedImage(600, 400));

            // Store the chart image as a Base64-encoded string in a request attribute
            String base64EncodedChart = Base64.getEncoder().encodeToString(chartImage);
            request.setAttribute("base64EncodedChart", base64EncodedChart);

            DefaultPieDataset dataset2 = new DefaultPieDataset();
            dataset2.setValue("Sales Q1", new Double(20));
            dataset2.setValue("Sales Q2", new Double(30));
            dataset2.setValue("Sales Q3", new Double(40));
            dataset2.setValue("Sales Q4", new Double(10));

            JFreeChart chart2 = ChartFactory.createPieChart(
                    "Quarterly Sales", // chart title
                    dataset2, // data
                    true, // include legend
                    true, // tooltips
                    false // URLs
            );

            chart.getTitle().setFont(new Font("SansSerif", Font.BOLD, 18));
            chart.setBackgroundPaint(Color.WHITE);

            PiePlot plot = (PiePlot) chart2.getPlot();
            plot.setToolTipGenerator(new StandardPieToolTipGenerator("{0}: {1}"));

            byte[] chartImage2 = ChartUtils.encodeAsPNG(chart2.createBufferedImage(600, 400));

            String base64EncodedChart2 = Base64.getEncoder().encodeToString(chartImage2);
            request.setAttribute("base64EncodedChart1", base64EncodedChart2);
            // Forward the request to the JSP page

        } catch (NamingException ex) {
            log("Naming" + ex.getMessage());
        } catch (SQLException ex) {
            log("SQL" + ex.getMessage());
        } finally {
            RequestDispatcher dispatcher = request.getRequestDispatcher("chart.jsp");
            dispatcher.forward(request, response);
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
