/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.shippingmethod;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import swp391.utils.DBHelper;

/**
 *
 * @author Duy
 */
public class ShippingMethodDAO {

    public ShippingMethodDTO getListShippingMethod() {
        ShippingMethodDTO shippingInfo = null;
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DBHelper.makeConnection();
            // Thực thi câu truy vấn
            stmt = conn.createStatement();
            String sql = "SELECT ShippingID, NameOfMethod, TransportFee FROM ShippingMethod";
            ResultSet rs = stmt.executeQuery(sql);
            // Xử lý kết quả
            if (rs.next()) {
                shippingInfo = new ShippingMethodDTO();
                shippingInfo.setShippingID(rs.getInt("ShippingID"));
                shippingInfo.setNameOfMethod(rs.getString("NameOfMethod"));
                shippingInfo.setTransportFee(rs.getFloat("TransportFee"));
            }

            // Giải phóng tài nguyên
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return shippingInfo;
    }
    
    
    
    public ArrayList<ShippingMethodDTO> getListShippingMethodGPT() {
    ArrayList<ShippingMethodDTO> shippingList = new ArrayList<>();
    Connection conn = null;
    Statement stmt = null;
    try {
        conn = DBHelper.makeConnection();
        // Thực thi câu truy vấn
        stmt = conn.createStatement();
        String sql = "SELECT ShippingID, NameOfMethod, TransportFee FROM ShippingMethod";
        ResultSet rs = stmt.executeQuery(sql);
        // Xử lý kết quả
        while (rs.next()) {
            ShippingMethodDTO shippingInfo = new ShippingMethodDTO();
            shippingInfo.setShippingID(rs.getInt("ShippingID"));
            shippingInfo.setNameOfMethod(rs.getString("NameOfMethod"));
            shippingInfo.setTransportFee(rs.getFloat("TransportFee"));
            shippingList.add(shippingInfo);
        }

        // Giải phóng tài nguyên
        rs.close();
        stmt.close();
        conn.close();
    } catch (SQLException se) {
        se.printStackTrace();
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException se2) {
        }
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
    return shippingList;
}

}
