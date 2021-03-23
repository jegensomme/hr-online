package com.techspirit.casein.service.prototype;

import com.techspirit.casein.model.Answer;

public interface ServiceAnswer {
    /**
     * Возвращает ответ по его ID
     * @param id - id ответа
     * @return - ответ с заданным ID
     */
    Answer read(int id);
    /**
     * Обновляет статус ответа с заданным ID,
     * @param id - id ответа, статус которого нужно обновить
     * @return - true если данные были обновлены, иначе false
     */
    boolean update(int id);
}
