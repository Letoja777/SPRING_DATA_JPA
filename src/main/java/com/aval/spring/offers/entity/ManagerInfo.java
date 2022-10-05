package com.aval.spring.offers.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "manager_info")
public class ManagerInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_login")
    private String id;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "patronymic")
    private String patronymic;

    @OneToMany(mappedBy = "managerInfo")
    @JsonIgnore
    private List<OfferFeedback> offerFeedback;

    @OneToOne
    @JoinColumn(name = "struct")
    private Struct struct;
    @Transient
    @JsonProperty("editable")
    private int editable = 1;

    public ManagerInfo() {
    }

    public ManagerInfo(String id, String lastname, String firstname, String patronymic, List<OfferFeedback> offerFeedback, Struct struct, int editable) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.offerFeedback = offerFeedback;
        this.struct = struct;
        this.editable = editable;
    }


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public List<OfferFeedback> getOfferFeedback() {
        return offerFeedback;
    }

    public void setOfferFeedback(List<OfferFeedback> offerFeedback) {
        this.offerFeedback = offerFeedback;
    }

    public Struct getStruct() {
        return struct;
    }

    public void setStruct(Struct struct) {
        this.struct = struct;
    }

    public String getId() {
        return id;
    }

    public int getEditable() {
        return editable;
    }

    public void setEditable(int editable) {
        this.editable = editable;
    }
}
