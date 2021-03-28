package com.techspirit.casein.web.controller.course;

import com.techspirit.casein.model.course.Question;
import com.techspirit.casein.service.impl.course.QuestionService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return service.read(id, questId);
    }
}
