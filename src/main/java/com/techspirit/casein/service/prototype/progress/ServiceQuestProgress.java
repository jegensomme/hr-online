package com.techspirit.casein.service.prototype.progress;

import com.techspirit.casein.model.course.progress.QuestProgress;
import com.techspirit.casein.util.exception.NotFoundException;

public interface ServiceQuestProgress {
    /**
     * Возвращает прогресс квеста по его ID
     * @param id - id прогресса квеста
     * @return - прогресс квеста с заданным ID
     */
    QuestProgress read(int id, int courseProgressId) throws NotFoundException;
}
