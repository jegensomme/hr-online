package com.techspirit.casein.repository.course.progress;

import com.techspirit.casein.model.course.progress.CourseProgress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseProgressRepository extends JpaRepository<CourseProgress, Integer> {
}
