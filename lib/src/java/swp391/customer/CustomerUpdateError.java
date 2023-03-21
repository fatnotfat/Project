/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.customer;

import java.io.Serializable;

/**
 *
 * @author Chau Nhat Truong
 */
public class CustomerUpdateError implements Serializable{
    private String firstNameLengthError;
    private String lastNameLengthError;
    private String passwordLengthError;
    private String emailLengthError;
    private String phoneLengthError;
    private String addressLengthError;
    private String birthDateLengthError;
    private String sexLengthError;
    private String confirmNotMatched;

    public CustomerUpdateError() {
    }

    public CustomerUpdateError(String firstNameLengthError, String lastNameLengthError, String passwordLengthError, String emailLengthError, String phoneLengthError, String addressLengthError, String birthDateLengthError, String sexLengthError, String confirmNotMatched) {
        this.firstNameLengthError = firstNameLengthError;
        this.lastNameLengthError = lastNameLengthError;
        this.passwordLengthError = passwordLengthError;
        this.emailLengthError = emailLengthError;
        this.phoneLengthError = phoneLengthError;
        this.addressLengthError = addressLengthError;
        this.birthDateLengthError = birthDateLengthError;
        this.sexLengthError = sexLengthError;
        this.confirmNotMatched = confirmNotMatched;
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
     * @return the firstNameLengthError
     */
    public String getFirstNameLengthError() {
        return firstNameLengthError;
    }

    /**
     * @param firstNameLengthError the firstNameLengthError to set
     */
    public void setFirstNameLengthError(String firstNameLengthError) {
        this.firstNameLengthError = firstNameLengthError;
    }

    /**
     * @return the lastNameLengthError
     */
    public String getLastNameLengthError() {
        return lastNameLengthError;
    }

    /**
     * @param lastNameLengthError the lastNameLengthError to set
     */
    public void setLastNameLengthError(String lastNameLengthError) {
        this.lastNameLengthError = lastNameLengthError;
    }

    /**
     * @return the emailLengthError
     */
    public String getEmailLengthError() {
        return emailLengthError;
    }

    /**
     * @param emailLengthError the emailLengthError to set
     */
    public void setEmailLengthError(String emailLengthError) {
        this.emailLengthError = emailLengthError;
    }

    /**
     * @return the phoneLengthError
     */
    public String getPhoneLengthError() {
        return phoneLengthError;
    }

    /**
     * @param phoneLengthError the phoneLengthError to set
     */
    public void setPhoneLengthError(String phoneLengthError) {
        this.phoneLengthError = phoneLengthError;
    }

    /**
     * @return the addressLengthError
     */
    public String getAddressLengthError() {
        return addressLengthError;
    }

    /**
     * @param addressLengthError the addressLengthError to set
     */
    public void setAddressLengthError(String addressLengthError) {
        this.addressLengthError = addressLengthError;
    }

    /**
     * @return the birthDateLengthError
     */
    public String getBirthDateLengthError() {
        return birthDateLengthError;
    }

    /**
     * @param birthDateLengthError the birthDateLengthError to set
     */
    public void setBirthDateLengthError(String birthDateLengthError) {
        this.birthDateLengthError = birthDateLengthError;
    }

    /**
     * @return the sexLengthError
     */
    public String getSexLengthError() {
        return sexLengthError;
    }

    /**
     * @param sexLengthError the sexLengthError to set
     */
    public void setSexLengthError(String sexLengthError) {
        this.sexLengthError = sexLengthError;
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
    
    
}
