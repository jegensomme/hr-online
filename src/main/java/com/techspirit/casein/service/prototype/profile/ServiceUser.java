package com.techspirit.casein.service.prototype.profile;

import com.techspirit.casein.model.profile.User;

import java.util.List;

public interface ServiceUser {
    /**
     * Создает нового пользователя
     * @param user - пользователь для создания
     */
    void create(User user);
    /**
     * Возвращает список всех пользователей
     * @return список объектов
     */
    List<User> readALL();
    /**
     * Возвращает пользователя по его ID
     * @param id - id пользователя
     * @return - пользователь с заданным ID
     */
    User read(int id);
    /**
     * Обновляет пользователя с заданным ID,
     * в соответствии с переданным пользователем
     * @param user - пользователь, в соответсвии с которым нужно обновить данные
     * @param id - id пользователя, которого нужно обновить
     * @return - true если данные были обновлены, иначе false
     */
    boolean update(User user, int id);
    /**
     * Удаляет пользователя с заданным ID
     * @param id - id пользователя, который нужно удалить
     * @return - true если пользователь был удален, иначе false
     */
    boolean delete(int id);
}
