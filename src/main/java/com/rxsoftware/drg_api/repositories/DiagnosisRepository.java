package com.rxsoftware.drg_api.repositories;

import com.rxsoftware.drg_api.domain.Diagnosis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiagnosisRepository extends JpaRepository<Diagnosis, String> {

}
