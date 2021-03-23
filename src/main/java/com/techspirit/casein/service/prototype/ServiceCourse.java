package com.techspirit.casein.service.prototype;

import com.techspirit.casein.model.Course;

public interface ServiceCourse {
    /**
     * Возвращает курс по его ID
     * @param id - id курса
     * @return - курс с заданным ID
     */
    Course read(int id);
}
