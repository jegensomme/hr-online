package com.techspirit.casein.service.prototype.profile;

import com.techspirit.casein.model.profile.Profile;

import java.util.List;

public interface ServiceProfile {
    /**
     * Создает объект личного дела работника
     * @param profile - личное дело для создания
     */
    void create(Profile profile);
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
    Profile read(int id);
    /**
     * Обновляет личное дело с заданным ID,
     * в соответствии с переданным личным делом
     * @param profile - личное дело, в соответсвии с которым нужно обновить данные
     * @param id - id личного дела, которое нужно обновить
     * @return - true если данные были обновлены, иначе false
     */
    boolean update(Profile profile, int id);
    /**
     * Удаляет личное дело с заданным ID
     * @param id - id личного дела, который нужно удалить
     * @return - true если личное дело было удалено, иначе false
     */
    boolean delete(int id);

}
