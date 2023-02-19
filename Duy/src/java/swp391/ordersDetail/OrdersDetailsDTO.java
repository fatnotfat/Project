/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.ordersDetail;

/**
 *
 * @author Duy
 */
public class OrdersDetailsDTO {
     private int ordersDtID;
    private int productID;
    private int quantity;
    private double discount;
    private double price;
    private int paymentID;
    private int shippingID;
    private double total;
    private String status;

    public OrdersDetailsDTO() {
    }

    public OrdersDetailsDTO(int ordersDtID, int productID, int quantity, double discount, double price, int paymentID, int shippingID, double total, String status) {
        this.ordersDtID = ordersDtID;
        this.productID = productID;
        this.quantity = quantity;
        this.discount = discount;
        this.price = price;
        this.paymentID = paymentID;
        this.shippingID = shippingID;
        this.total = total;
        this.status = status;
    }

    public int getOrdersDtID() {
        return ordersDtID;
    }

    public void setOrdersDtID(int ordersDtID) {
        this.ordersDtID = ordersDtID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public int getShippingID() {
        return shippingID;
    }

    public void setShippingID(int shippingID) {
        this.shippingID = shippingID;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
