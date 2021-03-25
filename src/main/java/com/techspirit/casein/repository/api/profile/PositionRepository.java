package com.techspirit.casein.repository.api.profile;

import com.techspirit.casein.model.profile.Position;

import java.util.List;

public interface PositionRepository {

    // null if not found, when updated
    Position save(Position position);

    // false if not found
    boolean delete(int id);

    // null if not found
    Position get(int id);

    List<Position> getAll();
}
