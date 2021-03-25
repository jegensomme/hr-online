package com.techspirit.casein.repository.impl.course;

import com.techspirit.casein.model.course.Page;
import com.techspirit.casein.repository.api.course.PageRepository;

import java.util.List;

public class PageRepositoryImpl implements PageRepository {

    @Override
    public Page save(Page page, int questId) {
        return null;
    }

    @Override
    public boolean delete(int id, int questId) {
        return false;
    }

    @Override
    public Page get(int id, int questId) {
        return null;
    }

    @Override
    public List<Page> getAll(int questId) {
        return null;
    }
}
