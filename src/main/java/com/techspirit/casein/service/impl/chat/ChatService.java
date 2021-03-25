package com.techspirit.casein.service.impl.chat;

import com.techspirit.casein.model.chat.Chat;
import com.techspirit.casein.repository.api.chat.ChatRepository;
import com.techspirit.casein.service.prototype.chat.ServiceChat;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ChatService implements ServiceChat {

    private final ChatRepository repository;

    @Override
    public Chat read(int id, int userId) {
        return checkNotFoundWithId(repository.get(id, userId), id);
    }
}
