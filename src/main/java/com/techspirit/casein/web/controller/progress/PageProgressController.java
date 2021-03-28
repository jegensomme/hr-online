package com.techspirit.casein.web.controller.progress;

import com.techspirit.casein.model.course.progress.PageProgress;
import com.techspirit.casein.service.impl.progress.PageProgressService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return service.read(id, questProgressId);
    }
}
