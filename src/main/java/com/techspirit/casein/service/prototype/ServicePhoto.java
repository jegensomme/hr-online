package com.techspirit.casein.service.prototype;

import com.techspirit.casein.model.Photo;



public interface ServicePhoto {
    /**
     * Возвращает фотгорафию по её ID
     * @param id - id фотгорафии
     * @return - фотгорафия с заданным ID
     */
    Photo read(int id);
}
