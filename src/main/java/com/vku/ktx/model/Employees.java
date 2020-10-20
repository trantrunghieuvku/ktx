package com.vku.ktx.model;

import javax.persistence.*;

@Entity
public class Employees {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String eName;

    @Column
    private String Address;

    @Column
    private Long phone;
    
    @Column
    private String gender;
}
