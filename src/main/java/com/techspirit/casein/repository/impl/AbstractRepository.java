package com.techspirit.casein.repository.impl;

import com.techspirit.casein.model.BaseEntity;
import com.techspirit.casein.repository.api.Repository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

@AllArgsConstructor
public class AbstractRepository<E extends BaseEntity> implements Repository<E> {

    protected final JpaRepository<E, Integer> crudRepository;

    @Override
    public E save(E entity) {
        return crudRepository.save(entity);
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public E get(int id) {
        return crudRepository.findById(id).orElse(null);
    }
}
