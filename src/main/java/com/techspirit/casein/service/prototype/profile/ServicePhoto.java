package com.techspirit.casein.service.prototype.profile;

import com.techspirit.casein.model.profile.Photo;
import com.techspirit.casein.util.exception.NotFoundException;


public interface ServicePhoto {
    /**
     * Возвращает фотгорафию по её ID
     * @param id - id фотгорафии
     * @return - фотгорафия с заданным ID
     */
    Photo read(int id, int profileId) throws NotFoundException;
}
