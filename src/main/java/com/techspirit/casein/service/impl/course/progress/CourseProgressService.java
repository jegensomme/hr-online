package com.techspirit.casein.service.impl.course.progress;

import com.techspirit.casein.model.course.progress.CourseProgress;
import com.techspirit.casein.repository.course.progress.CourseProgressRepository;
import com.techspirit.casein.service.prototype.course.progress.ServiceCourseProgress;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CourseProgressService implements ServiceCourseProgress {
    private final CourseProgressRepository courseProgressRepository;

    @Override
    public CourseProgress read(int id) {
        return courseProgressRepository.getOne(id);
    }
}
