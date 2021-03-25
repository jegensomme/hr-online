package com.techspirit.casein.service.impl.course;

import com.techspirit.casein.model.course.Page;
import com.techspirit.casein.repository.api.course.PageRepository;
import com.techspirit.casein.service.prototype.course.ServicePage;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class PageService implements ServicePage {

    private final PageRepository pageRepository;

    @Override
    public Page read(int id, int questId) {
        return checkNotFoundWithId(pageRepository.get(id, questId), id);
    }
}
