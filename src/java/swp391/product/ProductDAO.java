/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.product;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.naming.NamingException;
import swp391.utils.DBHelper;

/**
 *
 * @author Duy
 */
public class ProductDAO implements Serializable {

    public static ArrayList<ProductDTO> getProductList() throws SQLException, NamingException {

        Connection con = null;
        ResultSet rs = null;
        PreparedStatement statement = null;
        ArrayList<ProductDTO> productList = new ArrayList<>();

        try {
            con = DBHelper.makeConnection();
            String sql = "SELECT productID, name, description, quantity, price, status, size, createTime FROM product";

            if (con != null) {
                statement = con.prepareStatement(sql);
                rs = statement.executeQuery();
            }
            if (rs != null) {
                while (rs.next()) {
                    int productID = rs.getInt("productID");
                    String name = rs.getString("name");
                    String description = rs.getString("description");
                    int quantity = rs.getInt("quantity");
                    double price = rs.getDouble("price");
                    String status = rs.getString("status");
                    String size = rs.getString("size");
                    Date createTime = rs.getDate("createTime");

                    ProductDTO productDTO = new ProductDTO(productID, name, description, quantity, price, status, size, createTime);
                    productList.add(productDTO);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        } 
        finally {
            if (statement != null) {
                statement.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return productList;
    }

}
