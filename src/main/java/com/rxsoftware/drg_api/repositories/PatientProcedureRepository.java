package com.rxsoftware.drg_api.repositories;

import com.rxsoftware.drg_api.domain.PatientProcedure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientProcedureRepository extends JpaRepository<PatientProcedure, Long> {
}
