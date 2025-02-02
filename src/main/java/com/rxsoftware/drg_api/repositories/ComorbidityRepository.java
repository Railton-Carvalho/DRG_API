package com.rxsoftware.drg_api.repositories;

import com.rxsoftware.drg_api.domain.Comorbidity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComorbidityRepository extends JpaRepository<Comorbidity, String> {
}
