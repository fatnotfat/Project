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
import java.util.List;
import javax.naming.NamingException;
import swp391.utils.DBHelper;

/**
 *
 * @author Chau Nhat Truong
 */
public class ProductDAO implements Serializable {

    private List<ProductDTO> itemsList;

    public List<ProductDTO> getItemsList() {
        return itemsList;
    }

    public void searchByFilter(float priceFrom, float priceTo, int size)
            throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Select Name, Description, Quantity, Price, Size "
                        + "From Product "
                        + "Where ";

                if (priceFrom >= 0) {
                    sql += " Price >= ?";
                }
                if (priceTo != 0) {
                    sql += " And Price <= ?";
                }
                if (size != 0) {
                    sql += " And Size = ?";
                }
                stm = con.prepareStatement(sql);
                stm.setFloat(1, priceFrom);
                stm.setFloat(2, priceTo);
                stm.setInt(3, size);
                rs = stm.executeQuery();
                while (rs.next()) {
                    String name = rs.getString("Name");
                    String description = rs.getString("Description");
                    int quantity = rs.getInt("Quantity");
                    float price = rs.getFloat("Price");
                    size = rs.getInt("Size");
                    ProductDTO dto = new ProductDTO(
                            name, description, price, quantity, size);
                    if (this.itemsList == null) {
                        this.itemsList = new ArrayList<>();
                    }
                    this.itemsList.add(dto);
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }
}
