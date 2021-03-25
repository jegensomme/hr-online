package com.techspirit.casein.repository.impl.chat;

import com.techspirit.casein.model.chat.Chat;
import com.techspirit.casein.model.profile.User;
import com.techspirit.casein.repository.api.chat.ChatRepository;
import com.techspirit.casein.repository.impl.AbstractDependentRepository;
import com.techspirit.casein.repository.impl.chat.crud.CrudChatRepository;
import com.techspirit.casein.repository.impl.profile.crud.CrudUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ChatRepositoryImpl extends AbstractDependentRepository<Chat, User>
                                    implements ChatRepository {
    @Autowired
    public ChatRepositoryImpl(CrudChatRepository crudRepository,
                              CrudUserRepository crudUserRepository) {
        super(crudRepository, crudUserRepository);
    }

    @Override
    protected void setParent(Chat chat, User user) {
        chat.setUser(user);
    }

    @Override
    protected boolean checkParent(Chat chat, int userId) {
        return chat.getUser().getId() == userId;
    }
}
