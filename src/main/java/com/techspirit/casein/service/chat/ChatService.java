package com.techspirit.casein.service.chat;

import com.techspirit.casein.model.chat.Chat;
import com.techspirit.casein.repository.api.chat.ChatRepository;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

import com.techspirit.casein.util.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ChatService {

    private final ChatRepository repository;

    public Chat read(int id, int userId) throws NotFoundException {
        return checkNotFoundWithId(repository.get(id, userId), id);
    }
}
