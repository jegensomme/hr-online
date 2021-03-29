package com.techspirit.casein.web.controller.progress;

import com.techspirit.casein.model.course.progress.QuestProgress;
import com.techspirit.casein.service.impl.progress.QuestProgressService;
import com.techspirit.casein.util.exception.NotFoundException;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/users/progresses/{progressId}/quests")
@AllArgsConstructor
@Slf4j
@Api(tags="QuestProgress controller")
public class QuestProgressController {

    private final QuestProgressService service;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public QuestProgress get(@PathVariable int id, @PathVariable int progressId) {
        log.info("read {}", id);
        try {
            return service.read(id, progressId);
        } catch (NotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage(), e);
        }
    }
}
