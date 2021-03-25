package com.techspirit.casein.service.impl.course.progress;

import com.techspirit.casein.model.course.progress.CourseProgress;
import com.techspirit.casein.repository.api.course.progress.CourseProgressRepository;
import com.techspirit.casein.service.prototype.course.progress.ServiceCourseProgress;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class CourseProgressService implements ServiceCourseProgress {

    private final CourseProgressRepository courseProgressRepository;

    @Override
    public CourseProgress read(int id, int userId) {
        return checkNotFoundWithId(courseProgressRepository.get(id, userId), id);
    }
}
