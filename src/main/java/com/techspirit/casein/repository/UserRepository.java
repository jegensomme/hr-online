package com.techspirit.casein.repository;

import com.techspirit.casein.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
