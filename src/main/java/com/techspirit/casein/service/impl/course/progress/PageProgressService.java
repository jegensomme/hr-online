package com.techspirit.casein.service.impl.course.progress;

import com.techspirit.casein.model.course.progress.PageProgress;
import com.techspirit.casein.repository.course.progress.PageProgressRepository;
import com.techspirit.casein.service.prototype.course.progress.ServicePageProgress;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PageProgressService implements ServicePageProgress {
    private PageProgressRepository pageProgressRepository;

    @Override
    public PageProgress read(int id) {
        return pageProgressRepository.getOne(id);
    }
}
