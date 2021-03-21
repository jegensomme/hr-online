package com.techspirit.casein.service.implementation;


import com.techspirit.casein.model.Track;
import com.techspirit.casein.repository.TrackRepository;
import com.techspirit.casein.service.prototype.ServiceTrack;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackService implements ServiceTrack {
    private final TrackRepository trackRepository;

    public TrackService(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public void create(Track track) {
        trackRepository.save(track);
    }

    @Override
    public List<Track> readALL(){
        return trackRepository.findAll();
    }

    @Override
    public Track read(int id){
        return trackRepository.getOne(id);
    }

    @Override
    public boolean update(Track track, int id)
    {
        if(trackRepository.existsById(id)) {
            track.setId(id);
            trackRepository.save(track);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id)
    {
        if (trackRepository.existsById(id))
        {
            trackRepository.deleteById(id);
            return  true;
        }
        return false;
    }
}
