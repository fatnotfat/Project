/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.category;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.naming.NamingException;
import swp391.utils.DBHelper;

/**
 *
 * @author Chau Nhat Truong
 */
public class CategoryDAO implements Serializable {

    public boolean createCategory(CategoryDTO dto)
            throws SQLException, NamingException {;
        Connection con = null;
        PreparedStatement stm = null;
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Insert Into Category("
                        + "Name, Description, Status "
                        + ") "
                        + "Values(?, ?, 1 "
                        + ")";
                stm = con.prepareStatement(sql);
                stm.setString(1, dto.getName());
                stm.setString(2, dto.getDescription());
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

//    public boolean updateCartegory(int categoryID, String name,
//            String description, boolean status)
//            throws SQLException, NamingException {
//        Connection con = null;
//        PreparedStatement stm = null;
//        boolean result = false;
//        try {
//            con = DBHelper.makeConnection();
//            String sql = "Update Category "
//                    + "Set Name = ?, Description = ?, Status = ? "
//                    + "Where CategoryID = ?";
//            //3. Create statement
//            stm = con.prepareStatement(sql);
//            stm.setString(1, name);
//            stm.setString(2, description);
//            stm.setBoolean(3, status);
//            stm.setInt(4, categoryID);
//            int effectedRows = stm.executeUpdate();
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
//
//    public boolean deleteCategory(int categoryID)
//            throws SQLException, NamingException {;
//        Connection con = null;
//        PreparedStatement stm = null;
//        boolean result = false;
//        try {
//            //1. connect DB
//            con = DBHelper.makeConnection();
//            if (con != null) {
//                String sql = "Update Category "
//                        + "Set Status = false "
//                        + "Where CategoryID = ?";
//                stm = con.prepareStatement(sql);
//                stm.setInt(1, categoryID);
//                int effectedRows = stm.executeUpdate();
//                if (effectedRows > 0) {
//                    result = true;
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
//        return result;
//    }
}
