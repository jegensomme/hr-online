package com.techspirit.casein.repository.course;

import com.techspirit.casein.model.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
