package com.techspirit.casein.repository.api.progress;

import com.techspirit.casein.model.course.progress.PageProgress;
import com.techspirit.casein.repository.api.DependentRepository;

import java.util.List;

public interface PageProgressRepository extends DependentRepository<PageProgress> {
    List<PageProgress> getAll(int questProgressId);
}
