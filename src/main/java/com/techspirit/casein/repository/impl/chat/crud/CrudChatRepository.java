package com.techspirit.casein.repository.impl.chat.crud;

import com.techspirit.casein.model.chat.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudChatRepository extends JpaRepository<Chat, Integer> {
}
