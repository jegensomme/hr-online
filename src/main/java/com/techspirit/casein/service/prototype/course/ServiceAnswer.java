package com.techspirit.casein.service.prototype.course;

import com.techspirit.casein.model.course.Answer;

public interface ServiceAnswer {
    /**
     * Возвращает ответ по его ID
     * @param id - id ответа
     * @return - ответ с заданным ID
     */
    Answer read(int id, int questionId);
}
