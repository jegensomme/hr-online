package com.techspirit.casein.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "questions")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true)
public class Question extends PageElement {

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "question")
    private List<Answer> answerOptions;
}
