package com.techspirit.casein.service.implementation;

import com.techspirit.casein.model.Profile;
import com.techspirit.casein.repository.ProfileRepository;
import com.techspirit.casein.service.prototype.ServiceProfile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService implements ServiceProfile {
    private final ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public void create(Profile profile) {
        profileRepository.save(profile);
    }

    @Override
    public List<Profile> readALL(){
        return profileRepository.findAll();
    }

    @Override
    public Profile read(int id){
        return profileRepository.getOne(id);
    }

    @Override
    public boolean update(Profile profile, int id)
    {
        if(profileRepository.existsById(id)) {
            profile.setId(id);
            profileRepository.save(profile);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id)
    {
        if (profileRepository.existsById(id))
        {
            profileRepository.deleteById(id);
            return  true;
        }
        return false;
    }

}
