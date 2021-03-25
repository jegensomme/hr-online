package com.techspirit.casein.service.impl.profile;

import com.techspirit.casein.model.profile.Position;
import com.techspirit.casein.repository.api.profile.PositionRepository;
import com.techspirit.casein.service.prototype.profile.ServicePosition;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class PositionService implements ServicePosition {

    private final PositionRepository positionRepository;

    @Override
    public Position create(Position position) {
        Assert.notNull(position, "profile must not be null");
        return positionRepository.save(position);
    }

    @Override
    public List<Position> readALL() {
        return positionRepository.getAll();
    }

    @Override
    public Position read(int id) {
        return checkNotFoundWithId(positionRepository.get(id), id);
    }

    @Override
    public void update(Position position, int id) {
        checkNotFoundWithId(positionRepository.save(position), id);
    }

    @Override
    public void delete(int id) {
        checkNotFoundWithId(positionRepository.delete(id), id);
    }
}
