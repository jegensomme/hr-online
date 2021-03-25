package com.techspirit.casein.repository.impl.course.crud;

import com.techspirit.casein.model.course.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudAnswerRepository extends JpaRepository<Answer, Integer> {
}
