/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.size;

import java.io.Serializable;

/**
 *
 * @author nguye
 */
public class SizeDTO implements Serializable{
    private int sizeID;
    private int size;
    private boolean status;
    private int productID;

    public SizeDTO() {
    }

    public SizeDTO(int sizeID, int size, boolean status, int productID) {
        this.sizeID = sizeID;
        this.size = size;
        this.status = status;
        this.productID = productID;
    }

    
    
    
    /**
     * @return the sizeID
     */
    public int getSizeID() {
        return sizeID;
    }

    /**
     * @param sizeID the sizeID to set
     */
    public void setSizeID(int sizeID) {
        this.sizeID = sizeID;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the productID
     */
    public int getProductID() {
        return productID;
    }

    /**
     * @param productID the productID to set
     */
    public void setProductID(int productID) {
        this.productID = productID;
    }
    
    
}
