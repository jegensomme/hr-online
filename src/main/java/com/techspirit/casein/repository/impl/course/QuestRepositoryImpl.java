package com.techspirit.casein.repository.impl.course;

import com.techspirit.casein.model.course.Course;
import com.techspirit.casein.model.course.Quest;
import com.techspirit.casein.repository.api.course.QuestRepository;
import com.techspirit.casein.repository.impl.AbstractDependentRepository;
import com.techspirit.casein.repository.impl.course.crud.CrudCourseRepository;
import com.techspirit.casein.repository.impl.course.crud.CrudQuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuestRepositoryImpl extends AbstractDependentRepository<Quest, Course>
                                    implements QuestRepository {
    private final CrudQuestRepository crudRepository;

    @Autowired
    public QuestRepositoryImpl(CrudQuestRepository crudRepository,
                               CrudCourseRepository crudCourseRepository) {
        super(crudRepository, crudCourseRepository);
        this.crudRepository = crudRepository;
    }

    @Override
    public List<Quest> getAll(int courseId) {
        return crudRepository.getAll(courseId);
    }

    @Override
    protected void setParent(Quest quest, Course course) {
        quest.setCourse(course);
    }

    @Override
    protected boolean checkParent(Quest quest, int courseId) {
        return quest.getCourse().getId() == courseId;
    }
}
