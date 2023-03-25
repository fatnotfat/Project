/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.category;

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
public class CategoryDAO implements Serializable {

    public List<CategoryDTO> getListCategory() throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<CategoryDTO> list = null;

        try {
            con = DBHelper.makeConnection();
            if(con!=null){
                
                String sql = "SELECT CateID, Name, Description, Status "
                        + "FROM Category";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                
                while(rs.next()){
                    CategoryDTO dto = new CategoryDTO();
                    dto.setCateID(rs.getInt("CateID"));
                    dto.setName(rs.getString("Name"));
                    dto.setDescription(rs.getString("Description"));
                    dto.setStatus(rs.getBoolean("Status"));
                    
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
