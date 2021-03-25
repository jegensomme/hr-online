package com.techspirit.casein.repository.impl.profile.crud;

import com.techspirit.casein.model.profile.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudPositionRepository extends JpaRepository<Position, Integer> {
}
