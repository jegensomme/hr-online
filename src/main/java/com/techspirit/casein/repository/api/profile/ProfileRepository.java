package com.techspirit.casein.repository.api.profile;

import com.techspirit.casein.model.profile.Profile;

import java.util.List;

public interface ProfileRepository {

    // null if not found, when updated
    Profile save(Profile profile);

    // false if not found
    boolean delete(int id);

    // null if not found
    Profile get(int id);

    List<Profile> getAll();
}
