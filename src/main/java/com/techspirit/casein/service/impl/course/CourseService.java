package com.techspirit.casein.service.impl.course;

import com.techspirit.casein.model.course.Course;
import com.techspirit.casein.repository.course.CourseRepository;
import com.techspirit.casein.service.prototype.course.ServiceCourse;
import org.springframework.stereotype.Service;

@Service
public class CourseService implements ServiceCourse {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course read(int id){
        return courseRepository.getOne(id);
    }
}
