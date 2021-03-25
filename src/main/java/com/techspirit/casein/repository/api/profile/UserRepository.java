package com.techspirit.casein.repository.api.profile;

import com.techspirit.casein.model.profile.User;
import com.techspirit.casein.repository.api.Repository;

import java.util.List;

public interface UserRepository extends Repository<User> {
    List<User> getAll();
}
