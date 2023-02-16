/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.verify;

import java.io.Serializable;

public class VerifyError implements Serializable {

    private String emailLengthError;
    private String emailNotExisted;
    private String codeLengthError;
    private String codeNotExisted;
    private String loginGoogleError;

    public VerifyError() {
    }

    public VerifyError(String emailLengthError, String emailNotExisted, String codeLengthError, String codeNotExisted, String loginGoogleError) {
        this.emailLengthError = emailLengthError;
        this.emailNotExisted = emailNotExisted;
        this.codeLengthError = codeLengthError;
        this.codeNotExisted = codeNotExisted;
        this.loginGoogleError = loginGoogleError;
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
     * @return the codeLengthError
     */
    public String getCodeLengthError() {
        return codeLengthError;
    }

    /**
     * @param codeLengthError the codeLengthError to set
     */
    public void setCodeLengthError(String codeLengthError) {
        this.codeLengthError = codeLengthError;
    }

    /**
     * @return the emailNotExisted
     */
    public String getEmailNotExisted() {
        return emailNotExisted;
    }

    /**
     * @param emailNotExisted the emailNotExisted to set
     */
    public void setEmailNotExisted(String emailNotExisted) {
        this.emailNotExisted = emailNotExisted;
    }

    /**
     * @return the codeNotExisted
     */
    public String getCodeNotExisted() {
        return codeNotExisted;
    }

    /**
     * @param codeNotExisted the codeNotExisted to set
     */
    public void setCodeNotExisted(String codeNotExisted) {
        this.codeNotExisted = codeNotExisted;
    }

    /**
     * @return the loginGoogleError
     */
    public String getLoginGoogleError() {
        return loginGoogleError;
    }

    /**
     * @param loginGoogleError the loginGoogleError to set
     */
    public void setLoginGoogleError(String loginGoogleError) {
        this.loginGoogleError = loginGoogleError;
    }

}
