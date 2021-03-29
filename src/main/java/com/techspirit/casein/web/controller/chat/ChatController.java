package com.techspirit.casein.web.controller.chat;

import com.techspirit.casein.model.chat.Chat;
import com.techspirit.casein.service.chat.ChatService;
import com.techspirit.casein.util.exception.NotFoundException;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/user/{userId}/chat")
@AllArgsConstructor
@Slf4j
@Api(tags="Chat controller")
public class ChatController {

    private final ChatService service;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Chat get(@PathVariable int id, @PathVariable int userId) {
        log.info("read {}", id);
        try {
            return service.read(id, userId);
        } catch (NotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage(), e);
        }
    }
}
