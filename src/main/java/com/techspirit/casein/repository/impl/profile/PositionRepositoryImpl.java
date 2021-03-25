package com.techspirit.casein.repository.impl.profile;

import com.techspirit.casein.model.profile.Position;
import com.techspirit.casein.repository.api.profile.PositionRepository;
import com.techspirit.casein.repository.impl.AbstractRepository;
import com.techspirit.casein.repository.impl.profile.crud.CrudPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PositionRepositoryImpl extends AbstractRepository<Position> implements PositionRepository {

    @Autowired
    public PositionRepositoryImpl(CrudPositionRepository crudRepository) {
        super(crudRepository);
    }

    @Override
    public List<Position> getAll() {
        return crudRepository.findAll();
    }

}
