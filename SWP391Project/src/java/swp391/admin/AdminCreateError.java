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
public class AdminCreateError implements Serializable {

    private String usernameLengthError;
    private String passwordLengthError;
    private String nameLengthError;
    private String quantityError;
    private String priceError;
    private String sizeError;
    private String confirmNotMatched;
    private String descriptionLengthError;

    public AdminCreateError() {
    }

    public AdminCreateError(String usernameLengthError, String passwordLengthError, String nameLengthError, String confirmNotMatched, String descriptionLengthError) {
        this.usernameLengthError = usernameLengthError;
        this.passwordLengthError = passwordLengthError;
        this.nameLengthError = nameLengthError;
        this.confirmNotMatched = confirmNotMatched;
        this.descriptionLengthError = descriptionLengthError;
    }
    
    /**
     * @return the usernameLengthError
     */
    public String getUsernameLengthError() {
        return usernameLengthError;
    }

    /**
     * @param usernameLengthError the usernameLengthError to set
     */
    public void setUsernameLengthError(String usernameLengthError) {
        this.usernameLengthError = usernameLengthError;
    }

    /**
     * @return the passwordLengthError
     */
    public String getPasswordLengthError() {
        return passwordLengthError;
    }

    /**
     * @param passwordLengthError the passwordLengthError to set
     */
    public void setPasswordLengthError(String passwordLengthError) {
        this.passwordLengthError = passwordLengthError;
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
     * @return the confirmNotMatched
     */
    public String getConfirmNotMatched() {
        return confirmNotMatched;
    }

    /**
     * @param confirmNotMatched the confirmNotMatched to set
     */
    public void setConfirmNotMatched(String confirmNotMatched) {
        this.confirmNotMatched = confirmNotMatched;
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

    /**
     * @return the quantityError
     */
    public String getQuantityError() {
        return quantityError;
    }

    /**
     * @param quantityError the quantityError to set
     */
    public void setQuantityError(String quantityError) {
        this.quantityError = quantityError;
    }

    /**
     * @return the priceError
     */
    public String getPriceError() {
        return priceError;
    }

    /**
     * @param priceError the priceError to set
     */
    public void setPriceError(String priceError) {
        this.priceError = priceError;
    }

    /**
     * @return the sizeError
     */
    public String getSizeError() {
        return sizeError;
    }

    /**
     * @param sizeError the sizeError to set
     */
    public void setSizeError(String sizeError) {
        this.sizeError = sizeError;
    }

}
