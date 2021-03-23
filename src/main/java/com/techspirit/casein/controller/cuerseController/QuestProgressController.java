package com.techspirit.casein.controller.cuerseController;

import com.techspirit.casein.model.QuestProgress;
import com.techspirit.casein.service.prototype.ServiceQuestProgress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestProgressController {
    private final ServiceQuestProgress serviceQuestProgress;

    @Autowired
    public QuestProgressController(ServiceQuestProgress serviceQuestProgress) { this.serviceQuestProgress = serviceQuestProgress;}

    @CrossOrigin
    @GetMapping(value = "/quest_progresses/{id}")
    public ResponseEntity<QuestProgress> read(@PathVariable(name = "id") int id){
        final QuestProgress questProgress = serviceQuestProgress.read(id);

        return questProgress != null
                ? new ResponseEntity<>(questProgress, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
