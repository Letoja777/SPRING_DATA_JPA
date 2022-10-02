package com.aval.spring.offers.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "co_cm_search_feedback_comment")
public class FeedbackComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "commentary")
    private String comment;

    @OneToMany(mappedBy = "feedbackComment")
    @JsonIgnore
    private List<OfferFeedback> offerFeedback;

    public FeedbackComment() {
    }

    public FeedbackComment(int id, String comment, List<OfferFeedback> offerFeedback) {
        this.id = id;
        this.comment = comment;
        this.offerFeedback = offerFeedback;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<OfferFeedback> getOfferFeedback() {
        return offerFeedback;
    }

    public void setOfferFeedback(List<OfferFeedback> offerFeedback) {
        this.offerFeedback = offerFeedback;
    }
}
