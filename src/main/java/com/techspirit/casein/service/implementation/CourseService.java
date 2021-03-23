package com.techspirit.casein.service.implementation;


import com.techspirit.casein.model.Course;
import com.techspirit.casein.repository.CourseRepository;
import com.techspirit.casein.service.prototype.ServiceCourse;
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
