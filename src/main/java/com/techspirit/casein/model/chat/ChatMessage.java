package com.techspirit.casein.model.chat;

import com.techspirit.casein.model.BaseEntity;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "chat_messages")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true)
public class ChatMessage extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private Chat receiver;

    @Column(name = "message")
    @NotBlank
    private String message;

    @Column(name = "date_time")
    @NotNull
    private LocalDateTime dateTime;
}
