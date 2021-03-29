package com.techspirit.casein.service.prototype.progress;

import com.techspirit.casein.model.course.progress.CourseProgress;
import com.techspirit.casein.util.exception.NotFoundException;

public interface ServiceCourseProgress {
    /**
     * Возвращает прогресс курса по его ID
     * @param id - id прогресса курса
     * @return - прогресс курса с заданным ID
     */
    CourseProgress read(int id, int userId) throws NotFoundException;

}
