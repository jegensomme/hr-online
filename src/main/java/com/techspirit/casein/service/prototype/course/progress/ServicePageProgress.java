package com.techspirit.casein.service.prototype.course.progress;

import com.techspirit.casein.model.course.progress.PageProgress;

public interface ServicePageProgress {
    /**
     * Возвращает прогресс страницы по его ID
     * @param id - id прогресса страницы
     * @return - прогресс страницы с заданным ID
     */
    PageProgress read(int id);
}
