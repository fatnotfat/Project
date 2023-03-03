///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package swp391.test;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import javax.naming.NamingException;
//import swp391.customer.CustomerDTO;
//import swp391.orders.OrdersDTO;
//import swp391.ordersdetail.OrdersDetailDTO;
//import swp391.utils.DBHelper;
//
///**
// *
// * @author Chau Nhat Truong
// */
//public class TestngDAO {
//
//    public CustomerDTO checkLogin(String email, String password)
//            throws SQLException, NamingException {;
//        Connection con = null;
//        PreparedStatement stm = null;
//        ResultSet rs = null;
//        CustomerDTO result = null;
//        try {
//            con = DBHelper.makeConnection();
//            if (con != null) {
//                String sql = "Select Name, Email, Phone, Address, Role "
//                        + "From Customer "
//                        + "Where Email = ? And Password = ?";
//                stm = con.prepareStatement(sql);
//                stm.setString(1, email);
//                stm.setString(2, password);
//                rs = stm.executeQuery();
//                if (rs.next()) {
//                    String name = rs.getString("Name");
//                    String phone = rs.getString("Phone");
//                    String address = rs.getString("Address");
//                    result = new CustomerDTO(name, email, phone, address);
//                }
//            }
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
//        return result;
//    }
//
//    public CustomerDTO loadInformationForPayment(String email)
//            throws SQLException, NamingException {;
//        Connection con = null;
//        PreparedStatement stm = null;
//        ResultSet rs = null;
//        CustomerDTO result = null;
//        try {
//            con = DBHelper.makeConnection();
//            if (con != null) {
//                String sql = "Select CustomerID, Name, Email, Phone, Address "
//                        + "From Customer "
//                        + "Where Email = ?";
//                stm = con.prepareStatement(sql);
//                stm.setString(1, email);
//                rs = stm.executeQuery();
//                if (rs.next()) {
//                    int customerID = rs.getInt("CustomerID");
//                    String name = rs.getString("Name");
//                    String phone = rs.getString("Phone");
//                    String address = rs.getString("Address");
//                    result = new CustomerDTO(customerID, name, email, phone, address);
//                }
//            }
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
//        return result;
//    }
//
//    private List<CustomerDTO> accountList;
//
//    public List<CustomerDTO> getAccountList() {
//        return accountList;
//    }
//
//    public boolean createAccount(CustomerDTO dto)
//            throws SQLException, NamingException, ParseException {;
//        Connection con = null;
//        PreparedStatement stm = null;
//        boolean result = false;
//        try {
//            con = DBHelper.makeConnection();
//            if (con != null) {
//                String sql = "Insert Into Customer("
//                        + "Name, Password, DateOfBirth, Email, Phone, Address, Role, RankID, Sex, TypeOfLogin"
//                        + ") "
//                        + "Values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?"
//                        + ")";
//                stm = con.prepareStatement(sql);
//                stm.setString(1, dto.getName());
//                stm.setString(2, dto.getPassword());
//                if (dto.getBirthDate() != null) {
//                    java.sql.Date sqlDate = new java.sql.Date(dto.getBirthDate().getTime());
//                    stm.setDate(3, sqlDate);
//                } else {
//                    String date = "1-1-1999";
//                    DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
//                    Date defaultDate = df.parse(date);
//                    java.sql.Date sqlDate = new java.sql.Date(defaultDate.getTime());
//                    stm.setDate(3, sqlDate);
//                }
//                stm.setString(4, dto.getEmail());
//                stm.setString(5, dto.getPhone());
//                stm.setString(6, dto.getAddress());
//                stm.setBoolean(7, dto.isRole());
//                stm.setInt(8, dto.getRankID());
//                stm.setBoolean(9, dto.isSex());
//                stm.setBoolean(10, dto.isTypeOfLogin());
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
//
//    public boolean createAccountForShipping(String name, String email,
//            String phone, String address)
//            throws SQLException, NamingException, ParseException {;
//        Connection con = null;
//        PreparedStatement stm = null;
//        boolean result = false;
//        try {
//            con = DBHelper.makeConnection();
//            if (con != null) {
//                String sql = "Insert Into Customer("
//                        + "Name, Email, Phone, Address"
//                        + ") "
//                        + "Values(?, ?, ?, ?"
//                        + ")";
//                stm = con.prepareStatement(sql);
//                stm.setString(1, name);
//                stm.setString(2, email);
//                stm.setString(3, phone);
//                stm.setString(4, address);
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
//
//    public boolean checkEmail(String email)
//            throws SQLException, NamingException {
//        Connection con = null;
//        PreparedStatement stm = null;
//        ResultSet rs = null;
//        boolean result = false;
//        try {
//            con = DBHelper.makeConnection();
//            if (con != null) {
//                String sql = "Select Email "
//                        + "From Customer "
//                        + "Where Email = ?";
//                stm = con.prepareStatement(sql);
//                stm.setString(1, email);
//                rs = stm.executeQuery();
//                if (rs.next()) {
//                    return true;
//                }
//            }
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
//        return result;
//    }
//
//    public boolean checkTypeOfLogin(String email)
//            throws SQLException, NamingException {
//        Connection con = null;
//        PreparedStatement stm = null;
//        ResultSet rs = null;
//        boolean result = false;
//        try {
//            con = DBHelper.makeConnection();
//            if (con != null) {
//                String sql = "Select TypeOfLogin "
//                        + "From Customer "
//                        + "Where Email = ?";
//                stm = con.prepareStatement(sql);
//                stm.setString(1, email);
//                rs = stm.executeQuery();
//                if (rs.next()) {
//                    return true;
//                }
//            }
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
//        return result;
//    }
//
//    public boolean updatePassword(String email, String password)
//            throws SQLException, NamingException {
//        Connection con = null;
//        PreparedStatement stm = null;
//        boolean result = false;
//        try {
//            con = DBHelper.makeConnection();
//            String sql = "Update Customer "
//                    + "Set Password = ? "
//                    + "Where Email = ?";
//            stm = con.prepareStatement(sql);
//            stm.setString(1, password);
//            stm.setString(2, email);
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
//    public boolean addToOrders(int customerID, int key)
//            throws SQLException, NamingException {
//        Connection con = null;
//        PreparedStatement stm = null;
//        long milis = System.currentTimeMillis();
//        java.sql.Date date = new java.sql.Date(milis);
//        boolean result = false;
//        try {
//            con = DBHelper.makeConnection();
//            if (con != null) {
//                String sql = "Insert Into Orders("
//                        + " CustomerID, DateOrders, OrdersDtID"
//                        + ") "
//                        + "Values("
//                        + " ?, ?, ?"
//                        + ")";
//                stm = con.prepareStatement(sql);
//                stm.setInt(1, customerID);
//                stm.setDate(2, date);
//                stm.setInt(3, key);
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
//
//    private List<OrdersDTO> ordersList;
//
//    public List<OrdersDTO> getOrdersList() {
//        return ordersList;
//    }
//
//    public void showOrders(int ordersID)
//            throws SQLException, NamingException {
//        Connection con = null;
//        PreparedStatement stm = null;
//        ResultSet rs = null;
//        try {
//            con = DBHelper.makeConnection();
//            if (con != null) {
//                String sql = "Select OrdersID, CustomerID, DateOrders "
//                        + "From Orders "
//                        + "Where OrdersID = ?";
//                stm = con.prepareStatement(sql);
//                stm.setInt(1, ordersID);
//                rs = stm.executeQuery();
//
//                while (rs.next()) {
//                    ordersID = rs.getInt("OrdersID");
//                    int customerID = rs.getInt("CustomerID");
//                    java.sql.Date dateOrders = rs.getDate("DateOrders");
//                    OrdersDTO dto = new OrdersDTO(ordersID, customerID, dateOrders);
//                    if (this.ordersList == null) {
//                        this.ordersList = new ArrayList<>();
//                    }
//                    this.ordersList.add(dto);
//                }
//            }
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
//    public int addToOrdersDetail(int productID)
//            throws SQLException, NamingException {
//        Connection con = null;
//        PreparedStatement stm = null;
//        ResultSet rs = null;
//        int key = 0;
//        try {
//            con = DBHelper.makeConnection();
//            if (con != null) {
//                String sql = "Insert Into OrdersDetail("
//                        + "ProductID, Quantity, Discount, Price, PaymentID, "
//                        + "ShippingID, Total, Status"
//                        + ") "
//                        + "Values("
//                        + " ?, ?, ?, ?, ?, ?, ?, ?"
//                        + ")";
//                stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//                stm.setInt(1, productID);
//                int effectedRows = stm.executeUpdate();
//                rs = stm.getGeneratedKeys();
//                if (rs.next()) {
//                    key = rs.getInt(1);
//                }
//                while (effectedRows > 0) {
//                    return key;
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
//        return key;
//    }
//
//    private List<OrdersDetailDTO> ordersDetailList;
//
//    public List<OrdersDetailDTO> getOrdersDetailList() {
//        return ordersDetailList;
//    }
//
//    public void showOrdersDetailID()
//            throws SQLException, NamingException {
//        Connection con = null;
//        PreparedStatement stm = null;
//        ResultSet rs = null;
//        try {
//            con = DBHelper.makeConnection();
//            if (con != null) {
//                String sql = "Select Total "
//                        + "From OrdersDetail";
//                stm = con.prepareStatement(sql);
//                rs = stm.executeQuery();
//                while (rs.next()) {
//                    float total = rs.getFloat("Total");
//                    OrdersDetailDTO dto = new OrdersDetailDTO(total);
//                    if (this.ordersDetailList == null) {
//                        this.ordersDetailList = new ArrayList<>();
//                    }
//                    this.ordersDetailList.add(dto);
//                }
//            }
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
//}
