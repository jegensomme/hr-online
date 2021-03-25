package com.techspirit.casein.repository.api.profile;

import com.techspirit.casein.model.profile.User;

import java.util.List;

public interface UserRepository {

    // null if not found, when updated
    User save(User user);

    // false if not found
    boolean delete(int id);

    // null if not found
    User get(int id);

    List<User> getAll();
}
