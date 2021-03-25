package com.techspirit.casein.repository.impl.course.crud;

import com.techspirit.casein.model.course.Quest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CrudQuestRepository extends JpaRepository<Quest, Integer> {

    @Query("SELECT q FROM Quest q WHERE q.course.id=:courseId")
    List<Quest> getAll(@Param("courseId") int courseId);
}
