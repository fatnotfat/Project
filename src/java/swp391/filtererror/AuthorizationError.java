/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.filtererror;

import java.io.Serializable;

/**
 *
 * @author nguye
 */
public class AuthorizationError implements Serializable {

    private String authorError;

    public String getAuthorError() {
        return authorError;
    }

    public void setAuthorError(String authorError) {
        this.authorError = authorError;
    }
}
