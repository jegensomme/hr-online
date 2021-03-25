package com.techspirit.casein.repository.impl.course;

import com.techspirit.casein.model.course.Quest;
import com.techspirit.casein.model.course.Question;
import com.techspirit.casein.repository.api.course.QuestionRepository;
import com.techspirit.casein.repository.impl.AbstractDependentRepository;
import com.techspirit.casein.repository.impl.course.crud.CrudQuestRepository;
import com.techspirit.casein.repository.impl.course.crud.CrudQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuestionRepositoryImpl extends AbstractDependentRepository<Question, Quest>
                                        implements QuestionRepository {
    private final CrudQuestionRepository crudRepository;

    @Autowired
    public QuestionRepositoryImpl(CrudQuestionRepository crudRepository,
                                  CrudQuestRepository crudQuestRepository) {
        super(crudRepository, crudQuestRepository);
        this.crudRepository = crudRepository;
    }

    @Override
    public List<Question> getAll(int questId) {
        return crudRepository.getAll(questId);
    }

    @Override
    protected void setParent(Question question, Quest quest) {
        question.setQuest(quest);
    }

    @Override
    protected boolean checkParent(Question question, int questId) {
        return question.getQuest().getId() == questId;
    }
}
