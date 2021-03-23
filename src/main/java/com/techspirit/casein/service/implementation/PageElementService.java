package com.techspirit.casein.service.implementation;

import com.techspirit.casein.model.PageElement;
import com.techspirit.casein.repository.PageElementRepository;
import com.techspirit.casein.service.prototype.ServicePageElement;
import org.springframework.stereotype.Service;

@Service
public class PageElementService implements ServicePageElement {
    private final PageElementRepository pageElementRepository;

    public PageElementService(PageElementRepository pageElementRepository) {
        this.pageElementRepository = pageElementRepository;
    }

    @Override
    public PageElement read(int id){
        return pageElementRepository.getOne(id);
    }
}
