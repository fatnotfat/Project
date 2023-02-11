/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.feedback;

import java.util.Date;

/**
 *
 * @author Duy
 */
public class FeedbackDTO {
    private int feBID;
    private Date feedBackTime;
    private String textComments;
    private double voting;
    private boolean status;

    public FeedbackDTO() {
    }

    public FeedbackDTO(int feBID, Date feedBackTime, String textComments, double voting, boolean status) {
        this.feBID = feBID;
        this.feedBackTime = feedBackTime;
        this.textComments = textComments;
        this.voting = voting;
        this.status = status;
    }

    public int getFeBID() {
        return feBID;
    }

    public void setFeBID(int feBID) {
        this.feBID = feBID;
    }

    public Date getFeedBackTime() {
        return feedBackTime;
    }

    public void setFeedBackTime(Date feedBackTime) {
        this.feedBackTime = feedBackTime;
    }

    public String getTextComments() {
        return textComments;
    }

    public void setTextComments(String textComments) {
        this.textComments = textComments;
    }

    public double getVoting() {
        return voting;
    }

    public void setVoting(double voting) {
        this.voting = voting;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
