package com.vku.ktx.model;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "user")   
public class Register {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String sCode;

    @Column
    private String gender;

    @Column
    private String address;

    @Column
    private String email;

    @Column
    private Date Dob;

    @Column
    private Long Identification;

    @Column
    private Long phone;

    @ManyToOne(targetEntity = Room.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="r_id")
    private Room roomRegisters;

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

    public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return Dob;
    }

    public void setDob(Date dob) {
        Dob = dob;
    }

    public Long getIdentification() {
        return Identification;
    }

    public void setIdentification(Long identification) {
        Identification = identification;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }
    public void setRoomRegisters(Room roomRegisters) {
        this.roomRegisters = roomRegisters;
    }

    public Room getRoomRegisters() {
        return roomRegisters;
    }
    
}
