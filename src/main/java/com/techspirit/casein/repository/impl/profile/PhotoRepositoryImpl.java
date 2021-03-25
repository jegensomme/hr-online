package com.techspirit.casein.repository.impl.profile;

import com.techspirit.casein.model.profile.Photo;
import com.techspirit.casein.repository.api.profile.PhotoRepository;

public class PhotoRepositoryImpl implements PhotoRepository {

    @Override
    public Photo save(Photo photo, int profileId) {
        return null;
    }

    @Override
    public boolean delete(int id, int profileId) {
        return false;
    }

    @Override
    public Photo get(int id, int profileId) {
        return null;
    }
}
