package com.techspirit.casein.web.controller.course;

import com.techspirit.casein.model.course.Question;
import com.techspirit.casein.service.course.QuestionService;
import com.techspirit.casein.util.exception.NotFoundException;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("courses/quests/{questId}/questions")
@AllArgsConstructor
@Slf4j
@Api(tags="Question controller")
public class QuestionController {

    private final QuestionService service;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Question get(@PathVariable int id, @PathVariable int questId) {
        log.info("read {}", id);
        try {
            return service.read(id, questId);
        } catch (NotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage(), e);
        }
    }
}
