package com.techspirit.casein.service.course;

import com.techspirit.casein.model.course.Page;
import com.techspirit.casein.repository.api.course.PageRepository;
import com.techspirit.casein.util.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class PageService {

    private final PageRepository repository;

    public Page read(int id, int questId) throws NotFoundException {
        return checkNotFoundWithId(repository.get(id, questId), id);
    }
}
