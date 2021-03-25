package com.techspirit.casein.service.impl.profile;

import com.techspirit.casein.model.profile.User;
import com.techspirit.casein.repository.api.profile.UserRepository;
import com.techspirit.casein.service.prototype.profile.ServiceUser;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService implements ServiceUser {

    private final UserRepository repository;

    @Override
    public User create(User user) {
        Assert.notNull(user, "user must not be null");
        return repository.save(user);
    }

    @Override
    public List<User> readALL() {
        return repository.getAll();
    }

    @Override
    public User read(int id) {
        return checkNotFoundWithId(repository.get(id), id);
    }

    @Override
    public void update(User user, int id) {
        checkNotFoundWithId(repository.save(user), id);
    }

    @Override
    public void delete(int id) {
        checkNotFoundWithId(repository.delete(id), id);
    }

}
