package com.aval.spring.offers.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "co_cm_search_feedback_state")
public class FeedbackState {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String state;

    @OneToMany(mappedBy = "feedbackState")
    @JsonIgnore
    private List<OfferFeedback> offerFeedback;

    public FeedbackState() {
    }

    public FeedbackState(int id, String state, List <OfferFeedback> offerFeedback) {
        this.id = id;
        this.state = state;
        this.offerFeedback = offerFeedback;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<OfferFeedback> getOfferFeedback() {
        return offerFeedback;
    }

    public void setOfferFeedback(List<OfferFeedback> offerFeedback) {
        this.offerFeedback = offerFeedback;
    }
}
