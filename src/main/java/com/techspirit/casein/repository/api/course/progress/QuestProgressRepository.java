package com.techspirit.casein.repository.api.course.progress;

import com.techspirit.casein.model.course.progress.QuestProgress;
import com.techspirit.casein.repository.api.DependentRepository;

import java.util.List;

public interface QuestProgressRepository extends DependentRepository<QuestProgress> {
    List<QuestProgress> getAll(int courseProgressId);
}
