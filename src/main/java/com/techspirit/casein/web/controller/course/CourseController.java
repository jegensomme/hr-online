package com.techspirit.casein.web.controller.course;

import com.techspirit.casein.model.course.Course;
import com.techspirit.casein.service.impl.course.CourseService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
@AllArgsConstructor
@Slf4j
@Api(tags="Course controller")
public class CourseController {

    private final CourseService service;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Course get(@PathVariable int id) {
        log.info("read {}", id);
        return service.read(id);
    }
}
