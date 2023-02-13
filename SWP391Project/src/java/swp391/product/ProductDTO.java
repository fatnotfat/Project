/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.product;

import java.io.Serializable;

/**
 *
 * @author Chau Nhat Truong
 */
public class ProductDTO implements Serializable {

    private String name;
    private String description;
    private float price;
    private int quantity;
    private float priceFrom;
    private float priceTo;
    private int size;
    private int category;

    public ProductDTO() {
    }

    public ProductDTO(String name, float priceFrom, float priceTo, int size, int category) {
        this.name = name;
        this.priceFrom = priceFrom;
        this.priceTo = priceTo;
        this.size = size;
        this.category = category;
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
     * @return the priceFrom
     */
    public float getPriceFrom() {
        return priceFrom;
    }

    /**
     * @param priceFrom the priceFrom to set
     */
    public void setPriceFrom(float priceFrom) {
        this.priceFrom = priceFrom;
    }

    /**
     * @return the priceTo
     */
    public float getPriceTo() {
        return priceTo;
    }

    /**
     * @param priceTo the priceTo to set
     */
    public void setPriceTo(float priceTo) {
        this.priceTo = priceTo;
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
     * @return the category
     */
    public int getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(int category) {
        this.category = category;
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

}
