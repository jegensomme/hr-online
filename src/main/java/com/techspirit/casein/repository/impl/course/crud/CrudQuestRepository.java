package com.techspirit.casein.repository.impl.course.crud;

import com.techspirit.casein.model.course.Quest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudQuestRepository extends JpaRepository<Quest, Integer> {
}
