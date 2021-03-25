package com.techspirit.casein.service.prototype.course.progress;

import com.techspirit.casein.model.course.progress.CourseProgress;

public interface ServiceCourseProgress {
    /**
     * Возвращает прогресс курса по его ID
     * @param id - id прогресса курса
     * @return - прогресс курса с заданным ID
     */
    CourseProgress read(int id, int userId);

}
