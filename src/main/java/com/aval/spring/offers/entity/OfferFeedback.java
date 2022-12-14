package com.aval.spring.offers.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
@Entity
@Table(name = "offer_feedback")
public class OfferFeedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "description")
    private String description;
    @Column(name = "date_create")
    private String date;
    @OneToOne(mappedBy = "feedback")
    @JsonIgnore
    private Offers offers;
    @ManyToOne
    @JoinColumn(name = "state")
    private FeedbackState feedbackState;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private ManagerInfo managerInfo;
    @ManyToOne(fetch = FetchType.LAZY)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "id_comment")
    private FeedbackComment feedbackComment;
    public OfferFeedback() {
    }
    public OfferFeedback(int id, String description, String date, Offers offers, FeedbackState feedbackState, ManagerInfo managerInfo, FeedbackComment feedbackComment) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.offers = offers;
        this.feedbackState = feedbackState;
        this.managerInfo = managerInfo;
        this.feedbackComment = feedbackComment;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public Offers getOffers() {
        return offers;
    }
    public void setOffers(Offers offers) {
        this.offers = offers;
    }
    public FeedbackState getFeedbackState() {
        return feedbackState;
    }
    public void setFeedbackState(FeedbackState feedbackState) {
        this.feedbackState = feedbackState;
    }
    public ManagerInfo getManagerInfo() {
        return managerInfo;
    }
    public void setManagerInfo(ManagerInfo managerInfo) {
        this.managerInfo = managerInfo;
    }
    public FeedbackComment getFeedbackComment() {
        return feedbackComment;
    }
    public void setFeedbackComment(FeedbackComment feedbackComment) {
        this.feedbackComment = feedbackComment;
    }
}
