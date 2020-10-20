package com.vku.ktx.model;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Students {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String sCode;

    @Column
    private String sName;

    @Column
    private Long phone;

    @Column
    private Long identification;
    
    @Column
    private String email;

    @Column
    private String gender;

    @Column
    private String address;

    @Column
    private String classroom;

    @Temporal(TemporalType.DATE)
    @Column
    private Date dob;

    
}
