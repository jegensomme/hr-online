package com.techspirit.casein.repository.api.profile;

import com.techspirit.casein.model.profile.Photo;

public interface PhotoRepository {

    // null if not found, when updated
    Photo save(Photo photo, int profileId);

    // false if not found
    boolean delete(int id, int profileId);

    // null if not found
    Photo get(int id, int profileId);
}
