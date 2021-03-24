package com.techspirit.casein.service.impl.profile;

import com.techspirit.casein.model.profile.Profile;
import com.techspirit.casein.repository.profile.ProfileRepository;
import com.techspirit.casein.service.prototype.profile.ServiceProfile;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class ProfileService implements ServiceProfile {
    private final ProfileRepository profileRepository;

    @Override
    public Profile create(Profile profile) {
        Assert.notNull(profile, "profile must not be null");
        return profileRepository.save(profile);
    }

    @Override
    public List<Profile> readALL() {
        return profileRepository.findAll();
    }

    @Override
    public Profile read(int id) {
        return profileRepository.getOne(id);
    }

    @Override
    public void update(Profile profile, int id) {
        checkNotFoundWithId(profileRepository.existsById(id), id);
        profileRepository.save(profile);
    }

    @Override
    public void delete(int id) {
        checkNotFoundWithId(profileRepository.existsById(id), id);
        profileRepository.deleteById(id);
    }

}
