package com.rxsoftware.drg_api.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name= "tb_hospitals")
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Hospital implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = false, unique = true, length = 18)
    private String cnpj;

    @Column(nullable = false, length = 255)
    private String address;

    @Column(name = "bed_capacity", nullable = false)
    private Integer bedCapacity;

    @Column(name = "current_occupancy", nullable = false)
    private Integer currentOccupancy;

    @Column(name = "average_drg_cost", nullable = false)
    private Double averageDrgCost;

    @Column(name = "specialties", nullable = false, length = 500)
    private String specialties;

    @OneToMany(mappedBy = "hospital")
    private Set<Patient> patients;

    @OneToMany(mappedBy = "hospital")
    private Set<FinancialReport> financialReports;

}
