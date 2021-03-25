package com.techspirit.casein.service.prototype.chat;

import com.techspirit.casein.model.chat.Chat;

public interface ServiceChat {
    /**
     * Возвращает чат пользователя по его ID
     * @param id - ID чата
     * @param userId - ID пользователя
     * @return - чат с заданным ID
     */
    Chat read(int id, int userId);
}
