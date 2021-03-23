package com.techspirit.casein.controller.cuerseController;

import com.techspirit.casein.model.PageElement;
import com.techspirit.casein.service.prototype.ServicePageElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageElementController {
    private final ServicePageElement servicePageElement;

    @Autowired
    public PageElementController(ServicePageElement servicePageElement) { this.servicePageElement = servicePageElement;}

    @CrossOrigin
    @GetMapping(value = "/page_elements/{id}")
    public ResponseEntity<PageElement> read(@PathVariable(name = "id") int id){
        final PageElement pageElement = servicePageElement.read(id);

        return pageElement != null
                ? new ResponseEntity<>(pageElement, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
