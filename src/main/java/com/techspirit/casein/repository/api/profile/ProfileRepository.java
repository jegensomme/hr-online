package com.techspirit.casein.repository.api.profile;

import com.techspirit.casein.model.profile.Profile;
import com.techspirit.casein.repository.api.Repository;

import java.util.List;

public interface ProfileRepository extends Repository<Profile> {
    List<Profile> getAll();
}
