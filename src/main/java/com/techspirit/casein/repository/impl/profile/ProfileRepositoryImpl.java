package com.techspirit.casein.repository.impl.profile;

import com.techspirit.casein.model.profile.Profile;
import com.techspirit.casein.repository.api.profile.ProfileRepository;
import com.techspirit.casein.repository.impl.AbstractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProfileRepositoryImpl extends AbstractRepository<Profile> implements ProfileRepository {

    @Autowired
    public ProfileRepositoryImpl(JpaRepository<Profile, Integer> crudRepository) {
        super(crudRepository);
    }

    @Override
    public List<Profile> getAll() {
        return crudRepository.findAll();
    }
}
