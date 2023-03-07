/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.shippingmethod;

/**
 *
 * @author Duy
 */
public class ShippingMethodDTO {
    private int shippingID;
    private String nameOfMethod;
    private Float transportFee;

    public ShippingMethodDTO() {
    }

    public ShippingMethodDTO(int shippingID, String nameOfMethod, Float transportFee) {
        this.shippingID = shippingID;
        this.nameOfMethod = nameOfMethod;
        this.transportFee = transportFee;
    }

    public int getShippingID() {
        return shippingID;
    }

    public void setShippingID(int shippingID) {
        this.shippingID = shippingID;
    }

    public String getNameOfMethod() {
        return nameOfMethod;
    }

    public void setNameOfMethod(String nameOfMethod) {
        this.nameOfMethod = nameOfMethod;
    }

    public Float getTransportFee() {
        return transportFee;
    }

    public void setTransportFee(Float transportFee) {
        this.transportFee = transportFee;
    }
   
}
