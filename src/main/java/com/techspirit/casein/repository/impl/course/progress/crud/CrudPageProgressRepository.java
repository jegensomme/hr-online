package com.techspirit.casein.repository.impl.course.progress.crud;

import com.techspirit.casein.model.course.progress.PageProgress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CrudPageProgressRepository extends JpaRepository<PageProgress, Integer> {

    @Query("SELECT pp FROM PageProgress pp WHERE pp.questProgress.id=:questProgressId")
    List<PageProgress> getAll(@Param("questProgressId") int questProgressId);
}
