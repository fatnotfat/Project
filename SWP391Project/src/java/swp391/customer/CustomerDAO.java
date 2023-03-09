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
import java.util.ArrayList;
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
            throws SQLException, NamingException {;
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        CustomerDTO result = null;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Select Name, Email, Phone, Address, Role "
                        + "From Customer "
                        + "Where Email = ? And Password = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, email);
                stm.setString(2, password);
                rs = stm.executeQuery();
                if (rs.next()) {
                    String name = rs.getString("Name");
                    String phone = rs.getString("Phone");
                    String address = rs.getString("Address");
                    boolean role = rs.getBoolean("Role");
                    result = new CustomerDTO(name, email, phone, address, role);
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
        return result;
    }

    public CustomerDTO loadInformationForPayment(String email)
            throws SQLException, NamingException {;
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        CustomerDTO result = null;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Select CustomerID, Name, Email, Phone, Address "
                        + "From Customer "
                        + "Where Email = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, email);
                rs = stm.executeQuery();
                if (rs.next()) {
                    int customerID = rs.getInt("CustomerID");
                    String name = rs.getString("Name");
                    String phone = rs.getString("Phone");
                    String address = rs.getString("Address");
                    result = new CustomerDTO(customerID, name, email, phone, address);
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
        return result;
    }

    private List<CustomerDTO> accountList;

    public List<CustomerDTO> getAccountList() {
        return accountList;
    }

    public void showCustomer()
            throws SQLException, NamingException {;
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Select CustomerID, Name, Email, Phone, Address "
                        + "From Customer";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()) {
                    int customerID = rs.getInt("CustomerID");
                    String name = rs.getString("Name");
                    String email = rs.getString("Email");
                    String phone = rs.getString("Phone");
                    String address = rs.getString("Address");
                    CustomerDTO dto
                            = new CustomerDTO(customerID, name, email, phone, address);
                    if (this.accountList == null) {
                        this.accountList = new ArrayList<>();
                    }
                    this.accountList.add(dto);
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

    public boolean createAccount(CustomerDTO dto)
            throws SQLException, NamingException, ParseException {;
        Connection con = null;
        PreparedStatement stm = null;
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Insert Into Customer("
                        + "Name, Password, DateOfBirth, Email, Phone, Address, Role, RankID, Sex, TypeOfLogin"
                        + ") "
                        + "Values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?"
                        + ")";
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
                int effectedRows = stm.executeUpdate();
                if (effectedRows > 0) {
                    result = true;
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
        return result;
    }

    public boolean adminCreateAccount(String name, String password, String email,
            String phone, boolean role)
            throws SQLException, NamingException, ParseException {;
        Connection con = null;
        PreparedStatement stm = null;
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Insert Into Customer("
                        + "Name, Password, Email, Phone, Role, TypeOfLogin"
                        + ") "
                        + "Values(?, ?, ?, ?, ?, 0"
                        + ")";
                stm = con.prepareStatement(sql);
                stm.setString(1, name);
                stm.setString(2, password);
                stm.setString(3, email);
                stm.setString(4, phone);
                stm.setBoolean(5, role);
                int effectedRows = stm.executeUpdate();
                if (effectedRows > 0) {
                    result = true;
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
        return result;
    }

    public boolean adminDeleteAccount(String email)
            throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            String sql = "Update Customer "
                    + "Set TypeOfLogin = 2 "
                    + "Where Email = ?";
            stm = con.prepareStatement(sql);
            stm.setString(1, email);
            int effectedRows = stm.executeUpdate();
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

    public boolean adminUpdateAccount(String email)
            throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            String sql = "Update Customer "
                    + "Set TypeOfLogin = 0 "
                    + "Where Email = ?";
            stm = con.prepareStatement(sql);
            stm.setString(1, email);
            int effectedRows = stm.executeUpdate();
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

    public boolean createAccountForShipping(String name, String email,
            String phone, String address)
            throws SQLException, NamingException, ParseException {;
        Connection con = null;
        PreparedStatement stm = null;
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Insert Into Customer("
                        + "Name, Email, Phone, Address"
                        + ") "
                        + "Values(?, ?, ?, ?"
                        + ")";
                stm = con.prepareStatement(sql);
                stm.setString(1, name);
                stm.setString(2, email);
                stm.setString(3, phone);
                stm.setString(4, address);
                int effectedRows = stm.executeUpdate();
                if (effectedRows > 0) {
                    result = true;
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
        return result;
    }

    public boolean checkEmail(String email)
            throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Select Email "
                        + "From Customer "
                        + "Where Email = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, email);
                rs = stm.executeQuery();
                if (rs.next()) {
                    return true;
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
        return result;
    }

    public boolean checkTypeOfLogin(String email)
            throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Select TypeOfLogin "
                        + "From Customer "
                        + "Where Email = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, email);
                rs = stm.executeQuery();
                if (rs.next()) {
                    return true;
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
        return result;
    }

    public boolean updatePassword(String email, String password)
            throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            String sql = "Update Customer "
                    + "Set Password = ? "
                    + "Where Email = ?";
            stm = con.prepareStatement(sql);
            stm.setString(1, password);
            stm.setString(2, email);
            int effectedRows = stm.executeUpdate();
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
