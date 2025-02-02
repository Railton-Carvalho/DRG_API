package com.rxsoftware.drg_api.domain;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "tb_procedures")
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Procedure implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "tuss_code", nullable = false, length = 255)
    private String tussCode;

    @Column(nullable = false, length = 255)
    private String description;

    @Column(name = "average_cost", nullable = false)
    private double averageCost;

    @Column(name = "execute_time", nullable = false)
    private int executeTime;

    @OneToMany(mappedBy = "procedure")
    private Set<PatientProcedure> patientProcedures;


}
