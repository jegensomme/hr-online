package com.techspirit.casein.repository.impl.profile.crud;

import com.techspirit.casein.model.profile.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudPhotoRepository extends JpaRepository<Photo, Integer> {
}
