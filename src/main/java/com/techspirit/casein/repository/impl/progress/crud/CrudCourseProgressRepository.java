package com.techspirit.casein.repository.impl.progress.crud;

import com.techspirit.casein.model.course.progress.CourseProgress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudCourseProgressRepository extends JpaRepository<CourseProgress, Integer> {
}
