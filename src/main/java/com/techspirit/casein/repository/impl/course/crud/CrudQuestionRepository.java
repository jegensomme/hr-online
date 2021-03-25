package com.techspirit.casein.repository.impl.course.crud;

import com.techspirit.casein.model.course.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudQuestionRepository extends JpaRepository<Question, Integer> {
}
