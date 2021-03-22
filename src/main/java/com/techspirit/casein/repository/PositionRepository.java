package com.techspirit.casein.repository;

import com.techspirit.casein.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position, Integer> {
}
