package com.techspirit.casein.service.impl.profile;

import com.techspirit.casein.model.profile.User;
import com.techspirit.casein.repository.profile.UserRepository;
import com.techspirit.casein.service.prototype.profile.ServiceUser;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService implements ServiceUser {

    private final UserRepository userRepository;

    @Override
    public User create(User user) {
        Assert.notNull(user, "user must not be null");
        return userRepository.save(user);
    }

    @Override
    public List<User> readALL() {
        return userRepository.findAll();
    }

    @Override
    public User read(int id) {
        return userRepository.getOne(id);
    }

    @Override
    public void update(User user, int id) {
        checkNotFoundWithId(userRepository.existsById(id), id);
        userRepository.save(user);
    }

    @Override
    public void delete(int id) {
        checkNotFoundWithId(userRepository.existsById(id), id);
        userRepository.deleteById(id);
    }

}
