package com.techspirit.casein.web.controller.course;

import com.techspirit.casein.model.course.Answer;
import com.techspirit.casein.service.course.AnswerService;
import com.techspirit.casein.util.exception.NotFoundException;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


@RestController
@RequestMapping("courses/quests/questions/{questionId}/answers")
@AllArgsConstructor
@Slf4j
@Api(tags="Answer controller")
public class AnswerController {

    private final AnswerService service;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Answer get(@PathVariable int id, @PathVariable int questionId) {
        log.info("read {}", id);
        try {
            return service.read(id, questionId);
        } catch (NotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage(), e);
        }
    }
}
