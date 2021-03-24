package com.techspirit.casein.service.impl.course;

import com.techspirit.casein.model.course.Course;
import com.techspirit.casein.repository.course.CourseRepository;
import com.techspirit.casein.service.prototype.course.ServiceCourse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CourseService implements ServiceCourse {
    private final CourseRepository courseRepository;

    @Override
    public Course read(int id) {
        return courseRepository.getOne(id);
    }
}
