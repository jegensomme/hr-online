package com.techspirit.casein.repository.impl.chat.crud;

import com.techspirit.casein.model.chat.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CrudChatMessageRepository extends JpaRepository<ChatMessage, Integer> {

    @Query("SELECT cm FROM ChatMessage cm WHERE cm.receiver.id =:chatId")
    List<ChatMessage> getAll(@Param("chatId") int chatId);
}
