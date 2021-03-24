package com.techspirit.casein.service.prototype.course.progress;

import com.techspirit.casein.model.course.progress.QuestProgress;


public interface ServiceQuestProgress {
    /**
     * Возвращает прогресс квеста по его ID
     * @param id - id прогресса квеста
     * @return - прогресс квеста с заданным ID
     */
    QuestProgress read(int id);
}
