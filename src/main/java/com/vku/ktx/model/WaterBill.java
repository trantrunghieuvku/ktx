package com.vku.ktx.model;

import javax.persistence.*;

@Entity
public class WaterBill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int hIndex;

    @Column
    private int fIndex;

    @Column
    private Long unit;
    
}
