package com.techspirit.casein.service.impl.progress;

import com.techspirit.casein.model.course.progress.PageProgress;
import com.techspirit.casein.repository.api.progress.PageProgressRepository;
import com.techspirit.casein.service.prototype.progress.ServicePageProgress;
import com.techspirit.casein.util.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class PageProgressService implements ServicePageProgress {

    private final PageProgressRepository repository;

    @Override
    public PageProgress read(int id, int questProgress) throws NotFoundException {
        return checkNotFoundWithId(repository.get(id, questProgress), questProgress);
    }
}
