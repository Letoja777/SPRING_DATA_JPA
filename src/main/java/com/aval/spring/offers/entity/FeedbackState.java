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
    private String name;

    @OneToMany(mappedBy = "feedbackState")
    @JsonIgnore
    private List<OfferFeedback> offerFeedback;

    public FeedbackState() {
    }

    public FeedbackState(int id, String name, List <OfferFeedback> offerFeedback) {
        this.id = id;
        this.name = name;
        this.offerFeedback = offerFeedback;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<OfferFeedback> getOfferFeedback() {
        return offerFeedback;
    }

    public void setOfferFeedback(List<OfferFeedback> offerFeedback) {
        this.offerFeedback = offerFeedback;
    }
}
