package com.techspirit.casein.web.controller.course;

import com.techspirit.casein.model.course.Page;
import com.techspirit.casein.service.course.PageService;
import com.techspirit.casein.util.exception.NotFoundException;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/courses/quests/{questId}/pages")
@AllArgsConstructor
@Slf4j
@Api(tags="Page controller")
public class PageController {

    private final PageService service;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Page get(@PathVariable int id, @PathVariable int questId) {
        log.info("read {}", id);
        try {
            return service.read(id, questId);
        } catch (NotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage(), e);
        }
    }
}
