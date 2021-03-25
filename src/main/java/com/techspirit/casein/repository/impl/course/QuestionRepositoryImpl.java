package com.techspirit.casein.repository.impl.course;

import com.techspirit.casein.model.course.Question;
import com.techspirit.casein.repository.api.course.QuestionRepository;

import java.util.List;

public class QuestionRepositoryImpl implements QuestionRepository {

    @Override
    public Question save(Question question, int questId) {
        return null;
    }

    @Override
    public boolean delete(int id, int questId) {
        return false;
    }

    @Override
    public Question get(int id, int questId) {
        return null;
    }

    @Override
    public List<Question> getAll(int questId) {
        return null;
    }
}
