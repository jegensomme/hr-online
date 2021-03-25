package com.techspirit.casein.repository.impl.course.crud;

import com.techspirit.casein.model.course.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CrudQuestionRepository extends JpaRepository<Question, Integer> {

    @Query("SELECT q FROM Question q WHERE q.quest.id=:questId")
    List<Question> getAll(@Param("questId") int questId);
}
