package com.rxsoftware.drg_api.domain;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "tb_financialReports")
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class FinancialReport implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "hospital_id", nullable = false)
    private Hospital hospital;

    @ManyToOne
    @JoinColumn(name = "drg_code", nullable = false)
    private DRG drg;

    @Column(name = "report_date", nullable = false)
    private LocalDate reportDate;

    @Column(name = "total_expense", nullable = false)
    private Double totalExpense;

    @Column(name = "average_patient_cost", nullable = false)
    private Double averagePatientCost;

    @Column(name = "above_average_percentage")
    private Double aboveAveragePercentage;

    @Column(name = "estimated_cost_difference")
    private Double estimatedCostDifference;
}
