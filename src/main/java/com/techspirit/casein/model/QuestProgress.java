package com.techspirit.casein.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table(name = "quest_progresses")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true)
public class QuestProgress extends BaseEntity {

    private Quest quest;

    private Page currentPage;

    private int value;
}
