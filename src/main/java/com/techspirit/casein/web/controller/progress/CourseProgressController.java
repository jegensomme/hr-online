package com.techspirit.casein.web.controller.progress;

import com.techspirit.casein.AuthUser;
import com.techspirit.casein.model.course.progress.CourseProgress;
import com.techspirit.casein.service.impl.progress.CourseProgressService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/progresses")
@AllArgsConstructor
@Slf4j
@Api(tags="CourseProgress controller")
public class CourseProgressController {

    private final CourseProgressService service;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CourseProgress get(@PathVariable int id) {
        log.info("read {}", id);
        return service.read(id, AuthUser.id());
    }
}
