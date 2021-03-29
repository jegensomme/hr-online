package com.techspirit.casein.web.controller.profile;

import com.techspirit.casein.model.profile.Profile;
import com.techspirit.casein.service.impl.profile.ProfileService;
import com.techspirit.casein.util.exception.NotFoundException;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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
        try {
            return service.read(id);
        } catch (NotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage(), e);
        }
    }

}
