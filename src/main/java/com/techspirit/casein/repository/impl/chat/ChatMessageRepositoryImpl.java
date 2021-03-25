package com.techspirit.casein.repository.impl.chat;

import com.techspirit.casein.model.chat.Chat;
import com.techspirit.casein.model.chat.ChatMessage;
import com.techspirit.casein.repository.api.chat.ChatMessageRepository;
import com.techspirit.casein.repository.impl.AbstractDependentRepository;
import com.techspirit.casein.repository.impl.chat.crud.CrudChatMessageRepository;
import com.techspirit.casein.repository.impl.chat.crud.CrudChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ChatMessageRepositoryImpl extends AbstractDependentRepository<ChatMessage, Chat>
                                            implements ChatMessageRepository {
    private final CrudChatMessageRepository crudRepository;

    @Autowired
    public ChatMessageRepositoryImpl(CrudChatMessageRepository crudRepository,
                                     CrudChatRepository crudChatRepository) {
        super(crudRepository, crudChatRepository);
        this.crudRepository = crudRepository;
    }

    @Override
    public List<ChatMessage> getAll(int chatId) {
        return crudRepository.getAll(chatId);
    }

    @Override
    protected void setParent(ChatMessage entity, Chat parent) {

    }

    @Override
    protected boolean checkParent(ChatMessage entity, int pid) {
        return false;
    }
}
