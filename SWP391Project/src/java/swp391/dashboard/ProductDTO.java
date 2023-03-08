/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.dashboard;

import swp391.product.*;
import java.io.Serializable;

/**
 *
 * @author Chau Nhat Truong
 */
public class ProductDTO implements Serializable {

    private int productID;
    private String name;
    private String description;
    private int quantity;
    private float price;
    private boolean status;
    private int size;
    private int CateID;
    private int BrandID;
    private int FeBkID;

    public ProductDTO() {
    }

    public ProductDTO(int productID, String name, String description, int quantity, float price, boolean status, int size, int CateID, int BrandID, int FeBkID) {
        this.productID = productID;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
        this.size = size;
        this.CateID = CateID;
        this.BrandID = BrandID;
        this.FeBkID = FeBkID;
    }

    public ProductDTO(String name, String description, int quantity, float price, int size, int CateID, int BrandID) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.size = size;
        this.CateID = CateID;
        this.BrandID = BrandID;
    }

    public ProductDTO(int productID, String name, String description, int quantity, float price, int size) {
        this.productID = productID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.size = size;
    }

    public ProductDTO(int productID, String name, String description, int quantity, float price, boolean status, int size) {
        this.productID = productID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.status = status;
        this.size = size;
    }

    public ProductDTO(String name, String description, float price, int quantity, int size) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.size = size;
    }
    
    public ProductDTO(int productID, int quantity) {
        this.productID = productID;
        this.quantity = quantity;
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
     * @return the CateID
     */
    public int getCateID() {
        return CateID;
    }

    /**
     * @param CateID the CateID to set
     */
    public void setCateID(int CateID) {
        this.CateID = CateID;
    }

    /**
     * @return the BrandID
     */
    public int getBrandID() {
        return BrandID;
    }

    /**
     * @param BrandID the BrandID to set
     */
    public void setBrandID(int BrandID) {
        this.BrandID = BrandID;
    }

    /**
     * @return the FeBkID
     */
    public int getFeBkID() {
        return FeBkID;
    }

    /**
     * @param FeBkID the FeBkID to set
     */
    public void setFeBkID(int FeBkID) {
        this.FeBkID = FeBkID;
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

}
