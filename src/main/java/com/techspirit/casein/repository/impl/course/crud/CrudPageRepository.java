package com.techspirit.casein.repository.impl.course.crud;

import com.techspirit.casein.model.course.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CrudPageRepository extends JpaRepository<Page, Integer> {

    @Query("SELECT p FROM Page p WHERE p.quest.id=:questId")
    List<Page> getAll(@Param("questId") int questId);
}
