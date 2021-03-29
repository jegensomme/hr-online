package com.techspirit.casein.service.impl.profile;

import com.techspirit.casein.model.profile.Position;
import com.techspirit.casein.repository.api.profile.PositionRepository;
import com.techspirit.casein.service.prototype.profile.ServicePosition;
import com.techspirit.casein.util.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class PositionService implements ServicePosition {

    private final PositionRepository repository;

    @Override
    public Position create(Position position) {
        Assert.notNull(position, "profile must not be null");
        return repository.save(position);
    }

    @Override
    public List<Position> readALL() {
        return repository.getAll();
    }

    @Override
    public Position read(int id) throws NotFoundException {
        return checkNotFoundWithId(repository.get(id), id);
    }

    @Override
    public void update(Position position, int id) throws NotFoundException {
        checkNotFoundWithId(repository.save(position), id);
    }

    @Override
    public void delete(int id) throws NotFoundException {
        checkNotFoundWithId(repository.delete(id), id);
    }
}
