/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.orders;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import swp391.utils.DBHelper;

/**
 *
 * @author Duy
 */
public class OrdersDAO {

    public static ArrayList<OrdersDTO> getOrders(String email) {
        ArrayList<OrdersDTO> list = new ArrayList<>();
        try {
            Connection cn = DBHelper.makeConnection();
            if (cn != null) {
                String sql = "select [OrdersID],a.[CustomerID], [DateOrders], [OrdersDtID] from Orders a, [dbo].[Customer] b\n"
                        + "                        where a.CustomerID = b.CustomerID and email like ?";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, email);
                ResultSet table = pst.executeQuery();
                if (table != null) {
                    while (table.next()) {
                        int orderID = table.getInt("OrdersID");
                        int customerID = table.getInt("CustomerID");
                        Date dateOrders = table.getDate("DateOrders");
                        int ordersDtID = table.getInt("OrdersDtID");

                        OrdersDTO order = new OrdersDTO(orderID, customerID, dateOrders, ordersDtID);
                        list.add(order);
                    }
                }
                cn.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

   



//    public static int getProductQuantity(String productName) {
//        Connection cn = null;
//        int quantity = 0;
//        try {
//            cn = DBHelper.makeConnection();
//            if (cn != null) {
//                String sql = "SELECT [Quantity] FROM [dbo].[Product]  WHERE [Name] = ?";
//                PreparedStatement pst = cn.prepareStatement(sql);
//                pst.setString(1, productName);
//                ResultSet rs = pst.executeQuery();
//                if (rs != null && rs.next()) {
//                    quantity = rs.getInt("Quantity");
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (cn != null) {
//                    cn.close();
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return quantity;
//    }

}
