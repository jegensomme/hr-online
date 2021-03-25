package com.techspirit.casein.service.impl.chat;

import com.techspirit.casein.model.chat.ChatMessage;
import com.techspirit.casein.repository.api.chat.ChatMessageRepository;
import com.techspirit.casein.service.prototype.chat.ServiceChatMessage;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

import java.util.List;

@Service
@AllArgsConstructor
public class ChatMessageService implements ServiceChatMessage {

    private final ChatMessageRepository repository;

    @Override
    public ChatMessage create(ChatMessage chatMessage, int chatId) {
        Assert.notNull(chatMessage, "chatMessage must not be null");
        return repository.save(chatMessage, chatId);
    }

    @Override
    public List<ChatMessage> readALL(int chatId) {
        return repository.getAll(chatId);
    }

    @Override
    public ChatMessage read(int id, int chatId) {
        return checkNotFoundWithId(repository.get(id, chatId), id);
    }

    @Override
    public void update(ChatMessage chatMessage, int chatId) {
        checkNotFoundWithId(repository.save(chatMessage, chatId), chatMessage.id());
    }

    @Override
    public void delete(int id, int chatId) {
        checkNotFoundWithId(repository.delete(id, chatId), id);
    }
}
