package com.rxsoftware.drg_api.repositories;

import com.rxsoftware.drg_api.domain.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, String> {
}
