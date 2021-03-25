package com.techspirit.casein.repository.impl.course.progress.crud;

import com.techspirit.casein.model.course.progress.QuestProgress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudQuestProgressRepository extends JpaRepository<QuestProgress, Integer> {
}
