package com.techspirit.casein.repository.impl.course;

import com.techspirit.casein.model.course.Quest;
import com.techspirit.casein.repository.api.course.QuestRepository;

import java.util.List;

public class QuestRepositoryImpl implements QuestRepository {

    @Override
    public Quest save(Quest quest, int courseId) {
        return null;
    }

    @Override
    public boolean delete(int id, int courseId) {
        return false;
    }

    @Override
    public Quest get(int id, int courseId) {
        return null;
    }

    @Override
    public List<Quest> getAll(int courseId) {
        return null;
    }
}
