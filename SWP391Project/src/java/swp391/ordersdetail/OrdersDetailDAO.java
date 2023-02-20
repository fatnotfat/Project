/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.ordersdetail;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import javax.naming.NamingException;
import swp391.utils.DBHelper;

/**
 *
 * @author Chau Nhat Truong
 */
public class OrdersDetailDAO implements Serializable {

    public boolean updateShippingID(int shippingID, int ordersDtID)
            throws SQLException, NamingException, ParseException {;
        Connection con = null;
        PreparedStatement stm = null;
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Update OrdersDetail "
                        + "Set ShippingID = ? "
                        + "Where OrdersDtID = ?";
                stm = con.prepareStatement(sql);
                stm.setInt(1, shippingID);
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
