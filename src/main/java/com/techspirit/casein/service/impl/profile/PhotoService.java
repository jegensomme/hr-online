package com.techspirit.casein.service.impl.profile;

import com.techspirit.casein.model.profile.Photo;
import com.techspirit.casein.repository.profile.PhotoRepository;
import com.techspirit.casein.service.prototype.profile.ServicePhoto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PhotoService implements ServicePhoto {
    private final PhotoRepository photoRepository;

    @Override
    public Photo read(int id){
        return photoRepository.getOne(id);
    }

}
