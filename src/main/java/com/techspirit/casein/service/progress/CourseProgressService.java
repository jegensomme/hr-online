package com.techspirit.casein.service.progress;

import com.techspirit.casein.model.course.progress.CourseProgress;
import com.techspirit.casein.repository.api.progress.CourseProgressRepository;
import com.techspirit.casein.util.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class CourseProgressService {

    private final CourseProgressRepository repository;

    public CourseProgress read(int id, int userId) throws NotFoundException {
        return checkNotFoundWithId(repository.get(id, userId), id);
    }
}
