package com.techspirit.casein.controller;

import com.techspirit.casein.model.Track;
import com.techspirit.casein.service.prototype.ServiceTrack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TrackController {
    private final ServiceTrack serviceTrack;

    @Autowired
    public TrackController(ServiceTrack serviceTrack) { this.serviceTrack = serviceTrack;}

    @CrossOrigin
    @PostMapping(value = "/track")
    public ResponseEntity<?> create (@RequestBody Track track)
    {
        serviceTrack.create(track);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @CrossOrigin
    @GetMapping(value = "/track")
    public ResponseEntity<List<Track>> read ()
    {
        final List<Track> tracks = serviceTrack.readALL();

        return tracks != null && !tracks.isEmpty()
                ? new ResponseEntity<>(tracks, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @CrossOrigin
    @GetMapping(value = "/track/{id}")
    public ResponseEntity<Track> read(@PathVariable(name = "id") int id){
        final Track track = serviceTrack.read(id);

        return track != null
                ? new ResponseEntity<>(track, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @PutMapping(value = "/track/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id, @RequestBody Track track) {
        final boolean update = serviceTrack.update(track, id);
        return update
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @DeleteMapping(value = "/track/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id) {
        final boolean deleted = serviceTrack.delete(id);
        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
