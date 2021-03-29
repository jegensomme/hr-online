package com.techspirit.casein.web.controller.profile;

import com.techspirit.casein.model.profile.User;
import com.techspirit.casein.service.profile.UserService;
import com.techspirit.casein.util.exception.NotFoundException;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
@Slf4j
@Api(tags="User controller")
public class UserController {

    private final UserService service;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User get(@PathVariable int id) {
        log.info("read {}", id);
        try {
            return service.read(id);
        } catch (NotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage(), e);
        }
    }
}
