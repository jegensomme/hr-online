package com.techspirit.casein.service.prototype;

import com.techspirit.casein.model.CourseProgress;


public interface ServiceCourseProgress {
    /**
     * Возвращает прогресс курса по его ID
     * @param id - id прогресса курса
     * @return - прогресс курса с заданным ID
     */
    CourseProgress read(int id);

}
