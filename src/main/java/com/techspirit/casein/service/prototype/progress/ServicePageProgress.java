package com.techspirit.casein.service.prototype.progress;

import com.techspirit.casein.model.course.progress.PageProgress;
import com.techspirit.casein.util.exception.NotFoundException;

public interface ServicePageProgress {
    /**
     * Возвращает прогресс страницы по его ID
     * @param id - id прогресса страницы
     * @return - прогресс страницы с заданным ID
     */
    PageProgress read(int id, int pageProgressId) throws NotFoundException;
}
