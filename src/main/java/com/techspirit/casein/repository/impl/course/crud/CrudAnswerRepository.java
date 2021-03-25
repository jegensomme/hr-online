package com.techspirit.casein.repository.impl.course.crud;

import com.techspirit.casein.model.course.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CrudAnswerRepository extends JpaRepository<Answer, Integer> {

    @Query("SELECT a FROM Answer a WHERE a.question.id=:questionId")
    List<Answer> getAll(@Param("questionId") int questionId);
}
