package com.techspirit.casein.model.chat;

import com.techspirit.casein.model.BaseEntity;
import com.techspirit.casein.model.profile.User;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "chats")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true)
public class Chat extends BaseEntity {

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @NotNull
    private User user;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "receiver")
    @OrderBy(value = "dateTime DESC")
    private List<ChatMessage> messages;
}
