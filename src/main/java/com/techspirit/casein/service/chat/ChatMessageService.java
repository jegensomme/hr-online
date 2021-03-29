package com.techspirit.casein.service.chat;

import com.techspirit.casein.model.chat.ChatMessage;
import com.techspirit.casein.repository.api.chat.ChatMessageRepository;

import com.techspirit.casein.util.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

import java.util.List;

@Service
@AllArgsConstructor
public class ChatMessageService {

    private final ChatMessageRepository repository;

    public ChatMessage create(ChatMessage chatMessage, int chatId) {
        Assert.notNull(chatMessage, "chatMessage must not be null");
        return repository.save(chatMessage, chatId);
    }

    public List<ChatMessage> readALL(int chatId) {
        return repository.getAll(chatId);
    }

    public ChatMessage read(int id, int chatId) throws NotFoundException {
        return checkNotFoundWithId(repository.get(id, chatId), id);
    }

    public void update(ChatMessage chatMessage, int chatId) throws NotFoundException {
        checkNotFoundWithId(repository.save(chatMessage, chatId), chatMessage.id());
    }

    public void delete(int id, int chatId) throws NotFoundException {
        checkNotFoundWithId(repository.delete(id, chatId), id);
    }
}
