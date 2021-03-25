package com.techspirit.casein.repository.api.course.progress;

import com.techspirit.casein.model.course.progress.QuestProgress;

import java.util.List;

public interface QuestProgressRepository {

    // null if not found, when updated
    QuestProgress save(QuestProgress questProgress, int courseProgressId);

    // false if not found
    boolean delete(int id, int courseProgressId);

    // null if not found
    QuestProgress get(int id, int courseProgressId);

    List<QuestProgress> getAll(int courseProgressId);
}
