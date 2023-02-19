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

    public List<ProductDTO> getProducts(int start, int total)
            throws NamingException, SQLException {
        List<ProductDTO> list = new ArrayList<>();
        try (Connection connection = DBHelper.makeConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Product LIMIT " + start + "," + total)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("ProductID");
                String name = resultSet.getString("Name");
                String description = resultSet.getString("Description");
                list.add(new ProductDTO(id, name, description));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public int searchProduct(String searchValue)
            throws NamingException, SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "SELECT ProductID, Name, Description, Quantity, Price, Status, Size, CreateTime "
                        + "FROM Product "
                        + "WHERE Name LIKE ? ";

                stm = con.prepareStatement(sql);
                stm.setString(1, "%" + searchValue + "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("ProductID");
                    String name = rs.getString("Name");
                    String descr = rs.getString("Description");
                    int quantity = rs.getInt("Quantity");
                    float price = rs.getFloat("Price");
                    boolean status = rs.getBoolean("Status");
                    int size = rs.getInt("Size");
                    Date date = rs.getDate("CreateTime");

                    ProductDTO dto = new ProductDTO(id, name, descr, quantity, price, status, size, date);

                    if (this.listProduct == null) {
                        this.listProduct = new ArrayList<>();
                    }
                    this.listProduct.add(dto);
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
        return this.listProduct.size();
    }

//    public ArrayList<ProductDTO> getTop(int index, int page)throws 
//            NamingException,SQLException{
//        ArrayList<ProductDTO> list = new ArrayList<>();
//        Connection con = null;
//        PreparedStatement stm = null;
//        ResultSet rs = null;
//        try {
//            con = DBHelper.makeConnection();
//            if(con != null){
//                String sql = "SELECT ProductID, Name, Description, Quantity, Price, Status, Size, CreateTime "
//                        + "FROM Product "
//                        + "WHERE  "
//                        + "BETWEEN ? AND ?";
//            }
//        } finally {
//            if (rs != null) {
//                rs.close();
//            }
//
//            if (stm != null) {
//                stm.close();
//            }
//
//            if (con != null) {
//                con.close();
//            }
//        }
//    }
    public List<ProductDTO> pagingAccount(int index, String searchValue, int recordsPerPage)
            throws NamingException, SQLException {

        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<ProductDTO> list = new ArrayList<>();

        try {
            con = DBHelper.makeConnection();
            String sql = "SELECT ProductID, Name, Description, Quantity, Price, Status, Size, CreateTime "
                    + "FROM Product\n"
                    + "WHERE Name LIKE ? "
                    + "ORDER BY ProductID\n"
                    + "OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
            stm = con.prepareStatement(sql);
            stm.setString(1, "%" + searchValue + "%");
            stm.setInt(2, (index - 1) * recordsPerPage);
            stm.setInt(3, recordsPerPage);
            rs = stm.executeQuery();

            while (rs.next()) {
                list.add(new ProductDTO(rs.getInt("ProductID"),
                        rs.getString("Name"),
                        rs.getString("Description"),
                        rs.getInt("Quantity"),
                        rs.getFloat("Price"),
                        rs.getBoolean("Status"),
                        rs.getInt("Size"),
                        rs.getDate("CreateTime")
                ));
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


    public static ProductDTO getProductDTO(int productID) throws SQLException {
        ProductDTO productDTO = null;
        Connection connec = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            connec = DBHelper.makeConnection();
            if (connec != null) {
                String sql = "select [ProductID], [Name], [Description], [Quantity], [Price], [Status], [Size], [CreateTime] from [dbo].[Product] "
                        + "where [ProductID]=?";
                pst = connec.prepareStatement(sql);
                pst.setInt(1, productID);
                rs = pst.executeQuery();
                if (rs != null && rs.next()) {
                    productID = rs.getInt("ProductID");
                    String name = rs.getString("Name");
                    String description = rs.getString("Description");
                    int quantity = rs.getInt("Quantity");
                    int price = rs.getInt("Price");
                    boolean status = rs.getBoolean("Status");
                    int size = rs.getInt("Size");
                    Date createTime = rs.getDate("CreateTime");
                    productDTO = new ProductDTO(name, description, quantity, price, status, size, createTime);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                pst.close();
            }
            if (connec != null) {
                connec.close();
            }
        }
        return productDTO;
    }

}
