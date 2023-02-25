/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.ordersdetail;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import javax.naming.NamingException;
import swp391.utils.DBHelper;

/**
 *
 * @author Chau Nhat Truong
 */
public class OrdersDetailDAO implements Serializable {

    public int addToOrdersDetail(int productID)
            throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        int key = 0;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Insert Into OrdersDetail("
                        + "ProductID, Quantity, Discount, Price, PaymentID, "
                        + "ShippingID, Total, Status"
                        + ") "
                        + "Values("
                        + " ?, ?, ?, ?, ?, ?, ?, ?"
                        + ")";
                stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                stm.setInt(1, productID);
                int effectedRows = stm.executeUpdate();
                rs = stm.getGeneratedKeys();
                if (rs.next()) {
                    key = rs.getInt(1);
                }
                while (effectedRows > 0) {
                    return key;
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
        return key;
    }

    public boolean updateShippingID(int shippingID, int productID)
            throws SQLException, NamingException, ParseException {;
        Connection con = null;
        PreparedStatement stm = null;
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Update OrdersDetail "
                        + "Set ShippingID = ? "
                        + "Where productID = ?";
                stm = con.prepareStatement(sql);
                stm.setInt(1, shippingID);
                stm.setInt(2, productID);
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

    public boolean updatePaymentID(int paymentID, int ordersDtID)
            throws SQLException, NamingException, ParseException {;
        Connection con = null;
        PreparedStatement stm = null;
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Update OrdersDetail "
                        + "Set PaymentID = ? "
                        + "Where OrdersDtID = ?";
                stm = con.prepareStatement(sql);
                stm.setInt(1, paymentID);
                stm.setInt(2, ordersDtID);
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
