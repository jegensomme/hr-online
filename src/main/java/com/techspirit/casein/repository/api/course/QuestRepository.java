package com.techspirit.casein.repository.api.course;

import com.techspirit.casein.model.course.Quest;

import java.util.List;

public interface QuestRepository {

    // null if not found, when updated
    Quest save(Quest quest, int courseId);

    // false if not found
    boolean delete(int id, int courseId);

    // null if not found
    Quest get(int id, int courseId);

    List<Quest> getAll(int courseId);
}
