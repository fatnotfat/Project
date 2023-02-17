/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author nguye
 */
public class ProductDAODemo {



    private String jdbcURL = "jdbc:sqlserver://localhost:1433;databaseName=SWP391";
    private String jdbcUsername = "sa";
    private String jdbcPassword = "12345";

    private static final String SELECT_ALL_PRODUCTS = "SELECT * FROM Product";
    private static final String SELECT_PRODUCTS_BY_PAGE = "SELECT * FROM "
            + "(SELECT ROW_NUMBER() OVER (ORDER BY ProductID) as row_num, "
            + "ProductID, Name, Price, Description FROM Product) as products_pagination "
            + "WHERE row_num BETWEEN ? AND ?";

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public List<ProductDTO> getAllProducts() {
        List<ProductDTO> products = new ArrayList<ProductDTO>();
        try (Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCTS);) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int productId = rs.getInt("ProductID");
                String productName = rs.getString("Name");
                float price = rs.getFloat("Price");
                String description = rs.getString("Description");
                products.add(new ProductDTO(productId, productName, price, description));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    public List<ProductDTO> getProductsByPage(int pageNumber, int pageSize) {
        List<ProductDTO> products = new ArrayList<ProductDTO>();
        int start = (pageNumber - 1) * pageSize + 1;
        int end = pageNumber * pageSize;
        try (Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUCTS_BY_PAGE);) {
            preparedStatement.setInt(1, start);
            preparedStatement.setInt(2, end);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int productId = rs.getInt("ProductID");
                String productName = rs.getString("Name");
                float price = rs.getFloat("Price");
                String description = rs.getString("Description");
                products.add(new ProductDTO(productId, productName, price, description));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }


}
