package com.rxsoftware.drg_api.repositories;


import com.rxsoftware.drg_api.domain.FinancialReport;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FinancialReportRepository extends JpaRepository<FinancialReport, String> {
}
