/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.product;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.naming.NamingException;
import swp391.utils.DBHelper;

/**
 *
 * @author nguye
 */
public class ProductDAO implements Serializable {
    
    private List<ProductDTO> listProduct; 
    
    

    public List<ProductDTO> getListProduct() {
        return listProduct;
    }
    
    
    
    public void searchProduct(String searchValue)
            throws NamingException, SQLException{
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        
        try{
            con = DBHelper.makeConnection();
            if(con!=null){
                String sql = "SELECT ProductID, Name, Description, Quantity, Price, Status, Size, CreateTime "
                        + "FROM Product "
                        + "WHERE Name LIKE ? ";
                
                stm = con.prepareStatement(sql);
                stm.setString(1, "%"+searchValue+"%");
                rs = stm.executeQuery();
                
                while(rs.next()){
                    int id = rs.getInt("ProductID");
                    String name = rs.getString("Name");
                    String descr = rs.getString("Description");
                    int quantity = rs.getInt("Quantity");
                    float price = rs.getFloat("Price");
                    boolean status = rs.getBoolean("Status");
                    int size = rs.getInt("Size");
                    Date date = rs.getDate("CreateTime");   
                    
                    ProductDTO dto = new ProductDTO(id, name, descr, quantity, price, status, size, date);
                   
                    if(this.listProduct == null){
                        this.listProduct = new ArrayList<>();
                    }
                    this.listProduct.add(dto);
                }
            }
        }finally{
            if(rs != null){
                rs.close();
            }
            
            if(stm != null){
                stm.close();
            }
            
            if(con != null){
                con.close();
            }
        }
    }
}
