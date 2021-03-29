package com.techspirit.casein.service.impl.course;

import com.techspirit.casein.model.course.Course;
import com.techspirit.casein.repository.api.course.CourseRepository;
import com.techspirit.casein.service.prototype.course.ServiceCourse;
import com.techspirit.casein.util.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class CourseService implements ServiceCourse {

    private final CourseRepository repository;

    @Override
    public Course read(int id) throws NotFoundException {
        return checkNotFoundWithId(repository.get(id), id);
    }
}
