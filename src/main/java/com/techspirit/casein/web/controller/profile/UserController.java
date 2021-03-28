package com.techspirit.casein.web.controller.profile;

import com.techspirit.casein.model.profile.User;
import com.techspirit.casein.service.impl.profile.UserService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
@Slf4j
@Api(tags="User controller")
public class UserController {

    private final UserService userService;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User get(@PathVariable int id) {
        log.info("read {}", id);
        return userService.read(id);
    }
}
