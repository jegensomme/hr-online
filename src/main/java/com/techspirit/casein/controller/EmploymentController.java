package com.techspirit.casein.controller;

import com.techspirit.casein.model.Employment;

import com.techspirit.casein.service.prototype.ServiceEmployment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmploymentController {
    private final ServiceEmployment serviceEmployment;

    @Autowired
    public EmploymentController(ServiceEmployment serviceEmployment) { this.serviceEmployment = serviceEmployment;}

    @CrossOrigin
    @PostMapping(value = "/employment")
    public ResponseEntity<?> create (@RequestBody Employment employment)
    {
        serviceEmployment.create(employment);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @CrossOrigin
    @GetMapping(value = "/employment")
    public ResponseEntity<List<Employment>> read ()
    {
        final List<Employment> employments = serviceEmployment.readALL();

        return employments != null && !employments.isEmpty()
                ? new ResponseEntity<>(employments, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @CrossOrigin
    @GetMapping(value = "/employment/{id}")
    public ResponseEntity<Employment> read(@PathVariable(name = "id") int id){
        final Employment employment = serviceEmployment.read(id);

        return employment != null 
                ? new ResponseEntity<>(employment, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @PutMapping(value = "/employment/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id, @RequestBody Employment employment) {
        final boolean update = serviceEmployment.update(employment, id);
        return update
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @DeleteMapping(value = "/employment/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id) {
        final boolean deleted = serviceEmployment.delete(id);
        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
