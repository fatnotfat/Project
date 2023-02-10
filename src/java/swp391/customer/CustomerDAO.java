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

    //public boolean checkLogin(String email, String password)
    public CustomerDTO checkLogin(String email, String password)
            throws SQLException, /*ClassNotFoundException*/ NamingException {;
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
//        boolean result = false;
        CustomerDTO result = null;
        try {
            //1. connect DB
            con = DBHelper.makeConnection();
            if (con != null) {
                //2. Create SQL String
                String sql = "Select Name, Email, Phone, Address "
                        + "From Customer "
                        + "Where Email = ? And Password = ?";
                //3. Create statement
                stm = con.prepareStatement(sql);
                stm.setString(1, email);
                stm.setString(2, password);
                //4. ExecuteQuery
                rs = stm.executeQuery();
                //5. Process result
                if (rs.next()) {
//                    result = true;
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

//    public void searchLastName(String searchValue)
//            throws SQLException, /*ClassNotFoundException*/ NamingException {;
//        Connection con = null;
//        PreparedStatement stm = null;
//        ResultSet rs = null;
////        boolean result = false;
//        try {
//            //1. connect DB
//            con = DBHelper.makeConnection();
//            if (con != null) {
//                //2. Create SQL String
//                String sql = "Select email, password, lastname, isAdmin "
//                        + "From Registration "
//                        + "Where lastname Like ?";
//                //3. Create statement
//                stm = con.prepareStatement(sql);
//                stm.setString(1, "%" + searchValue + "%");
//                //4. ExecuteQuery
//                rs = stm.executeQuery();
//                //5. Process result
//                while (rs.next()) {
//                    //get field/column
//                    String email = rs.getString("email");
//                    String password = rs.getString("password");
//                    String lastname = rs.getString("lastname");
//                    boolean role = rs.getBoolean("isAdmin");
//                    //create DTO instance
//                    CustomerDTO dto = new CustomerDTO(email,
//                            password, lastname, role);
//                    //add to account list
//                    if (this.accountList == null) {
//                        this.accountList = new ArrayList<>();
//                    }//end account list is not existed
//                    this.accountList.add(dto);
//                }//end account list is traversed
//            }//end con is available
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
//
//    public boolean deleteAccount(String email)
//            throws SQLException, /*ClassNotFoundException*/ NamingException {;
//        Connection con = null;
//        PreparedStatement stm = null;
//        boolean result = false;
//        try {
//            //1. connect DB
//            con = DBHelper.makeConnection();
//            if (con != null) {
//                //2. Create SQL String
//                String sql = "Delete From Registration "
//                        + "Where email = ?";
//                //3. Create statement
//                stm = con.prepareStatement(sql);
//                stm.setString(1, email);
//                //4. ExecuteQuery
//                int effectedRows = stm.executeUpdate();
//                //5. Process result
//                if (effectedRows > 0) {
//                    result = true;
//                }
//            }//end con is available
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
//
//    public boolean updateAccount(String email, String password, boolean role)
//            throws SQLException, NamingException {
//        Connection con = null;
//        PreparedStatement stm = null;
//        boolean result = false;
//        try {
//            //1. Connect DB
//            con = DBHelper.makeConnection();
//            //2. Create SQL String
//            String sql = "Update Registration "
//                    + "Set password = ?, isAdmin = ? "
//                    + "Where email = ?";
//            //3. Create statement
//            stm = con.prepareStatement(sql);
//            stm.setString(1, password);
//            stm.setBoolean(2, role);
//            stm.setString(3, email);
//            //4. Execute query
//            int effectedRows = stm.executeUpdate();
//            //5. Process result
//            if (effectedRows > 0) {
//                result = true;
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
    public boolean createAccount(CustomerDTO dto)
            throws SQLException, /*ClassNotFoundException*/ NamingException {;
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
    
     public CustomerDTO findEmail(String email)
            throws SQLException, /*ClassNotFoundException*/ NamingException {;
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        CustomerDTO result = null;
        try {
            //1. connect DB
            con = DBHelper.makeConnection();
            if (con != null) {
                //2. Create SQL String
                String sql = "Select Email, Password "
                        + "From Customer "
                        + "Where Email = ?";
                //3. Create statement
                stm = con.prepareStatement(sql);
                stm.setString(1, email);
                //4. ExecuteQuery
                rs = stm.executeQuery();
                //5. Process result
                if (rs.next()) {
                    String password = rs.getString("Password");
                    result = new CustomerDTO(password);
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
}
