package com.techspirit.casein.service.prototype;

import com.techspirit.casein.model.PageElement;


public interface ServicePageElement {
    /**
     * Возвращает элемент страницы по его ID
     * @param id - id элемента страницы
     * @return - элемента страницы с заданным ID
     */
    PageElement read(int id);
}
