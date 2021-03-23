package com.techspirit.casein.web;

import com.techspirit.casein.model.User;
import com.techspirit.casein.service.UserService;
import com.techspirit.casein.util.ValidationUtil;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.hateoas.MediaTypes;
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

    private final UserService service;

    @GetMapping("/{id}")
    public User get(@PathVariable int id) {
        log.info("get {}", id);
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {
        log.info("delete {}", id);
        service.delete(id);
    }

    @PostMapping(consumes = MediaTypes.HAL_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.CREATED)
    public User create(@Valid @RequestBody User user) {
        log.info("register {}", user);
        ValidationUtil.checkNew(user);
        return service.create(user);
    }

    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable int id, @Valid @RequestBody User user) {
        log.info("update {} to {}", id, user);
        User oldUser = service.get(id);
        ValidationUtil.assureIdConsistent(user, oldUser.id());
        if (user.getLink() == null) {
            user.setLink(oldUser.getLink());
        }
        service.update(user);
    }
}