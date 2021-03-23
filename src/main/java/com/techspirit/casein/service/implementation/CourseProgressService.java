package com.techspirit.casein.service.implementation;


import com.techspirit.casein.model.CourseProgress;
import com.techspirit.casein.repository.CourseProgressRepository;
import com.techspirit.casein.service.prototype.ServiceCourseProgress;
import org.springframework.stereotype.Service;

@Service
public class CourseProgressService implements ServiceCourseProgress {
    private final CourseProgressRepository courseProgressRepository;

    public CourseProgressService(CourseProgressRepository courseProgressRepository) {
        this.courseProgressRepository = courseProgressRepository;
    }

    @Override
    public CourseProgress read(int id){
        return courseProgressRepository.getOne(id);
    }
}
