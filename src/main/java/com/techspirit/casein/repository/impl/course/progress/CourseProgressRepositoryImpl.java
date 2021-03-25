package com.techspirit.casein.repository.impl.course.progress;

import com.techspirit.casein.model.course.progress.CourseProgress;
import com.techspirit.casein.repository.api.course.progress.CourseProgressRepository;

public class CourseProgressRepositoryImpl implements CourseProgressRepository {

    @Override
    public CourseProgress save(CourseProgress courseProgress, int userId) {
        return null;
    }

    @Override
    public boolean delete(int id, int userId) {
        return false;
    }

    @Override
    public CourseProgress get(int id, int userId) {
        return null;
    }
}
