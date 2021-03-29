package com.techspirit.casein.web.controller.chat;

import com.techspirit.casein.model.chat.ChatMessage;
import com.techspirit.casein.service.chat.ChatMessageService;
import com.techspirit.casein.util.exception.NotFoundException;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/user/chat/{chatId}")
@AllArgsConstructor
@Slf4j
@Api(tags="ChatMessage controller")
public class ChatMessageController {

    private final ChatMessageService service;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ChatMessage get(@PathVariable int id, @PathVariable int chatId) {
        log.info("read {}", id);
        try {
            return service.read(id, chatId);
        } catch (NotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage(), e);
        }
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ChatMessage> getAll(@PathVariable int chatId) {
        log.info("readAll");
        return service.readALL(chatId);
    }
}
