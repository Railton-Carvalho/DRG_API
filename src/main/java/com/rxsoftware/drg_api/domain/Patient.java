package com.rxsoftware.drg_api.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "tb_patients")
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Patient implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = false, length = 11)
    private String cpf;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String sex;

    @ManyToOne
    @JoinColumn(name = "principal_diagnosis_id")
    private Diagnosis principalDiagnosis;

    @OneToMany(mappedBy = "patient")
    private Set<PatientProcedure> patientProcedures;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "tb_patient_comorbidity",
            joinColumns = @JoinColumn(name = "patient_id"),
            inverseJoinColumns = @JoinColumn(name = "comorbidity_id")
    )
    private Set<Comorbidity> comorbidities =  new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;

    @Column(nullable = false)
    private int lengthOfStay;

    @Column(nullable = false)
    private boolean admittedInICU;
}
