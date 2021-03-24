package com.techspirit.casein.service.impl.course;

import com.techspirit.casein.model.course.Page;
import com.techspirit.casein.repository.course.PageRepository;
import com.techspirit.casein.service.prototype.course.ServicePage;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PageService implements ServicePage {
    private final PageRepository pageRepository;

    @Override
    public Page read(int id) {
        return pageRepository.getOne(id);
    }
}
