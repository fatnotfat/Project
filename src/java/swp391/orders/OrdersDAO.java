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
import swp391.cart.CartObject;
import swp391.utils.DBHelper;

/**
 *
 * @author Chau Nhat Truong
 */
public class OrdersDAO implements Serializable {
//    public List<Integer> addToOrdersDetail(CartObject cart, float discount, int paymentID, int shippingID, int status, String cusName, String cusPhone, String cusAddress)
//            throws SQLException, NamingException {
//        Connection con = null;
//        PreparedStatement stm1 = null;
//        PreparedStatement stm2 = null;
//        ResultSet rs = null;
//        List<Integer> generatedKeys = new ArrayList<>();
//        try {
//            //1. connect DB
//            con = DBHelper.makeConnection();
//            if (con != null) {
//                //2. Create SQL String (For selected price)
//                String sql1 = "SELECT [ProductID], [Price] FROM [SWP391].[dbo].[Product] "
//                        + "where ProductID = ?";
//                stm1 = con.prepareStatement(sql1);
//                Map<String, Integer> items = cart.getItems();
////                boolean isFirstTimeInsertProduct = true;
//                for (String productID : items.keySet()) {
//                    stm1.setString(1, productID);
//                    rs = stm1.executeQuery();
//                    if (rs.next()) {
//                        float price = rs.getFloat("Price");
//                        float total = (price * items.get(productID)) - discount;
//                        String sql2 = "Insert Into OrdersDetail("
//                                + "ProductID, Quantity, Discount, Price, PaymentID, "
//                                + "ShippingID, Total, Status, CusName, CusPhone, CusAddress"
//                                + ") "
//                                + "Values("
//                                + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?"
//                                + ")";
//                        stm2 = con.prepareStatement(sql2, Statement.RETURN_GENERATED_KEYS);
//                        stm2.setInt(1, Integer.parseInt(productID));
//                        stm2.setInt(2, items.get(productID));
//                        stm2.setFloat(3, discount);
//                        stm2.setFloat(4, price);
//                        stm2.setInt(5, paymentID);
//                        stm2.setInt(6, shippingID);
//                        stm2.setFloat(7, total);
//                        stm2.setInt(8, status);
//                        stm2.setString(9, cusName);
//                        stm2.setString(10, cusPhone);
//                        stm2.setString(11, cusAddress);
//
//                        stm2.executeUpdate();
//                        rs = stm2.getGeneratedKeys();
//                        if (rs.next()) {
//                            generatedKeys.add(rs.getInt(1));
//                        }
//                    }//end of insert cart on DB
//                }
//                return generatedKeys;
//            }
//        } finally {
//            if (stm2 != null) {
//                stm2.close();
//            }
//            if (con != null) {
//                con.close();
//            }
//        }
//        return generatedKeys;
//    }

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

//    public boolean addToOrders(int customerID, int key)
//            throws SQLException, NamingException {
//        Connection con = null;
//        PreparedStatement stm = null;
//        long milis = System.currentTimeMillis();
//        Date date = new Date(milis);
//        boolean result = false;
//        try {
//            con = DBHelper.makeConnection();
//            if (con != null) {
//                String sql = "Insert Into Orders("
//                        + " CustomerID, DateOrders, OrdersDtID"
//                        + ") "
//                        + "Values("
//                        + " ?, ?, ?"
//                        + ")";
//                stm = con.prepareStatement(sql);
//                stm.setInt(1, customerID);
//                stm.setDate(2, date);
//                stm.setInt(3, key);
//                int effectedRows = stm.executeUpdate();
//                if (effectedRows > 0) {
//                    result = true;
//                }
//            }
//        } finally {
//            if (stm != null) {
//                stm.close();
//            }
//            if (con != null) {
//                con.close();
//            }
//        }
//        return result;
//    }
    private List<OrdersDTO> ordersList;

    public List<OrdersDTO> getOrdersList() {
        return ordersList;
    }

    public List<OrdersDTO> getCustomerShippingInFoByCusID(int customerId) throws NamingException {
        List<OrdersDTO> customerDetails = new ArrayList<>();
        String sql = "SELECT OrdersID, CusName, CusPhone, CusAddress\n"
                + "  FROM Orders where CustomerID = ?";
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
