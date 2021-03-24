package com.techspirit.casein.repository.profile;

import com.techspirit.casein.model.profile.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<Photo, Integer> {
}
