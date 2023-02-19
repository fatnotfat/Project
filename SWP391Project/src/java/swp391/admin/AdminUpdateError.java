/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.admin;

import java.io.Serializable;

/**
 *
 * @author Chau Nhat Truong
 */
public class AdminUpdateError implements Serializable{
    private String nameLengthError;
    private String descriptionLengthError;

    public AdminUpdateError() {
    }

    public AdminUpdateError(String nameLengthError, String descriptionLengthError) {
        this.nameLengthError = nameLengthError;
        this.descriptionLengthError = descriptionLengthError;
    }

    /**
     * @return the nameLengthError
     */
    public String getNameLengthError() {
        return nameLengthError;
    }

    /**
     * @param nameLengthError the nameLengthError to set
     */
    public void setNameLengthError(String nameLengthError) {
        this.nameLengthError = nameLengthError;
    }

    /**
     * @return the descriptionLengthError
     */
    public String getDescriptionLengthError() {
        return descriptionLengthError;
    }

    /**
     * @param descriptionLengthError the descriptionLengthError to set
     */
    public void setDescriptionLengthError(String descriptionLengthError) {
        this.descriptionLengthError = descriptionLengthError;
    }
    
    
}
