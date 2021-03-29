package com.techspirit.casein.web.controller.course;

import com.techspirit.casein.model.course.Quest;
import com.techspirit.casein.service.impl.course.QuestService;
import com.techspirit.casein.util.exception.NotFoundException;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/courses/{courseId}/quests")
@AllArgsConstructor
@Slf4j
@Api(tags="Quest controller")
public class QuestController {

    private final QuestService service;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Quest get(@PathVariable int id, @PathVariable int courseId) {
        log.info("read {}", id);
        try {
            return service.read(id, courseId);
        } catch (NotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage(), e);
        }
    }
}
