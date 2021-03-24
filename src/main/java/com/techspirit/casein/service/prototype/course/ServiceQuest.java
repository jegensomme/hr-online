package com.techspirit.casein.service.prototype.course;

import com.techspirit.casein.model.course.Quest;


public interface ServiceQuest {
    /**
     * Возвращает квест по его ID
     * @param id - id квеста
     * @return - квест с заданным ID
     */
    Quest read(int id);
}
