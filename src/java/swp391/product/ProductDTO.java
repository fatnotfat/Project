/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.product;

import java.io.Serializable;
import java.util.Date;
import swp391.brand.BrandDTO;
import swp391.category.CategoryDTO;
import swp391.feedback.FeedbackDTO;

/**
 *
 * @author Duy
 */
public class ProductDTO implements Serializable{
    private int productID;
    private String name;
    private String description;
    private int quantity;
    private double price;
    private String status;
    private String size;
    private Date createTime;
    private CategoryDTO cateID ;
    private BrandDTO brandID;
    private FeedbackDTO feBkID;

    public ProductDTO() {
    }

    public ProductDTO(int productID, String name, String description, int quantity, double price, String status, String size, Date createTime) {
        this.productID = productID;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
        this.size = size;
        this.createTime = createTime;
    }

    

    public ProductDTO(int productID, String name, String description, int quantity, double price, String status, String size, Date createTime, CategoryDTO cateID, BrandDTO brandID, FeedbackDTO feBkID) {
        this.productID = productID;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
        this.size = size;
        this.createTime = createTime;
        this.cateID = cateID;
        this.brandID = brandID;
        this.feBkID = feBkID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public CategoryDTO getCateID() {
        return cateID;
    }

    public void setCateID(CategoryDTO cateID) {
        this.cateID = cateID;
    }

    public BrandDTO getBrandID() {
        return brandID;
    }

    public void setBrandID(BrandDTO brandID) {
        this.brandID = brandID;
    }

    public FeedbackDTO getFeBID() {
        return feBkID;
    }

    public void setFeBID(FeedbackDTO feBID) {
        this.feBkID = feBID;
    }
    
    
}
