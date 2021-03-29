package com.techspirit.casein.service.profile;

import com.techspirit.casein.model.profile.Position;
import com.techspirit.casein.repository.api.profile.PositionRepository;
import com.techspirit.casein.util.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class PositionService {

    private final PositionRepository repository;

    public Position create(Position position) {
        Assert.notNull(position, "profile must not be null");
        return repository.save(position);
    }

    public List<Position> readALL() {
        return repository.getAll();
    }

    public Position read(int id) throws NotFoundException {
        return checkNotFoundWithId(repository.get(id), id);
    }

    public void update(Position position, int id) throws NotFoundException {
        checkNotFoundWithId(repository.save(position), id);
    }

    public void delete(int id) throws NotFoundException {
        checkNotFoundWithId(repository.delete(id), id);
    }
}
