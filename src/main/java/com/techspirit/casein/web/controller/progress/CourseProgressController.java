package com.techspirit.casein.web.controller.progress;

import com.techspirit.casein.model.course.progress.CourseProgress;
import com.techspirit.casein.service.impl.progress.CourseProgressService;
import com.techspirit.casein.util.exception.NotFoundException;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/users/{userId}/progresses")
@AllArgsConstructor
@Slf4j
@Api(tags="CourseProgress controller")
public class CourseProgressController {

    private final CourseProgressService service;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CourseProgress get(@PathVariable int id, @PathVariable int userId) {
        log.info("read {}", id);
        try {
            return service.read(id, userId);
        } catch (NotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage(), e);
        }
    }
}
