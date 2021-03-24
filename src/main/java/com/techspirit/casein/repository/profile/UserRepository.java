package com.techspirit.casein.repository.profile;

import com.techspirit.casein.model.profile.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
