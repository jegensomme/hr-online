package com.techspirit.casein.repository;

import com.techspirit.casein.model.Progress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgressRepository extends JpaRepository<Progress, Integer> {
}
