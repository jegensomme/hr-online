package com.techspirit.casein.repository.impl.profile.crud;

import com.techspirit.casein.model.profile.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudUserRepository extends JpaRepository<User, Integer> {
}
