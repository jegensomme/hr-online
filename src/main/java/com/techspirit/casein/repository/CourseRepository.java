package com.techspirit.casein.repository;

import com.techspirit.casein.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
