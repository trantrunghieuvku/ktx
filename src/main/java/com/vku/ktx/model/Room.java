package com.vku.ktx.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String rName;

    @Column
    private String status;

    @Column
    private String quality;

    @Column
    private int amount;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "roomRegisters")
    private Set<Register> listRegisters = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    } 
}
