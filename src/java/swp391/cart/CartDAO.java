/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.cart;

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
 * @author nguye
 */
public class CartDAO implements Serializable {

    
    
    
    public boolean insertCart(int customerID, int productID, int quantity, Date createTime)
            throws NamingException, SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "INSERT INTO Cart(CustomerID, ProductID, Quantity, CreateTime"
                        + ") "
                        + "VALUES(?,?,?,?"
                        + ")";
                stm = con.prepareStatement(sql);
                stm.setInt(1, customerID);
                stm.setInt(2, productID);
                stm.setInt(3, quantity);
                java.sql.Date sqlDate = new java.sql.Date(createTime.getTime());
                stm.setDate(4, sqlDate);

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

    public boolean checkProduct(int customerID, int productID)
            throws NamingException, SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "SELECT CustomerID, ProductID, Quantity, CreateTime "
                        + "FROM Cart "
                        + "WHERE CustomerID = ? AND ProductID = ?";
                stm = con.prepareStatement(sql);
                stm.setInt(1, customerID);
                stm.setInt(2, productID);

                rs = stm.executeQuery();
                while (rs.next()) {
                    result = true;
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
        return result;
    }

    public boolean updateCart(int customerID, int productID, int quantity) 
            throws NamingException, SQLException{
        Connection con = null;
        PreparedStatement stm = null;
        int effectedRow = 0;
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Update Cart "
                        + "SET Quantity = ? "
                        + "WHERE CustomerID = ? AND ProductID = ?";
                stm = con.prepareStatement(sql);
                stm.setInt(1, quantity);
                stm.setInt(2, customerID);
                stm.setInt(3, productID);
                effectedRow = stm.executeUpdate();
                if(effectedRow > 0){
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
    
    public boolean removeProduct(int customerID, int productID) 
            throws NamingException, SQLException{
        Connection con = null;
        PreparedStatement stm = null;
        int effectedRow = 0;
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "DELETE FROM Cart "
                        + "WHERE CustomerID = ? AND ProductID = ?";
                stm = con.prepareStatement(sql);
                stm.setInt(1, customerID);
                stm.setInt(2, productID);
                effectedRow = stm.executeUpdate();
                if(effectedRow > 0){
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
    
    public List<CartDTO> getCart(int customerID)
            throws NamingException, SQLException{
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<CartDTO> productList = null;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "SELECT CustomerID, ProductID, Quantity, CreateTime "
                        + "FROM Cart "
                        + "WHERE CustomerID = ?";
                stm = con.prepareStatement(sql);
                stm.setInt(1, customerID);
                rs = stm.executeQuery();
                while(rs.next()){
                    int productID = rs.getInt("ProductID");
                    int quantity = rs.getInt("Quantity");
                    
                    if(productList == null){
                        productList = new ArrayList<>();
                    }
                    productList.add(new CartDTO(productID, quantity));
                }
            }
        } finally {
            if (rs != null){
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return productList;
    }
}
