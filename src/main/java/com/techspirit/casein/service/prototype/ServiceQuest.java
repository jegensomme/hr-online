package com.techspirit.casein.service.prototype;

import com.techspirit.casein.model.Quest;


public interface ServiceQuest {
    /**
     * Возвращает квест по его ID
     * @param id - id квеста
     * @return - квест с заданным ID
     */
    Quest read(int id);
}
