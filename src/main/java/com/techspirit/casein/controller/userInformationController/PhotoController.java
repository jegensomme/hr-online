package com.techspirit.casein.controller.userInformationController;

import com.techspirit.casein.model.Photo;
import com.techspirit.casein.service.prototype.ServicePhoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class PhotoController {
    private final ServicePhoto servicePhoto;

    @Autowired
    public PhotoController(ServicePhoto servicePhoto) { this.servicePhoto = servicePhoto;}

    @CrossOrigin
    @GetMapping(value = "/profile/{id}")
    public ResponseEntity<Photo> read(@PathVariable(name = "id") int id){
        final Photo photo = servicePhoto.read(id);

        return photo != null
                ? new ResponseEntity<>(photo, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
