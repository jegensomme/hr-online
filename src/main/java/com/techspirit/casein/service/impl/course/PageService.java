package com.techspirit.casein.service.impl.course;

import com.techspirit.casein.model.course.Page;
import com.techspirit.casein.repository.api.course.PageRepository;
import com.techspirit.casein.service.prototype.course.ServicePage;
import com.techspirit.casein.util.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class PageService implements ServicePage {

    private final PageRepository repository;

    @Override
    public Page read(int id, int questId) throws NotFoundException {
        return checkNotFoundWithId(repository.get(id, questId), id);
    }
}
