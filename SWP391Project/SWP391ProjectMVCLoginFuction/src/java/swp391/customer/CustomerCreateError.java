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
public class CustomerCreateError implements Serializable {

    private String nameLengthError;
    private String passwordLengthError;
    private String emailLengthError;
    private String phoneLengthError;
    private String addressLengthError;
    private String birthDateLengthError;
    private String sexLengthError;
    private String confirmNotMatched;
    private String emailIsExisted;

    public CustomerCreateError() {
    }

    public CustomerCreateError(String nameLengthError, String passwordLengthError, String emailLengthError, String phoneLengthError, String addressLengthError, String birthDateLengthError, String sexLengthError, String confirmNotMatched, String emailIsExisted) {
        this.nameLengthError = nameLengthError;
        this.passwordLengthError = passwordLengthError;
        this.emailLengthError = emailLengthError;
        this.phoneLengthError = phoneLengthError;
        this.addressLengthError = addressLengthError;
        this.birthDateLengthError = birthDateLengthError;
        this.sexLengthError = sexLengthError;
        this.confirmNotMatched = confirmNotMatched;
        this.emailIsExisted = emailIsExisted;
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
     * @return the emailIsExisted
     */
    public String getEmailIsExisted() {
        return emailIsExisted;
    }

    /**
     * @param emailIsExisted the emailIsExisted to set
     */
    public void setEmailIsExisted(String emailIsExisted) {
        this.emailIsExisted = emailIsExisted;
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

}
