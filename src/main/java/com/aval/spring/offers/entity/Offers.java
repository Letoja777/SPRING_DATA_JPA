package com.aval.spring.offers.entity;

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
    @Column(name = "category")
    private int category;
    @Column(name = "date_change")
    private String date;

    @OneToOne
    @JoinColumn(name = "id")
    private OfferFeedback feedback;

    public Offers() {
    }

    public Offers(int id, String name, int category, String date, OfferFeedback feedback) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.date = date;
        this.feedback = feedback;
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

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public OfferFeedback getFeedback() {
        return feedback;
    }

    public void setFeedback(OfferFeedback feedback) {
        this.feedback = feedback;
    }

}
