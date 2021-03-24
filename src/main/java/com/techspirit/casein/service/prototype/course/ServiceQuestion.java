package com.techspirit.casein.service.prototype.course;

import com.techspirit.casein.model.course.Question;

public interface ServiceQuestion {
    /**
     * Возвращает вопрос по его ID
     * @param id - id вопроса
     * @return - вопрос с заданным ID
     */
    Question read(int id);
}
