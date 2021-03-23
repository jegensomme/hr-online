package com.techspirit.casein.service.prototype;

import com.techspirit.casein.model.Position;

import java.util.List;

public interface ServicePosition {
    /**
     * Создает объект должности
     * @param position - должность для создания
     */
    void create(Position position);
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
     * @param id - id должности, которую нужно обновить
     * @return - true если данные были обновлены, иначе false
     */
    boolean update(Position position, int id);
    /**
     * Удаляет должность с заданным ID
     * @param id - id должности, которую нужно удалить
     * @return - true если должность была удалена, иначе false
     */
    boolean delete(int id);
}
