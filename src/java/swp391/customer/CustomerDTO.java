/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.customer;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Chau Nhat Truong
 */
public class CustomerDTO implements Serializable {
    
    private int customerID;
    private String name;
    private String password;
    private Date birthDate;
    private String email;
    private String phone;
    private String address;
    private boolean role;
    private int rankID;
    private boolean sex;
    private int typeOfLogin;

    public CustomerDTO() {
    }
    
    public CustomerDTO(String name) {
        this.name = name;
    }

    public CustomerDTO(int customerID, String name, Date birthDate, String email, String phone, String address, int rankID, boolean sex, int typeOfLogin) {
        this.customerID = customerID;
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.rankID = rankID;
        this.sex = sex;
        this.typeOfLogin = typeOfLogin;
    }
    
    
    public CustomerDTO(String name, String password, Date birthDate,
            String email, String phone, String address, boolean role, int rankID, boolean sex, int typeOfLogin) {
        this.name = name;
        this.password = password;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.role = role;
        this.rankID = rankID;
        this.sex = sex;
        this.typeOfLogin = typeOfLogin;
    }
    
    
    public CustomerDTO(String name, Date birthDate,
            String email, String phone, String address, boolean role, int rankID, boolean sex, int typeOfLogin) {
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.role = role;
        this.rankID = rankID;
        this.sex = sex;
        this.typeOfLogin = typeOfLogin;
    }
    public CustomerDTO(int customerID, String name, String email, String phone, String address) {
        this.customerID = customerID;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
    
    
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
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
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the role
     */
    public boolean isRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(boolean role) {
        this.role = role;
    }

    /**
     * @return the rankID
     */
    public int getRankID() {
        return rankID;
    }

    /**
     * @param rankID the rankID to set
     */
    public void setRankID(int rankID) {
        this.rankID = rankID;
    }

    /**
     * @return the sex
     */
    public boolean isSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getTypeOfLogin() {
        return typeOfLogin;
    }

    public void setTypeOfLogin(int typeOfLogin) {
        this.typeOfLogin = typeOfLogin;
    }

    

}
