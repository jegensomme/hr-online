package com.techspirit.casein.repository.api.course;

import com.techspirit.casein.model.course.Answer;

import java.util.List;

public interface AnswerRepository {

    // null if not found, when updated
    Answer save(Answer answer, int questionId);

    // false if not found
    boolean delete(int id, int questionId);

    // null if not found
    Answer get(int id, int questionId);

    List<Answer> getAll(int questionId);
}
