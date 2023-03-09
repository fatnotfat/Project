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

    private String firstNameLengthError;
    private String lastNameLengthError;
    private String passwordLengthError;
    private String emailLengthError;
    private String phoneLengthError;
    private String addressLengthError;
    private String birthDateLengthError;
    private String sexLengthError;
    private String confirmNotMatched;
    private String emailIsExisted;
    private String shippingIDLengthError;
    private String paymentIDLengthError;
    private String defaultOrNewShippingInforLengthError;
    private String cusInfoLengthError;

    public CustomerCreateError() {
    }

    public CustomerCreateError(String firstNameLengthError, String lastNameLengthError, String passwordLengthError, String emailLengthError, String phoneLengthError, String addressLengthError, String birthDateLengthError, String sexLengthError, String confirmNotMatched, String emailIsExisted, String shippingIDLengthError, String paymentIDLengthError) {
        this.firstNameLengthError = firstNameLengthError;
        this.lastNameLengthError = lastNameLengthError;
        this.passwordLengthError = passwordLengthError;
        this.emailLengthError = emailLengthError;
        this.phoneLengthError = phoneLengthError;
        this.addressLengthError = addressLengthError;
        this.birthDateLengthError = birthDateLengthError;
        this.sexLengthError = sexLengthError;
        this.confirmNotMatched = confirmNotMatched;
        this.emailIsExisted = emailIsExisted;
        this.shippingIDLengthError = shippingIDLengthError;
        this.paymentIDLengthError = paymentIDLengthError;
    }

    public String getCusInfoLengthError() {
        return cusInfoLengthError;
    }

    public void setCusInfoLengthError(String cusInfoLengthError) {
        this.cusInfoLengthError = cusInfoLengthError;
    }

    
    
    public String getDefaultOrNewShippingInforLengthError() {
        return defaultOrNewShippingInforLengthError;
    }

    public void setDefaultOrNewShippingInforLengthError(String defaultOrNewShippingInforLengthError) {
        this.defaultOrNewShippingInforLengthError = defaultOrNewShippingInforLengthError;
    }
    
    

    public String getFirstNameLengthError() {
        return firstNameLengthError;
    }

    public void setFirstNameLengthError(String firstNameLengthError) {
        this.firstNameLengthError = firstNameLengthError;
    }

    public String getLastNameLengthError() {
        return lastNameLengthError;
    }

    public void setLastNameLengthError(String lastNameLengthError) {
        this.lastNameLengthError = lastNameLengthError;
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

    /**
     * @return the shippingIDLengthError
     */
    public String getShippingIDLengthError() {
        return shippingIDLengthError;
    }

    /**
     * @param shippingIDLengthError the shippingIDLengthError to set
     */
    public void setShippingIDLengthError(String shippingIDLengthError) {
        this.shippingIDLengthError = shippingIDLengthError;
    }

    /**
     * @return the paymentIDLengthError
     */
    public String getPaymentIDLengthError() {
        return paymentIDLengthError;
    }

    /**
     * @param paymentIDLengthError the paymentIDLengthError to set
     */
    public void setPaymentIDLengthError(String paymentIDLengthError) {
        this.paymentIDLengthError = paymentIDLengthError;
    }

}
