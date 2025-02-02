package com.rxsoftware.drg_api.repositories;

import com.rxsoftware.drg_api.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, String> {


}
