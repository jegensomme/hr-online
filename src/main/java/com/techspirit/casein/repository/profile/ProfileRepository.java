package com.techspirit.casein.repository.profile;

import com.techspirit.casein.model.profile.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {
}
