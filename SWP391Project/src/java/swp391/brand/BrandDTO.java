/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.brand;

import java.io.Serializable;

/**
 *
 * @author Chau Nhat Truong
 */
public class BrandDTO implements Serializable {

    private int brandID;
    private String name;
    private String description;

    public BrandDTO() {
    }

    public BrandDTO(int brandID, String name, String description) {
        this.brandID = brandID;
        this.name = name;
        this.description = description;
    }

    public BrandDTO(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public BrandDTO(int brandID, String name) {
        this.brandID = brandID;
        this.name = name;
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
     * @return the brandID
     */
    public int getBrandID() {
        return brandID;
    }

    /**
     * @param brandID the brandID to set
     */
    public void setBrandID(int brandID) {
        this.brandID = brandID;
    }
}
