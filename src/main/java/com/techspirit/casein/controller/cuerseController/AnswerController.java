package com.techspirit.casein.controller.cuerseController;

import com.techspirit.casein.model.Answer;
import com.techspirit.casein.service.prototype.ServiceAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
public class AnswerController {
    private final ServiceAnswer serviceAnswer;

    @Autowired
    public AnswerController(ServiceAnswer serviceAnswer) { this.serviceAnswer = serviceAnswer;}

    @CrossOrigin
    @GetMapping(value = "/answers/{id}")
    public ResponseEntity<Answer> read(@PathVariable(name = "id") int id){
        final Answer answer = serviceAnswer.read(id);

        return answer != null
                ? new ResponseEntity<>(answer, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @CrossOrigin
    @PutMapping(value = "/answers/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id) {
        final boolean update = serviceAnswer.update(id);
        return update
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
