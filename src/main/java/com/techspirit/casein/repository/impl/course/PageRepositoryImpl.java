package com.techspirit.casein.repository.impl.course;

import com.techspirit.casein.model.course.Page;
import com.techspirit.casein.model.course.Quest;
import com.techspirit.casein.repository.api.course.PageRepository;
import com.techspirit.casein.repository.impl.AbstractDependentRepository;
import com.techspirit.casein.repository.impl.course.crud.CrudPageRepository;
import com.techspirit.casein.repository.impl.course.crud.CrudQuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PageRepositoryImpl extends AbstractDependentRepository<Page, Quest> implements PageRepository {

    private final CrudPageRepository crudRepository;

    @Autowired
    public PageRepositoryImpl(CrudPageRepository crudRepository,
                              CrudQuestRepository crudQuestRepository) {
        super(crudRepository, crudQuestRepository);
        this.crudRepository = crudRepository;
    }

    @Override
    public List<Page> getAll(int questId) {
        return crudRepository.getAll(questId);
    }

    @Override
    protected void setParent(Page page, Quest quest) {
        page.setQuest(quest);
    }

    @Override
    protected boolean checkParent(Page page, int questId) {
        return page.getQuest().getId() == questId;
    }
}
