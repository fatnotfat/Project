/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.cart;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.naming.NamingException;
import swp391.utils.DBHelper;

/**
 *
 * @author nguye
 */
public class CartDAO implements Serializable{
    public boolean insertCart  (int customerID, int productID, int quantity, Date createTime)
            throws NamingException,SQLException{
        Connection con = null;
        PreparedStatement stm = null;
        boolean result = false;
        try{
            con = DBHelper.makeConnection();
            if(con != null){
                String sql = "INSERT INTO Cart(CustomerID, ProductID, Quantity, CreateTime"
                        + ") "
                        + "VALUES(?,?,?,?"
                        + ")";
                stm = con.prepareStatement(sql);
                stm.setInt(1, customerID);
                stm.setInt(2, quantity);
                java.sql.Date sqlDate = new java.sql.Date(createTime.getTime());
                stm.setDate(3, sqlDate);
                
                int effectedRows = stm.executeUpdate();
                if(effectedRows>0){
                   result = true;
                }
            }
            
        }finally{
            if (stm != null){
                stm.close();
            }
            if (con != null){
                con.close();
            }
        }
        return result;
    }
}
