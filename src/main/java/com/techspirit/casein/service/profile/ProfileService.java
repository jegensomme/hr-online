package com.techspirit.casein.service.profile;

import com.techspirit.casein.model.profile.Profile;
import com.techspirit.casein.repository.api.profile.ProfileRepository;
import com.techspirit.casein.util.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class ProfileService {

    private final ProfileRepository repository;

    public Profile create(Profile profile) {
        Assert.notNull(profile, "profile must not be null");
        return repository.save(profile);
    }

    public List<Profile> readALL() {
        return repository.getAll();
    }

    public Profile read(int id) throws NotFoundException {
        return checkNotFoundWithId(repository.get(id), id);
    }

    public void update(Profile profile, int id) throws NotFoundException {
        checkNotFoundWithId(repository.save(profile), id);
    }

    public void delete(int id) throws NotFoundException {
        checkNotFoundWithId(repository.delete(id), id);
    }

}
