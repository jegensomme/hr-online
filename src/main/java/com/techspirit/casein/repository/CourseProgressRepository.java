package com.techspirit.casein.repository;

import com.techspirit.casein.model.CourseProgress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseProgressRepository extends JpaRepository<CourseProgress, Integer> {
}
