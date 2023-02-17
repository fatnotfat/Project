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
public class AdminLoginError implements Serializable {

    private String usernameLengthError;
    private String passwordLengthError;
    private String loginFail;

    public AdminLoginError() {
    }

    public AdminLoginError(String usernameLengthError, String passwordLengthError, String loginFail) {
        this.usernameLengthError = usernameLengthError;
        this.passwordLengthError = passwordLengthError;
        this.loginFail = loginFail;
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
