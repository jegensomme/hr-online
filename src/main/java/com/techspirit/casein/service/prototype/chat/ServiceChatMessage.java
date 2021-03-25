package com.techspirit.casein.service.prototype.chat;

import com.techspirit.casein.model.chat.ChatMessage;

import java.util.List;

public interface ServiceChatMessage {
    /**
     * Создает новое сообщение в чате
     * @param chatMessage - сообщение в чате
     * @param chatId - ID чата
     */
    ChatMessage create(ChatMessage chatMessage, int chatId);
    /**
     * Возвращает список всех сообщений в чате
     * @param chatId - ID чата
     * @return список объектов
     */
    List<ChatMessage> readALL(int chatId);
    /**
     * Возвращает сообщение в чате по его ID
     * @param id - ID сообщения
     * @param chatId - ID чата
     * @return - сообщение с заданным ID
     */
    ChatMessage read(int id, int chatId);
    /**
     * Обновляет пользователя с заданным ID,
     * в соответствии с переданным пользователем
     * @param chatMessage - обновляемое сообщение
     * @param chatId - ID чата, в котором нужно обновить сообщение
     */
    void update(ChatMessage chatMessage, int chatId);
    /**
     * Удаляет сообщение с заданным ID
     * @param id - ID удаляемого сообщения
     * @param chatId - ID чата
     */
    void delete(int id, int chatId);
}
