package com.techspirit.casein.repository.api.course;

import com.techspirit.casein.model.course.Quest;
import com.techspirit.casein.repository.api.DependentRepository;

import java.util.List;

public interface QuestRepository extends DependentRepository<Quest> {
    List<Quest> getAll(int courseId);
}
