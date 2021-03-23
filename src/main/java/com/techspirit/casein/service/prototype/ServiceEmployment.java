package com.techspirit.casein.service.prototype;

import com.techspirit.casein.model.Employment;

import java.util.List;

public interface ServiceEmployment {
    /**
     * Создает объект занятости
     * @param employment - занятость для создания
     */
    void create(Employment employment);
    /**
     * Возвращает список всех доступных занятостей
     * @return список объектов
     */
    List<Employment> readALL();
    /**
     * Возвращает занятость по его ID
     * @param id - id занятости
     * @return - занятость с заданным ID
     */
    Employment read(int id);
    /**
     * Обновляет занятость с заданным ID,
     * в соответствии с переданной занятостью
     * @param employment - занятость, в соответсвии с которой нужно обновить данные
     * @param id - id занятость, которую нужно обновить
     * @return - true если данные были обновлены, иначе false
     */
    boolean update(Employment employment, int id);
    /**
     * Удаляет занятость с заданным ID
     * @param id - id занятости, которую нужно удалить
     * @return - true если личное дело было удалено, иначе false
     */
    boolean delete(int id);
}
