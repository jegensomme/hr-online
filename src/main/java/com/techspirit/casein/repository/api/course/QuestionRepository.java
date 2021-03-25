package com.techspirit.casein.repository.api.course;

import com.techspirit.casein.model.course.Question;
import com.techspirit.casein.repository.api.DependentRepository;

import java.util.List;

public interface QuestionRepository extends DependentRepository<Question> {
    List<Question> getAll(int questId);
}
