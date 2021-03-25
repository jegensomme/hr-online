package com.techspirit.casein.repository.api.course;

import com.techspirit.casein.model.course.Question;

import java.util.List;

public interface QuestionRepository {

    // null if not found, when updated
    Question save(Question question, int questId);

    // false if not found
    boolean delete(int id, int questId);

    // null if not found
    Question get(int id, int questId);

    List<Question> getAll(int questId);
}
