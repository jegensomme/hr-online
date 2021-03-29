package com.techspirit.casein.service.prototype.course;

import com.techspirit.casein.model.course.Question;
import com.techspirit.casein.util.exception.NotFoundException;

public interface ServiceQuestion {
    /**
     * Возвращает вопрос по его ID
     * @param id - id вопроса
     * @return - вопрос с заданным ID
     */
    Question read(int id, int questId) throws NotFoundException;
}
