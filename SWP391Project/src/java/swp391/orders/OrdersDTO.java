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
    private boolean status;
    private float revenue;
    private int month;
    private int year;
    private int totalOrders;

    public OrdersDTO() {
    }

    public OrdersDTO(int ordersID, int customerID, Date dateOrders, int ordersDtID, float revenue, int month, int year, int totalOrders) {
        this.ordersID = ordersID;
        this.customerID = customerID;
        this.dateOrders = dateOrders;
        this.ordersDtID = ordersDtID;
        this.revenue = revenue;
        this.month = month;
        this.year = year;
        this.totalOrders = totalOrders;
    }

    public OrdersDTO(int ordersID, int customerID, Date dateOrders) {
        this.ordersID = ordersID;
        this.customerID = customerID;
        this.dateOrders = dateOrders;
    }

    public OrdersDTO(int ordersID) {
        this.ordersID = ordersID;
    }

    public OrdersDTO(int month, int totalOrders) {
        this.month = month;
        this.totalOrders = totalOrders;
    }

    public OrdersDTO(int year, float revenue) {
        this.year = year;
        this.revenue = revenue;
    }

    public OrdersDTO(int month, int year, float revenue) {
        this.month = month;
        this.year = year;
        this.revenue = revenue;
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

    /**
     * @return the revenue
     */
    public float getRevenue() {
        return revenue;
    }

    /**
     * @param revenue the revenue to set
     */
    public void setRevenue(float revenue) {
        this.revenue = revenue;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the totalOrders
     */
    public int getTotalOrders() {
        return totalOrders;
    }

    /**
     * @param totalOrders the totalOrders to set
     */
    public void setTotalOrders(int totalOrders) {
        this.totalOrders = totalOrders;
    }

}
