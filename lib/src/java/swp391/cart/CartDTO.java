/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.cart;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author nguye
 */
public class CartDTO implements Serializable{
    private int id;
    private int cusID;
    private int productID;
    private int quantity;
    private Date createTime;

    public CartDTO() {
    }

    public CartDTO(int id, int cusID, int productID, int quantity, Date createTime) {
        this.id = id;
        this.cusID = cusID;
        this.productID = productID;
        this.quantity = quantity;
        this.createTime = createTime;
    }

    public CartDTO(int productID, int quantity) {
        this.productID = productID;
        this.quantity = quantity;
    }
    
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the cusID
     */
    public int getCusID() {
        return cusID;
    }

    /**
     * @param cusID the cusID to set
     */
    public void setCusID(int cusID) {
        this.cusID = cusID;
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
     * @return the createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime the createTime to set
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    
    
}
