package com.rxsoftware.drg_api.repositories;

import com.rxsoftware.drg_api.domain.Procedure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcedureRepository extends JpaRepository<Procedure, String> {
}
