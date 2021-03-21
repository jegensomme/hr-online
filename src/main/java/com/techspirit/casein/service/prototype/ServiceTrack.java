package com.techspirit.casein.service.prototype;

import com.techspirit.casein.model.Track;

import java.util.List;

public interface ServiceTrack {
    /**
     * Создает объект трека
     * @param track - трек для создания
     */
    void create(Track track);
    /**
     * Возвращает список всех доступных треков
     * @return список объектов
     */
    List<Track> readALL();
    /**
     * Возвращает трек по его ID
     * @param id - id трека
     * @return - трек с заданным ID
     */
    Track read(int id);
    /**
     * Обновляет трек с заданным ID,
     * в соответствии с переданным треком
     * @param track - трек, в соответсвии с которым нужно обновить данные
     * @param id - id трека, который нужно обновить
     * @return - true если данные были обновлены, иначе false
     */
    boolean update(Track track, int id);
    /**
     * Удаляет трек с заданным ID
     * @param id - id трека, который нужно удалить
     * @return - true если трек был удален, иначе false
     */
    boolean delete(int id);
}
