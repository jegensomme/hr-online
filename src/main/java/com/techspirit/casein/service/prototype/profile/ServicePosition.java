package com.techspirit.casein.service.prototype.profile;

import com.techspirit.casein.model.profile.Position;

import java.util.List;

public interface ServicePosition {
    /**
     * Создает объект должности
     * @param position - должность для создания
     */
    Position create(Position position);
    /**
     * Возвращает список всех доступных должностей
     * @return список объектов
     */
    List<Position> readALL();
    /**
     * Возвращает должность по его ID
     * @param id - id должности
     * @return - должность с заданным ID
     */
    Position read(int id);
    /**
     * Обновляет должность с заданным ID,
     * в соответствии с переданной должностью
     * @param position - должность, в соответсвии с которой нужно обновить данные
     */
    void update(Position position, int id);
    /**
     * Удаляет должность с заданным ID
     */
    void delete(int id);
}
