package com.techspirit.casein.repository.course;

import com.techspirit.casein.model.course.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
