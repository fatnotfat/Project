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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;
import swp391.utils.DBHelper;

/**
 *
 * @author Chau Nhat Truong
 */
public class OrdersDAO implements Serializable {


    public List<Integer> addToOrders(int customerID, int paymentID, int shippingID, int Status, String cusName, String cusPhone, String cusAddress)
            throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        long milis = System.currentTimeMillis();
        Date date = new Date(milis);
        List<Integer> generatedKeys = new ArrayList<>();
        try {
            //1. connect DB
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Insert Into Orders("
                        + "CustomerID, PaymentID, ShippingID, DateOrders, Status, "
                        + " CusName, CusPhone, CusAddress"
                        + ") "
                        + "Values("
                        + " ?, ?, ?, ?, ?, ?, ?, ?"
                        + ")";
                stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

                stm.setInt(1, customerID);
                stm.setInt(2, paymentID);
                stm.setInt(3, shippingID);
                stm.setDate(4, date);
                stm.setInt(5, Status);
                stm.setString(6, cusName);
                stm.setString(7, cusPhone);
                stm.setString(8, cusAddress);
                stm.executeUpdate();
                rs = stm.getGeneratedKeys();

                if (rs.next()) {
                    generatedKeys.add(rs.getInt(1));
                }
                return generatedKeys;
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return generatedKeys;
    }


    private List<OrdersDTO> ordersList;

    public List<OrdersDTO> getOrdersList() {
        return ordersList;
    }

    public List<OrdersDTO> getCustomerShippingInFoByCusID(int customerId) throws NamingException {
        List<OrdersDTO> customerDetails = new ArrayList<>();
        String sql = "SELECT MIN(o.OrdersID) AS OrdersID, o.CusName, o.CusPhone, o.CusAddress\n"
                + "FROM Orders o\n"
                + "INNER JOIN Customer c ON c.CustomerID = o.CustomerID\n"
                + "WHERE c.CustomerID = ? AND o.CusName IS NOT NULL\n"
                + "GROUP BY o.CusName, o.CusPhone, o.CusAddress";
        try (Connection conn = DBHelper.makeConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, customerId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int ordersDtID = rs.getInt("OrdersID");
                String cusName = rs.getString("CusName");
                String cusPhone = rs.getString("CusPhone");
                String cusAddress = rs.getString("CusAddress");
                OrdersDTO ordersDetail = new OrdersDTO(ordersDtID, cusName, cusPhone, cusAddress);
                customerDetails.add(ordersDetail);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return customerDetails;
    }

    public OrdersDTO getShippingInFoByCusID(int customerId) throws NamingException {
        OrdersDTO customerDetails = null;
        String sql = "SELECT TOP 1 OrdersID, CusName, CusPhone, CusAddress, DateOrders\n"
                + "FROM Orders\n"
                + "WHERE CustomerID = ? AND CusName IS NOT NULL AND CusPhone IS NOT NULL AND CusAddress IS NOT NULL\n"
                + "ORDER BY OrdersID DESC";
        try (Connection conn = DBHelper.makeConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, customerId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int ordersDtID = rs.getInt("OrdersID");
                String cusName = rs.getString("CusName");
                String cusPhone = rs.getString("CusPhone");
                String cusAddress = rs.getString("CusAddress");
                Date dateOders = rs.getDate("DateOrders");
                customerDetails = new OrdersDTO(ordersDtID, dateOders, cusName, cusPhone, cusAddress);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return customerDetails;
    }

//    public void showOrdersID()
//            throws SQLException, NamingException {
//        Connection con = null;
//        PreparedStatement stm = null;
//        ResultSet rs = null;
//        try {
//            con = DBHelper.makeConnection();
//            if (con != null) {
//                String sql = "Select OrdersID "
//                        + "From Orders";
//                stm = con.prepareStatement(sql);
//                rs = stm.executeQuery();
//                while (rs.next()) {
//                    int ordersID = rs.getInt("OrdersID");
//                    OrdersDTO dto = new OrdersDTO(ordersID);
//                    if (this.ordersList == null) {
//                        this.ordersList = new ArrayList<>();
//                    }
//                    this.ordersList.add(dto);
//                }
//            }
//        } finally {
//            if (rs != null) {
//                rs.close();
//            }
//            if (stm != null) {
//                stm.close();
//            }
//            if (con != null) {
//                con.close();
//            }
//        }
//    }
}
