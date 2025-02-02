package com.rxsoftware.drg_api.domain;


import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "tb_diagnoses")
@Data
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Diagnosis implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false, unique = true)
    private String cid10Code;

    @Column(nullable = false, length = 255)
    private String description;

}
