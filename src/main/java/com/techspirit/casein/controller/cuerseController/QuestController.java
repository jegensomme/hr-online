package com.techspirit.casein.controller.cuerseController;

import com.techspirit.casein.model.Quest;
import com.techspirit.casein.service.prototype.ServiceQuest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestController {
    private final ServiceQuest serviceQuest;

    @Autowired
    public QuestController(ServiceQuest serviceQuest) { this.serviceQuest = serviceQuest;}

    @CrossOrigin
    @GetMapping(value = "/quests/{id}")
    public ResponseEntity<Quest> read(@PathVariable(name = "id") int id){
        final Quest quest = serviceQuest.read(id);

        return quest != null
                ? new ResponseEntity<>(quest, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
