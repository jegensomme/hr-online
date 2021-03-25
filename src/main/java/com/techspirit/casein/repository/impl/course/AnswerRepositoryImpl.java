package com.techspirit.casein.repository.impl.course;

import com.techspirit.casein.model.course.Answer;
import com.techspirit.casein.repository.api.course.AnswerRepository;

import java.util.List;

public class AnswerRepositoryImpl implements AnswerRepository {

    @Override
    public Answer save(Answer answer, int questionId) {
        return null;
    }

    @Override
    public boolean delete(int id, int questionId) {
        return false;
    }

    @Override
    public Answer get(int id, int questionId) {
        return null;
    }

    @Override
    public List<Answer> getAll(int questionId) {
        return null;
    }
}
