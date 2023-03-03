/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.product;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

    public void showProduct()
            throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Select ProductID, Name, "
                        + "Description, Quantity, Price, Status, Size "
                        + "From Product";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()) {
                    int productID = rs.getInt("ProductID");
                    String name = rs.getString("Name");
                    String description = rs.getString("Description");
                    int quantity = rs.getInt("Quantity");
                    float price = rs.getInt("Price");
                    boolean status = rs.getBoolean("Status");
                    int size = rs.getInt("Size");
                    ProductDTO dto = new ProductDTO(productID,
                            name, description, quantity, price, status, size);
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

    public void searchProduct(String searchValue)
            throws SQLException, NamingException {;
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Select ProductID, Name, Description, "
                        + "Quantity, Price, Status, Size "
                        + "From Product "
                        + "Where Name like ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, "%" + searchValue + "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    int productID = rs.getInt("ProductID");
                    String name = rs.getString("Name");
                    String description = rs.getString("Description");
                    int quantity = rs.getInt("Quantity");
                    float price = rs.getInt("Price");
                    boolean status = rs.getBoolean("Status");
                    int size = rs.getInt("Size");
                    ProductDTO dto = new ProductDTO(productID, name, description,
                            quantity, price, status, size);
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

    public boolean createProduct(ProductDTO dto)
            throws SQLException, NamingException {;
        Connection con = null;
        PreparedStatement stm = null;
        long milis = System.currentTimeMillis();
        Date date = new Date(milis);
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Insert Into Product("
                        + "Name, Description, Quantity, Price, Status, Size, "
                        + "CreateTime, CateID, BrandID"
                        + ") "
                        + "Values(?, ?, ?, ?, 1, ?, ?, ?, ?"
                        + ")";
                stm = con.prepareStatement(sql);
                stm.setString(1, dto.getName());
                stm.setString(2, dto.getDescription());
                stm.setInt(3, dto.getQuantity());
                stm.setFloat(4, dto.getPrice());
                stm.setInt(5, dto.getSize());
                stm.setDate(6, date);
                stm.setInt(7, dto.getCateID());
                stm.setInt(8, dto.getBrandID());
                int effectedRows = stm.executeUpdate();
                if (effectedRows > 0) {
                    result = true;
                }
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return result;
    }

    public boolean updateProduct(int productID, String name, String description, int quantity,
            float price, boolean status, int size)
            throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            String sql = "Update Product "
                    + "Set Name = ?, Description = ?, Quantity = ?, Price = ?, "
                    + "Status = ?, Size = ? "
                    + "Where ProductID = ?";
            stm = con.prepareStatement(sql);
            stm.setString(1, name);
            stm.setString(2, description);
            stm.setInt(3, quantity);
            stm.setFloat(4, price);
            stm.setBoolean(5, status);
            stm.setInt(6, size);
            stm.setInt(7, productID);
            int effectedRows = stm.executeUpdate();
            if (effectedRows > 0) {
                result = true;
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return result;
    }

    public boolean deleteProduct(int productID)
            throws SQLException, NamingException {;
        Connection con = null;
        PreparedStatement stm = null;
        boolean result = false;
        try {
            //1. connect DB
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Update Product "
                        + "Set Status = false "
                        + "Where ProductID = ?";
                stm = con.prepareStatement(sql);
                stm.setInt(1, productID);
                int effectedRows = stm.executeUpdate();
                if (effectedRows > 0) {
                    result = true;
                }
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return result;
    }
}
