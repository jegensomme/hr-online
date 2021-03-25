package com.techspirit.casein.repository.impl.course.progress;

import com.techspirit.casein.model.course.progress.PageProgress;
import com.techspirit.casein.repository.api.course.progress.PageProgressRepository;

import java.util.List;

public class PageProgressRepositoryImpl implements PageProgressRepository {

    @Override
    public PageProgress save(PageProgress pageProgress, int questProgressId) {
        return null;
    }

    @Override
    public boolean delete(int id, int questProgressId) {
        return false;
    }

    @Override
    public PageProgress get(int id, int questProgressId) {
        return null;
    }

    @Override
    public List<PageProgress> getAll(int questProgressId) {
        return null;
    }
}
