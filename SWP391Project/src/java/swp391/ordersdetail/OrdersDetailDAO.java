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
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;
import swp391.orders.OrdersDTO;
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
    
//    public void searchOrdersDetailByFilter(float priceFrom, float priceTo, int size)
//            throws SQLException, NamingException {
//        Connection con = null;
//        PreparedStatement stm = null;
//        ResultSet rs = null;
//        try {
//            con = DBHelper.makeConnection();
//            if (con != null) {
//                String sql = "Select Name, Description, Quantity, Price, Size "
//                        + "From Product "
//                        + "Where ";
//
//                if (priceFrom >= 0) {
//                    sql += " Price >= ?";
//                }
//                if (priceTo != 0) {
//                    sql += " And Price <= ?";
//                }
//                if (size != 0) {
//                    sql += " And Size = ?";
//                }
//                stm = con.prepareStatement(sql);
//                stm.setFloat(1, priceFrom);
//                stm.setFloat(2, priceTo);
//                stm.setInt(3, size);
//                rs = stm.executeQuery();
//                while (rs.next()) {
//                    String name = rs.getString("Name");
//                    String description = rs.getString("Description");
//                    int quantity = rs.getInt("Quantity");
//                    float price = rs.getFloat("Price");
//                    size = rs.getInt("Size");
//                    ProductDTO dto = new ProductDTO(
//                            name, description, price, quantity, size);
//                    if (this.itemsList == null) {
//                        this.itemsList = new ArrayList<>();
//                    }
//                    this.itemsList.add(dto);
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
