package com.techspirit.casein.repository.impl.course.progress.crud;

import com.techspirit.casein.model.course.progress.CourseProgress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudCourseProgressRepository extends JpaRepository<CourseProgress, Integer> {
}
