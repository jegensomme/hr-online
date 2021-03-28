package com.techspirit.casein.web.controller.course;

import com.techspirit.casein.model.course.Answer;
import com.techspirit.casein.service.impl.course.AnswerService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


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
        return service.read(id, questionId);
    }
}
