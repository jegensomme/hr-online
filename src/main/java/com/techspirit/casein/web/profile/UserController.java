package com.techspirit.casein.web.profile;

import com.techspirit.casein.AuthUser;
import com.techspirit.casein.model.profile.User;
import com.techspirit.casein.service.impl.profile.UserService;
import com.techspirit.casein.util.ValidationUtil;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
@Slf4j
@Api(tags="User controller")
public class UserController {

    private final UserService userService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public User get() {
        log.info("get {}", AuthUser.id());
        return userService.read(AuthUser.id());
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete() {
        log.info("delete {}", AuthUser.id());
        userService.delete(AuthUser.id());
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@Valid @RequestBody User user) {
        log.info("update {} to {}", AuthUser.id(), user);
        ValidationUtil.assureIdConsistent(user, AuthUser.id());
        userService.update(user, AuthUser.id());
    }
}
