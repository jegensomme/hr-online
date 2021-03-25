package com.techspirit.casein.repository.impl.profile.crud;

import com.techspirit.casein.model.profile.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudProfileRepository extends JpaRepository<Profile, Integer> {
}
