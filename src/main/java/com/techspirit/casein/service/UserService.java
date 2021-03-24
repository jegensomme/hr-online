package com.techspirit.casein.service;

import com.techspirit.casein.model.profile.User;
import com.techspirit.casein.repository.profile.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;
import static com.techspirit.casein.util.ValidationUtil.checkNotFound;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository repository;

    public User create(User user) {
        Assert.notNull(user, "user must not be null");
        return repository.save(user);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

    public User get(int id) {
        return checkNotFoundWithId(repository.getOne(id), id);
    }

    public List<User> getAll() {
        return repository.findAll();
    }

    public void update(User user) {
        Assert.notNull(user, "user must not be null");
        checkNotFoundWithId(repository.save(user), user.id());
    }
}
