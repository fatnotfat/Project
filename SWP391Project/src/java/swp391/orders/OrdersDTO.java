/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.orders;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Chau Nhat Truong
 */
public class OrdersDTO implements Serializable {

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

    public OrdersDTO(int ordersID, int customerID, Date dateOrders) {
        this.ordersID = ordersID;
        this.customerID = customerID;
        this.dateOrders = dateOrders;
    }

    public OrdersDTO(int ordersID) {
        this.ordersID = ordersID;
    }

    /**
     * @return the ordersID
     */
    public int getOrdersID() {
        return ordersID;
    }

    /**
     * @param ordersID the ordersID to set
     */
    public void setOrdersID(int ordersID) {
        this.ordersID = ordersID;
    }

    /**
     * @return the customerID
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     * @return the dateOrders
     */
    public Date getDateOrders() {
        return dateOrders;
    }

    /**
     * @param dateOrders the dateOrders to set
     */
    public void setDateOrders(Date dateOrders) {
        this.dateOrders = dateOrders;
    }

    /**
     * @return the ordersDtID
     */
    public int getOrdersDtID() {
        return ordersDtID;
    }

    /**
     * @param ordersDtID the ordersDtID to set
     */
    public void setOrdersDtID(int ordersDtID) {
        this.ordersDtID = ordersDtID;
    }

}
