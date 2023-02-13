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

    public void searchByFilter(String name, float priceFrom, float priceTo, int size, int category)
            throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Select * "
                        + "From Product "
                        + "Where Name Like ?";

                if (priceFrom != 0) {
                    sql += " And Price >= ?";
                }
                if (priceTo != 0) {
                    sql += " And Price <= ?";
                }
                if (size != 0) {
                    sql += " And Size = ?";
                }
                if (category != 0) {
                    sql += " And CateID = ?";
                }
                stm = con.prepareStatement(sql);
                stm.setString(1, name);
                stm.setFloat(2, priceFrom);
                stm.setFloat(3, priceTo);
                stm.setInt(4, size);
                stm.setInt(5, category);
                rs = stm.executeQuery();
                while (rs.next()) {
                    //get field/column
                    name = rs.getString("name");
                    priceFrom = rs.getFloat("priceFrom");
                    priceTo = rs.getFloat("priceTo");
                    size = rs.getInt("size");
                    category = rs.getInt("category");
                    ProductDTO dto = new ProductDTO(
                            name, priceFrom, priceTo, size, category);
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
