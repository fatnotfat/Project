/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.login;

import java.io.Serializable;

/**
 *
 * @author Chau Nhat Truong
 */
public class LoginError implements Serializable{
    private String emailLengthError;
    private String passwordLengthError;
    private String loginFail;

    public LoginError() {
    }

    public LoginError(String emailLengthError, String passwordLengthError, String loginFail) {
        this.emailLengthError = emailLengthError;
        this.passwordLengthError = passwordLengthError;
        this.loginFail = loginFail;
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
     * @return the loginFail
     */
    public String getLoginFail() {
        return loginFail;
    }

    /**
     * @param loginFail the loginFail to set
     */
    public void setLoginFail(String loginFail) {
        this.loginFail = loginFail;
    }
}
