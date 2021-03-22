package com.techspirit.casein.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

//@Entity
//@Table(name = "progresses")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true)
public class Progress extends BaseEntity {

    private User user;

    private Course course;

    private Quest currentQuest;

    private int value;

    private List<QuestProgress> questProgresses;
}
