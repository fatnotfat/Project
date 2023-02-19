/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.orders;

import java.util.Date;

/**
 *
 * @author Duy
 */
public class OrdersDTO {
    private int ordersID;
    private int customerID;
    private Date dateOrders;
    private int ordersDtID;

    public OrdersDTO() {
    }

    public OrdersDTO(int ordersID, int customerID, Date dateOrders, int ordersDtID) {
        this.ordersID = ordersID;
        this.customerID = customerID;
        this.dateOrders = dateOrders;
        this.ordersDtID = ordersDtID;
    }

    public int getOrdersID() {
        return ordersID;
    }

    public void setOrdersID(int ordersID) {
        this.ordersID = ordersID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Date getDateOrders() {
        return dateOrders;
    }

    public void setDateOrders(Date dateOrders) {
        this.dateOrders = dateOrders;
    }

    public int getOrdersDtID() {
        return ordersDtID;
    }

    public void setOrdersDtID(int ordersDtID) {
        this.ordersDtID = ordersDtID;
    }
    
    
}
