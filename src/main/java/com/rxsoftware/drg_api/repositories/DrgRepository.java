package com.rxsoftware.drg_api.repositories;

import com.rxsoftware.drg_api.domain.DRG;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrgRepository extends JpaRepository<DRG, String> {
}
