package com.techspirit.casein.service.prototype.profile;

import com.techspirit.casein.model.profile.User;
import com.techspirit.casein.util.exception.NotFoundException;

import java.util.List;

public interface ServiceUser {
    /**
     * Создает нового пользователя
     * @param user - пользователь для создания
     */
    User create(User user);
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
    User read(int id) throws NotFoundException;
    /**
     * Обновляет пользователя с заданным ID,
     * в соответствии с переданным пользователем
     * @param user - пользователь, в соответсвии с которым нужно обновить данные
     * @param id - id пользователя, которого нужно обновить
     */
    void update(User user, int id) throws NotFoundException;
    /**
     * Удаляет пользователя с заданным ID
     */
    void delete(int id) throws NotFoundException;
}
