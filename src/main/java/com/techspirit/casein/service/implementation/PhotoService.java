package com.techspirit.casein.service.implementation;

import com.techspirit.casein.model.Photo;
import com.techspirit.casein.repository.PhotoRepository;
import com.techspirit.casein.service.prototype.ServicePhoto;
import org.springframework.stereotype.Service;


@Service
public class PhotoService implements ServicePhoto {
    private final PhotoRepository photoRepository;

    public PhotoService(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    @Override
    public Photo read(int id){
        return photoRepository.getOne(id);
    }

}
