package com.techspirit.casein.repository.api.chat;

import com.techspirit.casein.model.chat.ChatMessage;
import com.techspirit.casein.repository.api.DependentRepository;

import java.util.List;

public interface ChatMessageRepository extends DependentRepository<ChatMessage> {
    List<ChatMessage> getAll(int chatId);
}
