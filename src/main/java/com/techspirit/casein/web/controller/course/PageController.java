package com.techspirit.casein.web.controller.course;

import com.techspirit.casein.model.course.Page;
import com.techspirit.casein.service.impl.course.PageService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
        return service.read(id, questId);
    }
}
