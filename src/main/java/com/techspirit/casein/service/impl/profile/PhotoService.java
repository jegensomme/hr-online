package com.techspirit.casein.service.impl.profile;

import com.techspirit.casein.model.profile.Photo;
import com.techspirit.casein.repository.api.profile.PhotoRepository;
import com.techspirit.casein.service.prototype.profile.ServicePhoto;
import com.techspirit.casein.util.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class PhotoService implements ServicePhoto {

    private final PhotoRepository repository;

    @Override
    public Photo read(int id, int profileId) throws NotFoundException {
        return checkNotFoundWithId(repository.get(id, profileId), id);
    }

}
