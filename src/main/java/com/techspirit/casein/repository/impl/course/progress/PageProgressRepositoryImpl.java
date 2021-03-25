package com.techspirit.casein.repository.impl.course.progress;

import com.techspirit.casein.model.course.progress.PageProgress;
import com.techspirit.casein.model.course.progress.QuestProgress;
import com.techspirit.casein.repository.api.course.progress.PageProgressRepository;
import com.techspirit.casein.repository.impl.AbstractDependentRepository;
import com.techspirit.casein.repository.impl.course.progress.crud.CrudPageProgressRepository;
import com.techspirit.casein.repository.impl.course.progress.crud.CrudQuestProgressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PageProgressRepositoryImpl extends AbstractDependentRepository<PageProgress, QuestProgress>
                                            implements PageProgressRepository {
    private final CrudPageProgressRepository crudRepository;

    @Autowired
    public PageProgressRepositoryImpl(CrudPageProgressRepository crudRepository,
                                      CrudQuestProgressRepository crudQuestProgressRepository) {
        super(crudRepository, crudQuestProgressRepository);
        this.crudRepository = crudRepository;
    }

    @Override
    public List<PageProgress> getAll(int questProgressId) {
        return crudRepository.getAll(questProgressId);
    }

    @Override
    protected void setParent(PageProgress pageProgress, QuestProgress questProgress) {
        pageProgress.setQuestProgress(questProgress);
    }

    @Override
    protected boolean checkParent(PageProgress pageProgress, int questProgressId) {
        return pageProgress.getQuestProgress().getId() == questProgressId;
    }
}
