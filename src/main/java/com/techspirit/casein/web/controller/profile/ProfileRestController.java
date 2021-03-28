package com.techspirit.casein.web.controller.profile;

import com.techspirit.casein.model.profile.Profile;
import com.techspirit.casein.service.impl.profile.ProfileService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profiles")
@AllArgsConstructor
@Slf4j
@Api(tags="Profile controller")
public class ProfileRestController {

    private final ProfileService service;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Profile get(@PathVariable int id) {
        log.info("read {}", id);
        return service.read(id);
    }

}
