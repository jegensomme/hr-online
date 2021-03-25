package com.techspirit.casein.service.impl.course.progress;

import com.techspirit.casein.model.course.progress.PageProgress;
import com.techspirit.casein.repository.api.course.progress.PageProgressRepository;
import com.techspirit.casein.service.prototype.course.progress.ServicePageProgress;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class PageProgressService implements ServicePageProgress {

    private final PageProgressRepository pageProgressRepository;

    @Override
    public PageProgress read(int id, int questProgress) {
        return checkNotFoundWithId(pageProgressRepository.get(id, questProgress), questProgress);
    }
}
