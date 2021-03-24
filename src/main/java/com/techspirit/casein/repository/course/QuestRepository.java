package com.techspirit.casein.repository.course;

import com.techspirit.casein.model.course.Quest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestRepository extends JpaRepository<Quest, Integer> {
}
