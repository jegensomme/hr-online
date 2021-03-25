package com.techspirit.casein.repository.api.course.progress;

import com.techspirit.casein.model.course.progress.PageProgress;

import java.util.List;

public interface PageProgressRepository {

    // null if not found, when updated
    PageProgress save(PageProgress pageProgress, int questProgressId);

    // false if not found
    boolean delete(int id, int questProgressId);

    // null if not found
    PageProgress get(int id, int questProgressId);

    List<PageProgress> getAll(int questProgressId);
}
