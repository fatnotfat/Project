/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.category;

import java.io.Serializable;

/**
 *
 * @author Chau Nhat Truong
 */
public class CategoryDTO implements Serializable {

    private int categoryID;
    private String name;
    private String description;
    private boolean status;

    public CategoryDTO() {
    }

    public CategoryDTO(int categoryID, String name, String description, boolean status) {
        this.categoryID = categoryID;
        this.name = name;
        this.description = description;
        this.status = status;
    }

    public CategoryDTO(int categoryID, String name) {
        this.categoryID = categoryID;
        this.name = name;
    }

    public CategoryDTO(String name, String description) {
        this.name = name;
        this.description = description;
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
     * @return the categoryID
     */
    public int getCategoryID() {
        return categoryID;
    }

    /**
     * @param categoryID the categoryID to set
     */
    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

}
