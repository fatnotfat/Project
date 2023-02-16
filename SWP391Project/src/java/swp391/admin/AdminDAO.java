/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.admin;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;
import swp391.utils.DBHelper;

/**
 *
 * @author Chau Nhat Truong
 */
public class AdminDAO implements Serializable {

    public AdminDTO checkLogin(String username, String password)
            throws SQLException, NamingException {;
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        AdminDTO result = null;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Select Username, Name "
                        + "From Manager "
                        + "Where Username = ? And Password = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, username);
                stm.setString(2, password);
                rs = stm.executeQuery();
                if (rs.next()) {
                    String name = rs.getString("Name");
                    result = new AdminDTO(name);
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

    public boolean deleteAccount(String username)
            throws SQLException, NamingException {;
        Connection con = null;
        PreparedStatement stm = null;
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                //2. Create SQL String
                String sql = "Delete From Manager "
                        + "Where username = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, username);
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

    public boolean createAccount(AdminDTO dto)
            throws SQLException, NamingException {;
        Connection con = null;
        PreparedStatement stm = null;
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Insert Into Manager("
                        + "Username, Name , Password "
                        + ") "
                        + "Values(?, ?, ? "
                        + ")";
                stm = con.prepareStatement(sql);
                stm.setString(1, dto.getUsername());
                stm.setString(2, dto.getPassword());
                stm.setString(3, dto.getName());
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
}
