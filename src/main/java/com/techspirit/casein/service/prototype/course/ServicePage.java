package com.techspirit.casein.service.prototype.course;

import com.techspirit.casein.model.course.Page;
import com.techspirit.casein.util.exception.NotFoundException;


public interface ServicePage {
    /**
     * Возвращает страницу по её ID
     * @param id - id страницы
     * @return - страница с заданным ID
     */
    Page read(int id, int questId) throws NotFoundException;
}
