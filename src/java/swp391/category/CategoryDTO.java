/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.category;

/**
 *
 * @author Duy
 */
public class CategoryDTO {
    private int cateID;
    private String name;
    private String description;
    private boolean status;

    public CategoryDTO() {
    }

    public CategoryDTO(int cateID, String name, String description, boolean status) {
        this.cateID = cateID;
        this.name = name;
        this.description = description;
        this.status = status;
    }

    public int getCateID() {
        return cateID;
    }

    public void setCateID(int cateID) {
        this.cateID = cateID;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    
    
}
