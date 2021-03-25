package com.techspirit.casein.repository.impl.course.crud;

import com.techspirit.casein.model.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudCourseRepository extends JpaRepository<Course, Integer> {
}
