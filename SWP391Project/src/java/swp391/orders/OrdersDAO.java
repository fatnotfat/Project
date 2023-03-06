/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.orders;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;
import swp391.utils.DBHelper;

/**
 *
 * @author Chau Nhat Truong
 */
public class OrdersDAO implements Serializable {

    public boolean addToOrders(int customerID, int key)
            throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        long milis = System.currentTimeMillis();
        Date date = new Date(milis);
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Insert Into Orders("
                        + " CustomerID, DateOrders, OrdersDtID"
                        + ") "
                        + "Values("
                        + " ?, ?, ?"
                        + ")";
                stm = con.prepareStatement(sql);
                stm.setInt(1, customerID);
                stm.setDate(2, date);
                stm.setInt(3, key);
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

    private List<OrdersDTO> ordersList;

    public List<OrdersDTO> getOrdersList() {
        return ordersList;
    }

    public void showOrders(int ordersID)
            throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Select OrdersID, CustomerID, DateOrders "
                        + "From Orders "
                        + "Where OrdersID = ?";
                stm = con.prepareStatement(sql);
                stm.setInt(1, ordersID);
                rs = stm.executeQuery();
                while (rs.next()) {
                    ordersID = rs.getInt("OrdersID");
                    int customerID = rs.getInt("CustomerID");
                    Date dateOrders = rs.getDate("DateOrders");
                    OrdersDTO dto = new OrdersDTO(ordersID, customerID, dateOrders);
                    if (this.ordersList == null) {
                        this.ordersList = new ArrayList<>();
                    }
                    this.ordersList.add(dto);
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

    public void searchOrdersByDate(Date dateFrom, Date dateTo)
            throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Select OrdersID, CustomerID, DateOrders "
                        + "From Orders "
                        + "Where DateOrders Between ? And ? ";
                stm = con.prepareStatement(sql);
                stm.setDate(1, dateFrom);
                stm.setDate(2, dateTo);
                rs = stm.executeQuery();
                while (rs.next()) {
                    int ordersId = rs.getInt("OrdersID");
                    int customerID = rs.getInt("CustomerID");
                    Date dateOrders = rs.getDate("DateOrders");
                    OrdersDTO dto = new OrdersDTO(ordersId, customerID, dateOrders);
                    if (this.ordersList == null) {
                        this.ordersList = new ArrayList<>();
                    }
                    this.ordersList.add(dto);
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