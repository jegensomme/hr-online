package com.techspirit.casein.repository.impl.course.progress;

import com.techspirit.casein.model.course.progress.CourseProgress;
import com.techspirit.casein.model.profile.User;
import com.techspirit.casein.repository.api.course.progress.CourseProgressRepository;
import com.techspirit.casein.repository.impl.AbstractDependentRepository;
import com.techspirit.casein.repository.impl.course.progress.crud.CrudCourseProgressRepository;
import com.techspirit.casein.repository.impl.profile.crud.CrudUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CourseProgressRepositoryImpl extends AbstractDependentRepository<CourseProgress, User>
                                            implements CourseProgressRepository {
    @Autowired
    public CourseProgressRepositoryImpl(CrudCourseProgressRepository crudRepository,
                                        CrudUserRepository crudUserRepository) {
        super(crudRepository, crudUserRepository);
    }

    @Override
    protected void setParent(CourseProgress courseProgress, User user) {
        courseProgress.setUser(user);
    }

    @Override
    protected boolean checkParent(CourseProgress courseProgress, int userId) {
        return courseProgress.getUser().getId() == userId;
    }
}
