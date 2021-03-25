package com.techspirit.casein.repository.api.course.progress;

import com.techspirit.casein.model.course.progress.CourseProgress;

import java.util.List;

public interface CourseProgressRepository {

    // null if not found, when updated
    CourseProgress save(CourseProgress courseProgress, int userId);

    // false if not found
    boolean delete(int id, int userId);

    // null if not found
    CourseProgress get(int id, int userId);
}
