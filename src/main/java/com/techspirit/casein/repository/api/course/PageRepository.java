package com.techspirit.casein.repository.api.course;

import com.techspirit.casein.model.course.Page;
import com.techspirit.casein.repository.api.DependentRepository;

import java.util.List;

public interface PageRepository extends DependentRepository<Page> {
    List<Page> getAll(int questId);
}
