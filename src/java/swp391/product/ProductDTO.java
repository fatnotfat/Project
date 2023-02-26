/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.product;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author nguye
 */
public class ProductDTO implements Serializable{

    private int id;
    private String name;
    private String description;
    private int quantity;
    private float price;
    private boolean status;
    private int size;
    private Date createTime;
    private String avatar;

    public ProductDTO() {
    }

    public ProductDTO(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public ProductDTO(int id, String name, float price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }
    
    public ProductDTO(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public ProductDTO(int id, String name, String description, int quantity, float price, boolean status, int size, Date createTime,String avatar) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
        this.size = size;
        this.createTime = createTime;
        this.avatar = avatar;
    }

    public ProductDTO(String name, String description, int quantity, float price, boolean status, int size, Date createTime) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
        this.size = size;
        this.createTime = createTime;
    }

    public ProductDTO(int id, String name, String description, int quantity, float price, int size, String avatar) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.size = size;
        this.avatar = avatar;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the avatar
     */
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    
    
}
