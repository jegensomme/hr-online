package com.techspirit.casein.service.impl.profile;

import com.techspirit.casein.model.profile.Profile;
import com.techspirit.casein.repository.api.profile.ProfileRepository;
import com.techspirit.casein.service.prototype.profile.ServiceProfile;
import com.techspirit.casein.util.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class ProfileService implements ServiceProfile {

    private final ProfileRepository repository;

    @Override
    public Profile create(Profile profile) {
        Assert.notNull(profile, "profile must not be null");
        return repository.save(profile);
    }

    @Override
    public List<Profile> readALL() {
        return repository.getAll();
    }

    @Override
    public Profile read(int id) throws NotFoundException {
        return checkNotFoundWithId(repository.get(id), id);
    }

    @Override
    public void update(Profile profile, int id) throws NotFoundException {
        checkNotFoundWithId(repository.save(profile), id);
    }

    @Override
    public void delete(int id) throws NotFoundException {
        checkNotFoundWithId(repository.delete(id), id);
    }

}
