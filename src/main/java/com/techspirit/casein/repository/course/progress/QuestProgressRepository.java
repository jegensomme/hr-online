package com.techspirit.casein.repository.course.progress;

import com.techspirit.casein.model.course.progress.QuestProgress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestProgressRepository extends JpaRepository<QuestProgress, Integer> {
}
