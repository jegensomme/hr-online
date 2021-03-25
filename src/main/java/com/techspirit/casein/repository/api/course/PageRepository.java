package com.techspirit.casein.repository.api.course;

import com.techspirit.casein.model.course.Page;

import java.util.List;

public interface PageRepository {

    // null if not found, when updated
    Page save(Page page, int questId);

    // false if not found
    boolean delete(int id, int questId);

    // null if not found
    Page get(int id, int questId);

    List<Page> getAll(int questId);
}
