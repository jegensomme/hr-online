package com.techspirit.casein.controller.userInformationController;

import com.techspirit.casein.model.Profile;
import com.techspirit.casein.service.prototype.ServiceProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfileController {

    private final ServiceProfile serviceProfile;

    @Autowired
    public ProfileController(ServiceProfile serviceProfile) { this.serviceProfile = serviceProfile;}

    @CrossOrigin
    @PostMapping(value = "/profile")
    public ResponseEntity<?> create (@RequestBody Profile profile)
    {
        serviceProfile.create(profile);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @CrossOrigin
    @GetMapping(value = "/profile")
    public ResponseEntity<List<Profile>> read ()
    {
        final List<Profile> profiles = serviceProfile.readALL();

        return profiles != null && !profiles.isEmpty()
                ? new ResponseEntity<>(profiles, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @CrossOrigin
    @GetMapping(value = "/profile/{id}")
    public ResponseEntity<Profile> read(@PathVariable(name = "id") int id){
        final Profile profile = serviceProfile.read(id);

        return profile != null
                ? new ResponseEntity<>(profile, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @PutMapping(value = "/profile/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id, @RequestBody Profile profile) {
        final boolean update = serviceProfile.update(profile, id);
        return update
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @DeleteMapping(value = "/profile/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id) {
        final boolean deleted = serviceProfile.delete(id);
        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
