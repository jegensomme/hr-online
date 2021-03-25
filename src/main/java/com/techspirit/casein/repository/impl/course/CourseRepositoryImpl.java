package com.techspirit.casein.repository.impl.course;

import com.techspirit.casein.model.course.Course;
import com.techspirit.casein.repository.api.course.CourseRepository;
import com.techspirit.casein.repository.impl.AbstractRepository;
import com.techspirit.casein.repository.impl.course.crud.CrudCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseRepositoryImpl extends AbstractRepository<Course> implements CourseRepository {

    @Autowired
    public CourseRepositoryImpl(CrudCourseRepository crudRepository) {
        super(crudRepository);
    }

    @Override
    public List<Course> getAll() {
        return crudRepository.findAll();
    }
}
