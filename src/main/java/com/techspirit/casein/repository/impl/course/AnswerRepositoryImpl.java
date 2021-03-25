package com.techspirit.casein.repository.impl.course;

import com.techspirit.casein.model.course.Answer;
import com.techspirit.casein.model.course.Question;
import com.techspirit.casein.repository.api.course.AnswerRepository;
import com.techspirit.casein.repository.impl.AbstractDependentRepository;
import com.techspirit.casein.repository.impl.course.crud.CrudAnswerRepository;
import com.techspirit.casein.repository.impl.course.crud.CrudQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AnswerRepositoryImpl extends AbstractDependentRepository<Answer, Question>
                                    implements AnswerRepository {
    private final CrudAnswerRepository crudRepository;

    @Autowired
    public AnswerRepositoryImpl(CrudAnswerRepository crudRepository,
                                CrudQuestionRepository crudQuestionRepository) {
        super(crudRepository, crudQuestionRepository);
        this.crudRepository = crudRepository;
    }

    @Override
    public List<Answer> getAll(int questionId) {
        return crudRepository.getAll(questionId);
    }

    @Override
    protected void setParent(Answer answer, Question question) {
        answer.setQuestion(question);
    }

    @Override
    protected boolean checkParent(Answer answer, int questionId) {
        return answer.getQuestion().getId() == questionId;
    }
}
