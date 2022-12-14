package com.aval.spring.offers.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "co_cm_offer")
public class Offers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "id")
    private OfferFeedback feedback;

    @OneToOne
    @JoinColumn(name = "category")
    private OfferSubject subject;

    @Transient
    @JsonProperty("completed")
    private int completed = 1;


    public Offers() {
    }

    public Offers(int id, String name, OfferFeedback feedback, OfferSubject subject, int completed) {
        this.id = id;
        this.name = name;
        this.feedback = feedback;
        this.subject = subject;
        this.completed = completed;
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

    public OfferFeedback getFeedback() {
        return feedback;
    }

    public void setFeedback(OfferFeedback feedback) {
        this.feedback = feedback;
    }

    public OfferSubject getSubject() {
        return subject;
    }

    public void setSubject(OfferSubject subject) {
        this.subject = subject;
    }

    public int getCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }
}
