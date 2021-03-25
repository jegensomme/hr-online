package com.techspirit.casein.repository.impl.profile;

import com.techspirit.casein.model.profile.Photo;
import com.techspirit.casein.model.profile.Profile;
import com.techspirit.casein.repository.api.profile.PhotoRepository;
import com.techspirit.casein.repository.impl.AbstractDependentRepository;
import com.techspirit.casein.repository.impl.profile.crud.CrudPhotoRepository;
import com.techspirit.casein.repository.impl.profile.crud.CrudProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PhotoRepositoryImpl extends AbstractDependentRepository<Photo, Profile> implements PhotoRepository {

    @Autowired
    public PhotoRepositoryImpl(CrudPhotoRepository crudRepository,
                               CrudProfileRepository crudProfileRepository) {
        super(crudRepository, crudProfileRepository);
    }

    @Override
    protected void setParent(Photo photo, Profile profile) {
        photo.setProfile(profile);
    }

    @Override
    protected boolean checkParent(Photo photo, int profileId) {
        return photo.getProfile().getId() == profileId;
    }
}
