package com.techspirit.casein.repository.impl.course.progress;

import com.techspirit.casein.model.course.progress.CourseProgress;
import com.techspirit.casein.model.course.progress.QuestProgress;
import com.techspirit.casein.repository.api.course.progress.QuestProgressRepository;
import com.techspirit.casein.repository.impl.AbstractDependentRepository;
import com.techspirit.casein.repository.impl.course.progress.crud.CrudCourseProgressRepository;
import com.techspirit.casein.repository.impl.course.progress.crud.CrudQuestProgressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuestProgressRepositoryImpl extends AbstractDependentRepository<QuestProgress, CourseProgress>
                                            implements QuestProgressRepository {
    private final CrudQuestProgressRepository crudRepository;

    @Autowired
    public QuestProgressRepositoryImpl(CrudQuestProgressRepository crudRepository,
                                       CrudCourseProgressRepository crudCourseProgressRepository) {
        super(crudRepository, crudCourseProgressRepository);
        this.crudRepository = crudRepository;
    }

    @Override
    public List<QuestProgress> getAll(int courseProgressId) {
        return crudRepository.getAll(courseProgressId);
    }

    @Override
    protected void setParent(QuestProgress questProgress, CourseProgress courseProgress) {
        questProgress.setCourseProgress(courseProgress);
    }

    @Override
    protected boolean checkParent(QuestProgress questProgress, int courseProgressId) {
        return questProgress.getCourseProgress().getId() == courseProgressId;
    }
}
