/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.size;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;
import swp391.utils.DBHelper;

/**
 *
 * @author nguye
 */
public class SizeDAO implements Serializable {

    public List<SizeDTO> getListSizeOfProduct(int productID)
            throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        SizeDTO dto = null;
        List<SizeDTO> list = null;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Select SizeID, Size, ProductID, Status from ProductSize\n"
                        + "where ProductID = ? and Status =1";
                stm = con.prepareStatement(sql);
                stm.setInt(1, productID);
                rs = stm.executeQuery();
                while(rs.next()){
                    int sizeID = rs.getInt("SizeID");
                    int size = rs.getInt("Size");
                    boolean status = rs.getBoolean("Status");
                    dto = new SizeDTO(sizeID, size, status, productID);
                    
                    if(list == null){
                        list = new ArrayList<>();
                    }
                    list.add(dto);
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
        return list;
    }
}
