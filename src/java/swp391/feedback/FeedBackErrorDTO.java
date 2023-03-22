/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.feedback;

import java.io.Serializable;

/**
 *
 * @author nguye
 */
public class FeedBackErrorDTO implements Serializable{
    private String votingError;
    private String commentError;

    public FeedBackErrorDTO() {
    }

    public FeedBackErrorDTO(String votingError, String commentError) {
        this.votingError = votingError;
        this.commentError = commentError;
    }

    /**
     * @return the votingError
     */
    public String getVotingError() {
        return votingError;
    }

    /**
     * @param votingError the votingError to set
     */
    public void setVotingError(String votingError) {
        this.votingError = votingError;
    }

    /**
     * @return the commentError
     */
    public String getCommentError() {
        return commentError;
    }

    /**
     * @param commentError the commentError to set
     */
    public void setCommentError(String commentError) {
        this.commentError = commentError;
    }
    
    
}
