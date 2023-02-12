/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.customer;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;
import swp391.utils.DBHelper;

/**
 *
 * @author Chau Nhat Truong
 */
public class CustomerDAO implements Serializable {
    public CustomerDTO checkLogin(String email, String password)
            throws SQLException, NamingException {;
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        CustomerDTO result = null;
        try {
            //connect DB
            con = DBHelper.makeConnection();
            if (con != null) {
                //Create SQL String
                String sql = "Select Name, Email, Phone, Address "
                        + "From Customer "
                        + "Where Email = ? And Password = ?";
                //Create statement
                stm = con.prepareStatement(sql);
                stm.setString(1, email);
                stm.setString(2, password);
                //ExecuteQuery
                rs = stm.executeQuery();
                //Process result
                if (rs.next()) {
                    String name = rs.getString("Name");
                    result = new CustomerDTO(name);
                }
            }//end con is available
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
        return result;
    }

    private List<CustomerDTO> accountList;

    public List<CustomerDTO> getAccountList() {
        return accountList;
    }
    public boolean createAccount(CustomerDTO dto)
            throws SQLException, NamingException {;
        Connection con = null;
        PreparedStatement stm = null;
        boolean result = false;
        try {
            //1. connect DB
            con = DBHelper.makeConnection();
            if (con != null) {
                //2. Create SQL String
                String sql = "Insert Into Customer("
                        + "Name, Password, Email, Phone, Address, BirthDate, Sex"
                        + ") "
                        + "Values(?, ?, ?, ?, ?, ?, ?"
                        + ")";
                //3. Create statement
                stm = con.prepareStatement(sql);
                stm.setString(1, dto.getName());
                stm.setString(2, dto.getPassword());
                stm.setString(3, dto.getEmail());
                stm.setString(4, dto.getPhone());
                stm.setString(5, dto.getAddress());
                stm.setDate(6, (Date) dto.getBirthDate());
                stm.setBoolean(7, dto.isSex());
                //4. ExecuteQuery
                int effectedRows = stm.executeUpdate();
                //5. Process result
                if (effectedRows > 0) {
                    result = true;
                }
            }//end con is available
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

    public boolean checkEmail(String email)
            throws SQLException, NamingException {;
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        boolean result = false;
        try {
            //1. connect DB
            con = DBHelper.makeConnection();
            if (con != null) {
                //2. Create SQL String
                String sql = "Select Email "
                        + "From Customer "
                        + "Where Email = ?";
                //3. Create statement
                stm = con.prepareStatement(sql);
                stm.setString(1, email);
                //4. ExecuteQuery
                rs = stm.executeQuery();
                //5. Process result
                if (rs.next()) {
                    return true;
                }
            }//end con is available
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
        return result;
    }

    public boolean updatePassword(String email, String password)
            throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        boolean result = false;
        try {
            //Connect DB
            con = DBHelper.makeConnection();
            //Create SQL String
            String sql = "Update Customer "
                    + "Set Password = ? "
                    + "Where Email = ?";
            //Create statement
            stm = con.prepareStatement(sql);
            stm.setString(1, password);
            stm.setString(2, email);
            //Execute query
            int effectedRows = stm.executeUpdate();
            //Process result
            if (effectedRows > 0) {
                result = true;
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
}
