package com.aval.spring.offers.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "sb_struct")
public class Struct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String channel;

    @OneToOne(mappedBy = "struct")
    @JsonIgnore
    private ManagerInfo managerInfo;

    public Struct() {
    }

    public Struct(int id, String channel, ManagerInfo managerInfo) {
        this.id = id;
        this.channel = channel;
        this.managerInfo = managerInfo;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public ManagerInfo getManagerInfo() {
        return managerInfo;
    }

    public void setManagerInfo(ManagerInfo managerInfo) {
        this.managerInfo = managerInfo;
    }
}
