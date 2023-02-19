/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.ordersDetail;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.naming.NamingException;

import swp391.utils.DBHelper;

/**
 *
 * @author Duy
 */
public class OrdersDetailDAO {

    public List<OrdersDetailsDTO> getAllOrdersDetail() throws SQLException, NamingException {
        List<OrdersDetailsDTO> ordersDetailList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT [OrdersDtID], [ProductID], [Quantity], [Discount], [Price], [PaymentID],[ShippingID],[Total],[Status] FROM [dbo].[OrdersDetail]";
        try {
            conn = DBHelper.makeConnection();
            if (conn != null) {
                stmt = conn.prepareStatement(sql);
                rs = stmt.executeQuery();
                while (rs.next()) {
                    OrdersDetailsDTO ordersDetail = new OrdersDetailsDTO();
                    ordersDetail.setOrdersDtID(rs.getInt("OrdersDtID"));
                    ordersDetail.setProductID(rs.getInt("ProductID"));
                    ordersDetail.setQuantity(rs.getInt("Quantity"));
                    ordersDetail.setDiscount(rs.getDouble("Discount"));
                    ordersDetail.setPrice(rs.getDouble("Price"));
                    ordersDetail.setPaymentID(rs.getInt("PaymentID"));
                    ordersDetail.setShippingID(rs.getInt("ShippingID"));
                    ordersDetail.setTotal(rs.getDouble("Total"));
                    ordersDetail.setStatus(rs.getString("Status"));
                    ordersDetailList.add(ordersDetail);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conn.close();
        }
        return ordersDetailList;
    }

    public static boolean insertOrder(String email, HashMap<String, Integer> cart) {
        Connection cn = null;
        boolean result = false;
        try {
            cn = DBHelper.makeConnection();
            if (cn != null) {
                int accid = 0, orderid = 0;
                cn.setAutoCommit(false); // off auto commit
                //get accountID by email
                String sql = "select [CustomerID] from [dbo].[Customer] where [Email] = ?";
                PreparedStatement pst = cn.prepareStatement(sql);

                pst.setString(1, email);
                ResultSet rs = pst.executeQuery();
                if (rs != null && rs.next()) {
                    accid = rs.getInt("CustomerID");
                }

                //insert a new order
//                System.out.println("accountID: " + accid);
                Date dateOrders = new Date(System.currentTimeMillis());
//                System.out.println("order date: " + dateOrders);
                sql = "insert into [dbo].[Orders] ([CustomerID], [DateOrders]) values(?,?)";
                pst = cn.prepareStatement(sql);
                pst.setInt(1, accid);
                pst.setDate(2, dateOrders);
                pst.executeUpdate();

                //get order id that is the lagest number
                sql = "select top 1 [OrdersID] from [dbo].[Orders] order by [OrdersID] desc";
                pst = cn.prepareStatement(sql);
                rs = pst.executeQuery();
                if (rs != null && rs.next()) {
                    orderid = rs.getInt("OrdersID");
                }
                //insert order details
//                System.out.println("orderid " + orderid);
                
                // insert order details into OrdersDetail table    
                Set<String> productsID = cart.keySet();
                for (String productID : productsID) {
                    sql = "INSERT INTO [dbo].[OrdersDetail] ([OrdersID], [ProductID], "
                            + "[Quantity], [Discount], [Price], [Total]) VALUES (?,?,?,?,?,?)";
                    pst = cn.prepareStatement(sql);
                    double discount = 5;
                    int quantity = cart.get(productID);
                    double price = getProductPrice(productID);
                    double total = (price * quantity) - discount;
                    pst.setInt(1, orderid);
                    pst.setInt(2, Integer.parseInt(productID));
                    pst.setInt(3, quantity);
                    pst.setDouble(4, 0);
                    pst.setDouble(5, price);
                    pst.setDouble(6, total);
                    pst.executeUpdate();                 
                }

//                for (Map.Entry<String, Integer> entry : cart.entrySet()) {
//                    String productName = entry.getKey();
//                    int quantity = entry.getValue();
//                    double price = getProductPrice(productName);
//                    double discount = 0;
//                    double total = (price * quantity) - discount;
//                    sql = "INSERT INTO [dbo].[OrdersDetail] ([OrdersID], [ProductID], [Quantity], [Discount], [Price], [Total]) VALUES (?,?,?,?,?,?)";
//                    pst = cn.prepareStatement(sql);
//                    pst.setInt(1, orderid);
//                    pst.setInt(2, getProductId(productName)); 
//                    pst.setInt(3, quantity);
//                    pst.setDouble(4, discount);
//                    pst.setDouble(5, price);
//                    pst.setDouble(6, total);
//                    pst.executeUpdate();
//                }
                cn.commit();
                result = true;
            }
        } catch (Exception e) {
            try {
                if (cn != null) {
                    cn.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
            result = false;
            System.out.println(e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static double getProductPrice(String productID) throws NamingException {
        double price = 0;
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            cn = DBHelper.makeConnection();
            if (cn != null) {
                String sql = "SELECT [Price] FROM [dbo].[Product] WHERE [ProductID] = ?";
                pst = cn.prepareStatement(sql);
                pst.setString(1, productID);
                rs = pst.executeQuery();
                if (rs != null && rs.next()) {
                    price = rs.getDouble("Price");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return price;
    }

//    public static int getProductId(String productName) throws NamingException {
//        int productId = 0;
//        Connection cn = null;
//        PreparedStatement pst = null;
//        ResultSet rs = null;
//        try {
//            cn = DBHelper.makeConnection();
//            if (cn != null) {
//                String sql = "SELECT [ProductID] FROM [dbo].[Product] WHERE [ProductName] = ?";
//                pst = cn.prepareStatement(sql);
//                pst.setString(1, productName);
//                rs = pst.executeQuery();
//                if (rs != null && rs.next()) {
//                    productId = rs.getInt("ProductID");
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (rs != null) {
//                    rs.close();
//                }
//                if (pst != null) {
//                    pst.close();
//                }
//                if (cn != null) {
//                    cn.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//        return productId;
//    }

}
