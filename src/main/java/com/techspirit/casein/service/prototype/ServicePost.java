package com.techspirit.casein.service.prototype;

import com.techspirit.casein.model.Post;

import java.util.List;

public interface ServicePost {
    /**
     * Создает объект должности
     * @param post - должность для создания
     */
    void create(Post post);
    /**
     * Возвращает список всех доступных должностей
     * @return список объектов
     */
    List<Post> readALL();
    /**
     * Возвращает должность по его ID
     * @param id - id должности
     * @return - должность с заданным ID
     */
    Post read(int id);
    /**
     * Обновляет должность с заданным ID,
     * в соответствии с переданной должностью
     * @param post - должность, в соответсвии с которой нужно обновить данные
     * @param id - id должности, которую нужно обновить
     * @return - true если данные были обновлены, иначе false
     */
    boolean update(Post post, int id);
    /**
     * Удаляет должность с заданным ID
     * @param id - id должности, которую нужно удалить
     * @return - true если должность была удалена, иначе false
     */
    boolean delete(int id);
}
