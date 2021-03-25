package com.techspirit.casein.repository.api.profile;

import com.techspirit.casein.model.profile.Position;
import com.techspirit.casein.repository.api.Repository;

import java.util.List;

public interface PositionRepository extends Repository<Position> {
    List<Position> getAll();
}
