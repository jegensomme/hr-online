package com.techspirit.casein.repository;

import com.techspirit.casein.model.Employment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmploymentRepository extends JpaRepository<Employment, Integer> {
}
