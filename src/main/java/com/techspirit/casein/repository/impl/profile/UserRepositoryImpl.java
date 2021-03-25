package com.techspirit.casein.repository.impl.profile;

import com.techspirit.casein.model.profile.User;
import com.techspirit.casein.repository.api.profile.UserRepository;
import com.techspirit.casein.repository.impl.AbstractRepository;
import com.techspirit.casein.repository.impl.profile.crud.CrudUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl extends AbstractRepository<User> implements UserRepository {

    @Autowired
    public UserRepositoryImpl(CrudUserRepository crudRepository) {
        super(crudRepository);
    }

    @Override
    public List<User> getAll() {
        return crudRepository.findAll();
    }
}
