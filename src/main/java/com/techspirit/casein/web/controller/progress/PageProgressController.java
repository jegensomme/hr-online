package com.techspirit.casein.web.controller.progress;

import com.techspirit.casein.model.course.progress.PageProgress;
import com.techspirit.casein.service.impl.progress.PageProgressService;
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
@RequestMapping("/users/progresses/quests/{questProgressId}/pages")
@AllArgsConstructor
@Slf4j
@Api(tags="PageProgress controller")
public class PageProgressController {

    private final PageProgressService service;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public PageProgress get(@PathVariable int id, @PathVariable int questProgressId) {
        log.info("read {}", id);
        try {
            return service.read(id, questProgressId);
        } catch (NotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage(), e);
        }
    }
}
