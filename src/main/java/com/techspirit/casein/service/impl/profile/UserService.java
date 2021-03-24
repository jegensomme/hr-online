package com.techspirit.casein.service.impl.profile;

import com.techspirit.casein.model.profile.User;
import com.techspirit.casein.repository.profile.UserRepository;
import com.techspirit.casein.service.prototype.profile.ServiceUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements ServiceUser {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void create(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> readALL(){
        return userRepository.findAll();
    }

    @Override
    public User read(int id){
        return userRepository.getOne(id);
    }

    @Override
    public boolean update(User user, int id)
    {
        if(userRepository.existsById(id)) {
            user.setId(id);
            userRepository.save(user);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id)
    {
        if (userRepository.existsById(id))
        {
            userRepository.deleteById(id);
            return  true;
        }
        return false;
    }

}
