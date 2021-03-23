package com.techspirit.casein.controller.cuerseController;

import com.techspirit.casein.model.Page;
import com.techspirit.casein.service.prototype.ServicePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {
    private final ServicePage servicePage;

    @Autowired
    public PageController(ServicePage servicePage) { this.servicePage = servicePage;}

    @CrossOrigin
    @GetMapping(value = "/pages/{id}")
    public ResponseEntity<Page> read(@PathVariable(name = "id") int id){
        final Page page = servicePage.read(id);

        return page != null
                ? new ResponseEntity<>(page, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
