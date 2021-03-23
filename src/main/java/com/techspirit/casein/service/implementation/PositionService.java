package com.techspirit.casein.service.implementation;

import com.techspirit.casein.model.Position;
import com.techspirit.casein.repository.PositionRepository;
import com.techspirit.casein.service.prototype.ServicePosition;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService implements ServicePosition {
    private final PositionRepository positionRepository;

    public PositionService(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    @Override
    public void create(Position position) {
        positionRepository.save(position);
    }

    @Override
    public List<Position> readALL(){
        return positionRepository.findAll();
    }

    @Override
    public Position read(int id){
        return positionRepository.getOne(id);
    }

    @Override
    public boolean update(Position position, int id)
    {
        if(positionRepository.existsById(id)) {
            position.setId(id);
            positionRepository.save(position);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id)
    {
        if (positionRepository.existsById(id))
        {
            positionRepository.deleteById(id);
            return  true;
        }
        return false;
    }
}
