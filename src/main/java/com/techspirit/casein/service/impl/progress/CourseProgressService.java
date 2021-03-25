package com.techspirit.casein.service.impl.progress;

import com.techspirit.casein.model.course.progress.CourseProgress;
import com.techspirit.casein.repository.api.progress.CourseProgressRepository;
import com.techspirit.casein.service.prototype.progress.ServiceCourseProgress;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class CourseProgressService implements ServiceCourseProgress {

    private final CourseProgressRepository repository;

    @Override
    public CourseProgress read(int id, int userId) {
        return checkNotFoundWithId(repository.get(id, userId), id);
    }
}
