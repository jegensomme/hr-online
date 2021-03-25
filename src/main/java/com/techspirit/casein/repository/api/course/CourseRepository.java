package com.techspirit.casein.repository.api.course;

import com.techspirit.casein.model.course.Course;

import java.util.List;

public interface CourseRepository {

    // null if not found, when updated
    Course save(Course course);

    // false if not found
    boolean delete(int id);

    // null if not found
    Course get(int id);
}
