package com.techspirit.casein.repository.impl;

import com.techspirit.casein.model.BaseEntity;
import com.techspirit.casein.repository.api.DependentRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

@AllArgsConstructor
public abstract class AbstractDependentRepository<E extends BaseEntity, PE extends BaseEntity> implements DependentRepository<E> {

    protected final JpaRepository<E, Integer> crudRepository;
    protected final JpaRepository<PE, Integer> parentCrudRepository;

    @Override
    public E save(E entity, int pid) {
        if (!entity.isNew() && get(entity.getId(), pid) == null) {
            return null;
        }
        setParent(entity, parentCrudRepository.getOne(pid));
        return crudRepository.save(entity);
    }

    @Override
    public boolean delete(int id, int pid) {
        return false;
    }

    @Override
    public E get(int id, int pid) {
        return crudRepository.findById(id)
                .filter(entity -> checkParent(entity, pid))
                .orElse(null);
    }

    protected abstract void setParent(E entity, PE parent);

    protected abstract boolean checkParent(E entity, int pid);
}
