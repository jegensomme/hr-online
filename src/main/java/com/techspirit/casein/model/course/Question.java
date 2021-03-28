package com.techspirit.casein.model.course;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.techspirit.casein.model.BaseEntity;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "questions")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true)
public class Question extends BaseEntity {

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quest_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Quest quest;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "question")
    private List<Answer> answers;

    @Column(name = "text")
    @NotBlank
    private String text;

    @Column(name = "order")
    @Range(min = 0)
    private int order;
}
