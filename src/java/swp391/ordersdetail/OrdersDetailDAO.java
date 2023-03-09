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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.naming.NamingException;
import swp391.cart.CartObject;
import swp391.utils.DBHelper;

/**
 *
 * @author Chau Nhat Truong
 */
public class OrdersDetailDAO implements Serializable {

    public List<Integer> addToOrdersDetail(CartObject cart, float discount, int paymentID, int shippingID, int status, String cusName, String cusPhone, String cusAddress)
            throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm1 = null;
        PreparedStatement stm2 = null;
        ResultSet rs = null;
        List<Integer> generatedKeys = new ArrayList<>();
        try {
            //1. connect DB
            con = DBHelper.makeConnection();
            if (con != null) {
                //2. Create SQL String (For selected price)
                String sql1 = "SELECT [ProductID], [Price] FROM [SWP391].[dbo].[Product] "
                        + "where ProductID = ?";
                stm1 = con.prepareStatement(sql1);
                Map<String, Integer> items = cart.getItems();
                for (String productID : items.keySet()) {
                    stm1.setString(1, productID);
                    rs = stm1.executeQuery();
                    if (rs.next()) {
                        float price = rs.getFloat("Price");
                        float total = (price * items.get(productID)) - discount;
                        String sql2 = "Insert Into OrdersDetail("
                                + "ProductID, Quantity, Discount, Price, PaymentID, "
                                + "ShippingID, Total, Status, CusName, CusPhone, CusAddress"
                                + ") "
                                + "Values("
                                + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?"
                                + ")";
                        stm2 = con.prepareStatement(sql2, Statement.RETURN_GENERATED_KEYS);
                        stm2.setInt(1, Integer.parseInt(productID));
                        stm2.setInt(2, items.get(productID));
                        stm2.setFloat(3, discount);
                        stm2.setFloat(4, price);
                        stm2.setInt(5, paymentID);
                        stm2.setInt(6, shippingID);
                        stm2.setFloat(7, total);
                        stm2.setInt(8, status);
                        stm2.setString(9, cusName);
                        stm2.setString(10, cusPhone);
                        stm2.setString(11, cusAddress);

                        stm2.executeUpdate();
                        rs = stm2.getGeneratedKeys();
                        if (rs.next()) {
                            generatedKeys.add(rs.getInt(1));
                        }
                    }//end of insert cart on DB
                }
                return generatedKeys;
            }
        } finally {
            if (stm2 != null) {
                stm2.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return generatedKeys;
    }

    public List<OrdersDetailDTO> getAllOrdersDetails() throws SQLException, NamingException {
        List<OrdersDetailDTO> ordersDetails = new ArrayList<>();
        String sql = "SELECT OrdersDtID, ProductID, Quantity, Discount, Price, PaymentID, ShippingID, Total, Status, CusName, CusPhone, CusAddress FROM OrdersDetail";
        try (Connection conn = DBHelper.makeConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int ordersDtID = rs.getInt("OrdersDtID");
                int productID = rs.getInt("ProductID");
                int quantity = rs.getInt("Quantity");
                Float discount = rs.getFloat("Discount");
                Float price = rs.getFloat("Price");
                int paymentID = rs.getInt("PaymentID");
                int shippingID = rs.getInt("ShippingID");
                Float total = rs.getFloat("Total");
                boolean status = rs.getBoolean("Status");
                String cusName = rs.getString("CusName");
                String cusPhone = rs.getString("CusPhone");
                String cusAddress = rs.getString("CusAddress");
                OrdersDetailDTO ordersDetail = new OrdersDetailDTO(productID, quantity, discount, price, paymentID, shippingID, total, status, cusName, cusPhone, cusAddress);
                ordersDetails.add(ordersDetail);
            }
        }
        return ordersDetails;
    }

    public List<OrdersDetailDTO> getCustomerDetailsByCusID(int customerId) throws NamingException {
        List<OrdersDetailDTO> customerDetails = new ArrayList<>();
        String sql = "SELECT od.OrdersDtID, od.CusName, od.CusPhone, od.CusAddress\n"
                + "FROM OrdersDetail od\n"
                + "INNER JOIN Orders o ON o.OrdersDtID = od.OrdersDtID\n"
                + "INNER JOIN Customer c ON c.CustomerID = o.CustomerID\n"
                + "WHERE c.CustomerID = ? and od.CusName is not null";
        try (Connection conn = DBHelper.makeConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, customerId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int ordersDtID = rs.getInt("OrdersDtID");
                String cusName = rs.getString("CusName");
                String cusPhone = rs.getString("CusPhone");
                String cusAddress = rs.getString("CusAddress");
                OrdersDetailDTO ordersDetail = new OrdersDetailDTO(ordersDtID, cusName, cusPhone, cusAddress);
                customerDetails.add(ordersDetail);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return customerDetails;
    }

//    public int addToOrdersDetail(int productID, int quantity, float discount,
//            float price, int paymentID, int shippingID, float total, int status)
//            throws SQLException, NamingException {
//        Connection con = null;
//        PreparedStatement stm = null;
//        ResultSet rs = null;
//        int key = 0;
//        try {
//            con = DBHelper.makeConnection();
//            if (con != null) {
//                String sql = "Insert Into OrdersDetail("
//                        + "ProductID, Quantity, Discount, Price, PaymentID, "
//                        + "ShippingID, Total, Status"
//                        + ") "
//                        + "Values("
//                        + " ?, ?, ?, ?, ?, ?, ?, ?"
//                        + ")";
//                stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//                stm.setInt(1, productID);
//                stm.setInt(2, quantity);
//                stm.setFloat(3, discount);
//                stm.setFloat(4, price);
//                stm.setInt(5, paymentID);
//                stm.setInt(6, shippingID);
//                stm.setFloat(7, total);
//                stm.setInt(8, status);
//                int effectedRows = stm.executeUpdate();
//                rs = stm.getGeneratedKeys();
//                if (rs.next()) {
//                    key = rs.getInt(1);
//                }
//                while (effectedRows > 0) {
//                    return key;
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
//        return key;
//    }
    private List<OrdersDetailDTO> ordersDetailList;

    public List<OrdersDetailDTO> getOrdersDetailList() {
        return ordersDetailList;
    }

    public void showOrdersDetailID()
            throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Select Total "
                        + "From OrdersDetail";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()) {
                    float total = rs.getFloat("Total");
                    OrdersDetailDTO dto = new OrdersDetailDTO(total);
                    if (this.ordersDetailList == null) {
                        this.ordersDetailList = new ArrayList<>();
                    }
                    this.ordersDetailList.add(dto);
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
