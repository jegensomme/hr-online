package com.techspirit.casein.service.implementation;


import com.techspirit.casein.model.Page;
import com.techspirit.casein.repository.PageRepository;
import com.techspirit.casein.service.prototype.ServicePage;
import org.springframework.stereotype.Service;

@Service
public class PageService implements ServicePage {
    private final PageRepository pageRepository;

    public PageService(PageRepository pageRepository) {
        this.pageRepository = pageRepository;
    }

    @Override
    public Page read(int id){
        return pageRepository.getOne(id);
    }
}
