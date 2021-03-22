package com.techspirit.casein.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table(name = "answers")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true)
public class Answer extends BaseEntity {

    private Question question;

    private String text;

    private boolean correct;
}
