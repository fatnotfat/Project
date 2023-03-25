/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.feedback;

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
 * @author nguye
 */
public class FeedBackDAO implements Serializable {

    public boolean addComment(int productID, int customerID, String textComment, int voting)
            throws NamingException, SQLException, ParseException {
        Connection con = null;
        PreparedStatement stm = null;
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                // Get the current time
                Date currentDate = new Date();

// Format the current time into "MM/dd/yyyy" format
                DateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
                String formattedDate = formatter.format(currentDate);
                Date currentDate1 = formatter.parse(formattedDate);

// Convert the formatted date from java.util.Date to java.sql.Date
                java.sql.Date sqlDate = new java.sql.Date(currentDate1.getTime());

                String sql = "Insert into FeedBack("
                        + "ProductID, CustomerID, Voting, Status, FeedBackTime, TextComments"
                        + ") values ("
                        + "?,?,?,?,?,?"
                        + ")";
                stm = con.prepareStatement(sql);
                stm.setInt(1, productID);
                stm.setInt(2, customerID);
                stm.setInt(3, voting);
                stm.setBoolean(4, false);
                stm.setDate(5, sqlDate);
                stm.setString(6, textComment);
                int effectedRows = stm.executeUpdate();
                if (effectedRows > 0) {
                    result = true;
                }
            }
        } finally {
            if (con != null) {
                con.close();
            }
            if (stm != null) {
                stm.close();
            }
        }
        return result;
    }

    public List<FeedBackDTO> getListFeedBackOfProduct(int productID)
            throws NamingException, SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<FeedBackDTO> list = null;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {

                String sql = "select ProductID, CustomerID, Voting, TextComments, FeedBackTime from FeedBack\n"
                        + "where ProductID = ?";
                stm = con.prepareStatement(sql);
                stm.setInt(1, productID);
                rs = stm.executeQuery();
                while (rs.next()) {
                    FeedBackDTO dto = new FeedBackDTO(rs.getInt("ProductID"), rs.getInt("CustomerID"), rs.getString("TextComments"), rs.getInt("Voting"), rs.getDate("FeedBackTime"));
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    list.add(dto);
                }
            }
        } finally {
            if (con != null) {
                con.close();
            }
            if (stm != null) {
                stm.close();
            }
        }
        return list;
    }
}
