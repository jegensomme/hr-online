package com.techspirit.casein.service.profile;

import com.techspirit.casein.model.profile.User;
import com.techspirit.casein.repository.api.profile.UserRepository;
import com.techspirit.casein.util.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository repository;

    public User create(User user) {
        Assert.notNull(user, "user must not be null");
        return repository.save(user);
    }

    public List<User> readALL() {
        return repository.getAll();
    }

    public User read(int id) throws NotFoundException {
        return checkNotFoundWithId(repository.get(id), id);
    }

    public void update(User user, int id) throws NotFoundException {
        checkNotFoundWithId(repository.save(user), id);
    }

    public void delete(int id) throws NotFoundException {
        checkNotFoundWithId(repository.delete(id), id);
    }
}
