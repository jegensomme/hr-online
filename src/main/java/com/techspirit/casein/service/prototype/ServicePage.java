package com.techspirit.casein.service.prototype;

import com.techspirit.casein.model.Page;


public interface ServicePage {
    /**
     * Возвращает страницу по её ID
     * @param id - id страницы
     * @return - страница с заданным ID
     */
    Page read(int id);
}
