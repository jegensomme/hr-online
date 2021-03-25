package com.techspirit.casein.repository.impl.course.progress;

import com.techspirit.casein.model.course.progress.QuestProgress;
import com.techspirit.casein.repository.api.course.progress.QuestProgressRepository;

import java.util.List;

public class QuestProgressRepositoryImpl implements QuestProgressRepository {

    @Override
    public QuestProgress save(QuestProgress questProgress, int courseProgressId) {
        return null;
    }

    @Override
    public boolean delete(int id, int courseProgressId) {
        return false;
    }

    @Override
    public QuestProgress get(int id, int courseProgressId) {
        return null;
    }

    @Override
    public List<QuestProgress> getAll(int courseProgressId) {
        return null;
    }
}
