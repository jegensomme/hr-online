package com.techspirit.casein.service.prototype.profile;

import com.techspirit.casein.model.profile.Profile;
import com.techspirit.casein.util.exception.NotFoundException;

import java.util.List;

public interface ServiceProfile {
    /**
     * Создает объект личного дела работника
     * @param profile - личное дело для создания
     */
    Profile create(Profile profile);
    /**
     * Возвращает список всех доступных личных дел
     * @return список объектов
     */
    List<Profile> readALL();
    /**
     * Возвращает личное дело по его ID
     * @param id - id личного дела
     * @return - личное дело с заданным ID
     */
    Profile read(int id) throws NotFoundException;
    /**
     * Обновляет личное дело с заданным ID,
     * в соответствии с переданным личным делом
     * @param profile - личное дело, в соответсвии с которым нужно обновить данные
     * @param id - id личного дела, которое нужно обновить
     */
    void update(Profile profile, int id) throws NotFoundException;
    /**
     * Удаляет личное дело с заданным ID
     * @param id - id личного дела, который нужно удалить
     */
    void delete(int id) throws NotFoundException;

}
