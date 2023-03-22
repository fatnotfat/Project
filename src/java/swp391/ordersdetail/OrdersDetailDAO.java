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


    public boolean addToOrdersDetail(CartObject cart, float discount, int ordersID)
            throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm1 = null;
        PreparedStatement stm2 = null;
        ResultSet rs = null;
        boolean result = false;
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
                                + "ProductID, OrdersID, Quantity, Discount, Price, "
                                + " Total"
                                + ") "
                                + "Values("
                                + " ?, ?, ?, ?, ?, ?"
                                + ")";
                        stm2 = con.prepareStatement(sql2);
                        stm2.setInt(1, Integer.parseInt(productID));
                        stm2.setInt(2, ordersID);
                        stm2.setInt(3, items.get(productID));
                        stm2.setFloat(4, discount);
                        stm2.setFloat(5, price);
                        stm2.setFloat(6, total);

                        int effectedRows = stm2.executeUpdate();
                        if (effectedRows > 0) {
                            result = true;
                        }
                    }//end of insert cart on DB
                }
            }
        } finally {
            if(rs != null){
                rs.close();
            }
            if (stm1 != null) {
                stm1.close();
            }
            if (stm2 != null) {
                stm2.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return result;
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
}
