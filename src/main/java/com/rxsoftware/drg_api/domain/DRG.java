package com.rxsoftware.drg_api.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "tb_DRGs")
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class DRG implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false, unique = true)
    private String drgCode;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private double averageCost;

    @Column(nullable = false)
    private double minCost;

    @Column(nullable = false)
    private double maxCost;

    @Column(nullable = false)
    private int averageTime;// DAYS

    @Column(nullable = false)
    private double icuPercentage;

    @Column(nullable = false)
    private boolean admittedInIcu;

}
