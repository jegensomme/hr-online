package com.techspirit.casein.repository.api.course;

import com.techspirit.casein.model.course.Answer;
import com.techspirit.casein.repository.api.DependentRepository;

import java.util.List;

public interface AnswerRepository extends DependentRepository<Answer> {
    List<Answer> getAll(int questionId);
}
