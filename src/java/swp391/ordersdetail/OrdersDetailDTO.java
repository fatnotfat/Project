/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.ordersdetail;

import java.io.Serializable;

/**
 *
 * @author Chau Nhat Truong
 */
public class OrdersDetailDTO implements Serializable {
    
    private int ordersDetailID;
    private int productID;
    private int quantity;
    private float discount;
    private float price;
    private int paymentID;
    private int shippingID;
    private float total;



    public OrdersDetailDTO() {
    }


    
    

    public OrdersDetailDTO(int productID, int quantity, float discount, float price, int paymentID, int shippingID, float total) {
        this.productID = productID;
        this.quantity = quantity;
        this.discount = discount;
        this.price = price;
        this.paymentID = paymentID;
        this.shippingID = shippingID;
        this.total = total;
    }

//    public OrdersDetailDTO(int productID, int quantity, float discount, float price, int paymentID, int shippingID, float total, Boolean status, String cusName, String cusPhone, String cusAddress) {
//        this.productID = productID;
//        this.quantity = quantity;
//        this.discount = discount;
//        this.price = price;
//        this.paymentID = paymentID;
//        this.shippingID = shippingID;
//        this.total = total;
//        this.status = status;
//        this.cusName = cusName;
//        this.cusPhone = cusPhone;
//        this.cusAddress = cusAddress;
//    }

    public int getOrdersDetailID() {
        return ordersDetailID;
    }

    public void setOrdersDetailID(int ordersDetailID) {
        this.ordersDetailID = ordersDetailID;
    }
    
    

 

    public OrdersDetailDTO(float total) {
        this.total = total;
    }

    /**
     * @return the productID
     */
    public int getProductID() {
        return productID;
    }

    /**
     * @param productID the productID to set
     */
    public void setProductID(int productID) {
        this.productID = productID;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the discount
     */
    public float getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(float discount) {
        this.discount = discount;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the paymentID
     */
    public int getPaymentID() {
        return paymentID;
    }

    /**
     * @param paymentID the paymentID to set
     */
    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    /**
     * @return the shippingID
     */
    public int getShippingID() {
        return shippingID;
    }

    /**
     * @param shippingID the shippingID to set
     */
    public void setShippingID(int shippingID) {
        this.shippingID = shippingID;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }


}
