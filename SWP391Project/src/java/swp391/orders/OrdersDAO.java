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

    private List<OrdersDTO> ordersList1;

    public List<OrdersDTO> getOrdersList1() {
        return ordersList1;
    }

    private List<OrdersDTO> ordersList2;

    public List<OrdersDTO> getOrdersList2() {
        return ordersList2;
    }

    private List<OrdersDTO> ordersList3;

    public List<OrdersDTO> getOrdersList3() {
        return ordersList2;
    }

    private List<OrdersDTO> ordersList4;

    public List<OrdersDTO> getOrdersList4() {
        return ordersList2;
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
                    if (this.ordersList1 == null) {
                        this.ordersList1 = new ArrayList<>();
                    }
                    this.ordersList1.add(dto);
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
                    if (this.ordersList1 == null) {
                        this.ordersList1 = new ArrayList<>();
                    }
                    this.ordersList1.add(dto);
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

    public void showOrdersRevenueByMonth() throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "SELECT MONTH(o.DateOrders) AS month, YEAR(o.DateOrders) AS year, SUM(od.Total) AS revenue "
                        + "FROM Orders o "
                        + "INNER JOIN OrdersDetail od ON o.OrdersDtID = od.OrdersDtID "
                        + "WHERE YEAR(o.DateOrders) = YEAR(GETDATE()) AND MONTH(o.DateOrders) = MONTH(GETDATE()) "
                        + "GROUP BY MONTH(o.DateOrders), YEAR(o.DateOrders)";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()) {
                    int month = rs.getInt("month");
                    int year = rs.getInt("year");
                    float revenue = rs.getFloat("revenue");
                    OrdersDTO dto = new OrdersDTO(month, year, revenue);
                    if (this.ordersList1 == null) {
                        this.ordersList1 = new ArrayList<>();
                    }
                    this.ordersList1.add(dto);
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

    public void showOrdersRevenueByYear() throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "SELECT YEAR(o.DateOrders) AS year, SUM(od.Total) AS revenue "
                        + "FROM Orders o "
                        + "INNER JOIN OrdersDetail od ON o.OrdersDtID = od.OrdersDtID "
                        + "WHERE YEAR(o.DateOrders) = YEAR(GETDATE()) "
                        + "GROUP BY YEAR(o.DateOrders)";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()) {
                    int year = rs.getInt("year");
                    float revenue = rs.getFloat("revenue");
                    OrdersDTO dto = new OrdersDTO(year, revenue);
                    if (this.ordersList2 == null) {
                        this.ordersList2 = new ArrayList<>();
                    }
                    this.ordersList2.add(dto);
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

    public void showTotalOrders() throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "SELECT MONTH(DateOrders) AS month, COUNT(*) AS totalOrders "
                        + "FROM Orders "
                        + "WHERE YEAR(DateOrders) = YEAR(GETDATE()) "
                        + "GROUP BY MONTH(DateOrders) "
                        + "ORDER BY MONTH(DateOrders)";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()) {
                    int month = rs.getInt("month");
                    int totalOrders = rs.getInt("totalOrders");
                    OrdersDTO dto = new OrdersDTO(month, totalOrders);
                    if (this.ordersList3 == null) {
                        this.ordersList3 = new ArrayList<>();
                    }
                    this.ordersList3.add(dto);
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
