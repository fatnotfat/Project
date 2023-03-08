/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.customer;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.naming.NamingException;
import swp391.utils.DBHelper;

/**
 *
 * @author Chau Nhat Truong
 */
public class CustomerDAO implements Serializable {

    public CustomerDTO checkLogin(String email, String password)
            throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        CustomerDTO result = null;
        try {
            //connect DB
            con = DBHelper.makeConnection();
            if (con != null) {
                //Create SQL String
                String sql = "Select CustomerID, Name, Email, Phone, Address, RankID, Sex, DateOfBirth, TypeOfLogin "
                        + "From Customer "
                        + "Where email = ? And Password = ? And TypeOfLogin = 0";

                stm = con.prepareStatement(sql);
                stm.setString(1, email);
                stm.setString(2, password);
                //ExecuteQuery
                rs = stm.executeQuery();
                //Process result
                if (rs.next()) {
                    String name = rs.getString("Name");
                    int id = rs.getInt("CustomerID");
                    String phone = rs.getString("Phone");
                    String address = rs.getString("Address");
                    int rankID = rs.getInt("RankID");
                    boolean sex = rs.getBoolean("Sex");
                    Date dob = rs.getDate("DateOfBirth");
                    boolean typeOfLogin = rs.getBoolean("TypeOfLogin");
                    result = new CustomerDTO(id, name, dob, email, phone, address, rankID, sex, typeOfLogin);
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
            throws SQLException, NamingException, ParseException {;
        Connection con = null;
        PreparedStatement stm = null;
        boolean result = false;
        try {
            //1. connect DB
            con = DBHelper.makeConnection();
            if (con != null) {
                //2. Create SQL String
                String sql = "Insert Into Customer("
                        + "Name, Password, DateOfBirth, Email, Phone, Address, Role, RankID, Sex, TypeOfLogin"
                        + ") "
                        + "Values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?"
                        + ")";
                //3. Create statement
                stm = con.prepareStatement(sql);
                stm.setString(1, dto.getName());
                stm.setString(2, dto.getPassword());
                if (dto.getBirthDate() != null) {
                    java.sql.Date sqlDate = new java.sql.Date(dto.getBirthDate().getTime());
                    stm.setDate(3, sqlDate);
                } else {
                    String date = "1-1-1999";
                    DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
                    Date defaultDate = df.parse(date);
                    java.sql.Date sqlDate = new java.sql.Date(defaultDate.getTime());
                    stm.setDate(3, sqlDate);
                }
                stm.setString(4, dto.getEmail());
                stm.setString(5, dto.getPhone());
                stm.setString(6, dto.getAddress());
                stm.setBoolean(7, dto.isRole());
                stm.setInt(8, dto.getRankID());
                stm.setBoolean(9, dto.isSex());
                stm.setBoolean(10, dto.isTypeOfLogin());
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
            throws SQLException, NamingException {
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
    
    public CustomerDTO checkEmailAlreadyRegister(String email)
            throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        boolean result = false;
        CustomerDTO dto = null;
        try {
            //1. connect DB
            con = DBHelper.makeConnection();
            if (con != null) {
                //2. Create SQL String
                String sql = "Select CustomerID, Name, Email, Phone, Address, RankID, Sex, DateOfBirth, TypeOfLogin "
                        + "From Customer "
                        + "Where Email = ? AND TypeOfLogin = 1";
                //3. Create statement
                stm = con.prepareStatement(sql);
                stm.setString(1, email);
                //4. ExecuteQuery
                rs = stm.executeQuery();
                //5. Process result
                if (rs.next()) {
                    String name = rs.getString("Name");
                    int id = rs.getInt("CustomerID");
                    String phone = rs.getString("Phone");
                    String address = rs.getString("Address");
                    int rankID = rs.getInt("RankID");
                    boolean sex = rs.getBoolean("Sex");
                    Date dob = rs.getDate("DateOfBirth");
                    boolean typeOfLogin = rs.getBoolean("TypeOfLogin");
                    dto = new CustomerDTO(id, name, dob, email, phone, address, rankID, sex, typeOfLogin);
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
        return dto;
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
    
    public boolean updateAccount(CustomerDTO dto) 
            throws NamingException, SQLException{
        Connection con = null;
        PreparedStatement stm = null;
        boolean result = false;
        try {
            //Connect DB
            con = DBHelper.makeConnection();
            //Create SQL String Name, Password, DateOfBirth, Email, Phone, Address, Role, RankID, Sex, TypeOfLogin
            String sql = "Update Customer "
                    + "Set Name = ?, Password = ?, DateOfBirth = ?, "
                    + "Phone = ?, Address = ?, Role = ?, RankID = ?, Sex = ?, TypeOfLogin = ? "
                    + "Where Email = ?";
            //Create statement
            stm = con.prepareStatement(sql);
            stm.setString(1, dto.getName());
            stm.setString(2, dto.getPassword());
            if (dto.getBirthDate() != null) {
                    java.sql.Date sqlDate = new java.sql.Date(dto.getBirthDate().getTime());
                    stm.setDate(3, sqlDate);
            }
            stm.setString(4, dto.getPhone());
            stm.setString(5, dto.getAddress());
            stm.setBoolean(6, dto.isRole());
            stm.setInt(7, dto.getRankID());
            stm.setBoolean(8, dto.isSex());
            stm.setBoolean(9, dto.isTypeOfLogin());
            stm.setString(10, dto.getEmail());
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
    
    
    
    public boolean updateGoogleAccount(CustomerDTO dto) 
            throws NamingException, SQLException{
        Connection con = null;
        PreparedStatement stm = null;
        boolean result = false;
        try {
            //Connect DB
            con = DBHelper.makeConnection();
            //Create SQL String Name, Password, DateOfBirth, Email, Phone, Address, Role, RankID, Sex, TypeOfLogin
            String sql = "Update Customer "
                    + "Set Name = ?, DateOfBirth = ?, "
                    + "Phone = ?, Address = ?, Role = ?, RankID = ?, Sex = ?, TypeOfLogin = ? "
                    + "Where Email = ?";
            //Create statement
            stm = con.prepareStatement(sql);
            stm.setString(1, dto.getName());
            if (dto.getBirthDate() != null) {
                    java.sql.Date sqlDate = new java.sql.Date(dto.getBirthDate().getTime());
                    stm.setDate(2, sqlDate);
            }
            stm.setString(3, dto.getPhone());
            stm.setString(4, dto.getAddress());
            stm.setBoolean(5, dto.isRole());
            stm.setInt(6, dto.getRankID());
            stm.setBoolean(7, dto.isSex());
            stm.setBoolean(8, dto.isTypeOfLogin());
            stm.setString(9, dto.getEmail());
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
