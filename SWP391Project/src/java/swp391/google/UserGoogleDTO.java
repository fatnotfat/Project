/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.google;

import java.io.Serializable;

/**
 *
 * @author nguye
 */
public class UserGoogleDTO implements Serializable{

    private String id;

    private String email;

    private boolean verified_email;

    private String name;

    private String given_name;

    private String family_name;

    private String picture;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the verified_email
     */
    public boolean isVerified_email() {
        return verified_email;
    }

    /**
     * @param verified_email the verified_email to set
     */
    public void setVerified_email(boolean verified_email) {
        this.verified_email = verified_email;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the given_name
     */
    public String getGiven_name() {
        return given_name;
    }

    /**
     * @param given_name the given_name to set
     */
    public void setGiven_name(String given_name) {
        this.given_name = given_name;
    }

    /**
     * @return the family_name
     */
    public String getFamily_name() {
        return family_name;
    }

    /**
     * @param family_name the family_name to set
     */
    public void setFamily_name(String family_name) {
        this.family_name = family_name;
    }

    /**
     * @return the picture
     */
    public String getPicture() {
        return picture;
    }

    /**
     * @param picture the picture to set
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "UserGoogleDTO{" + "id=" + id + ", email=" + email + ", verified_email=" + verified_email + ", name=" + name + ", given_name=" + given_name + ", family_name=" + family_name + ", picture=" + picture + '}';
    }

}
