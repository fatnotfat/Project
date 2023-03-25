/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.feedback;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author nguye
 */
public class FeedBackDTO implements Serializable{
    private int productID;
    private int customerID;
    private String textComment;
    private int voting;
    private boolean status;
    private Date feedBackTime;

    public FeedBackDTO() {
    }

    public FeedBackDTO(int productID, int customerID, String textComment, int voting, Date feedBackTime) {
        this.productID = productID;
        this.customerID = customerID;
        this.textComment = textComment;
        this.voting = voting;
        this.feedBackTime = feedBackTime;
    }

    public FeedBackDTO(int productID, int customerID, String textComment, int voting, boolean status, Date feedBackTime) {
        this.productID = productID;
        this.customerID = customerID;
        this.textComment = textComment;
        this.voting = voting;
        this.status = status;
        this.feedBackTime = feedBackTime;
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

    /**
     * @return the customerID
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     * @return the textComment
     */
    public String getTextComment() {
        return textComment;
    }

    /**
     * @param textComment the textComment to set
     */
    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }

    /**
     * @return the voting
     */
    public int getVoting() {
        return voting;
    }

    /**
     * @param voting the voting to set
     */
    public void setVoting(int voting) {
        this.voting = voting;
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
     * @return the feedBackTime
     */
    public Date getFeedBackTime() {
        return feedBackTime;
    }

    /**
     * @param feedBackTime the feedBackTime to set
     */
    public void setFeedBackTime(Date feedBackTime) {
        this.feedBackTime = feedBackTime;
    }
    
    
}
