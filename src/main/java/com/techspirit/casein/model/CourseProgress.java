package com.techspirit.casein.model;

import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "course_progresses")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true)
public class CourseProgress extends BaseEntity {

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull
    private User user;

    @ManyToOne
    @JoinColumn(name = "course_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull
    private Course course;

    @ManyToOne
    @JoinColumn(name = "current_quest_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Quest currentQuest;

    @Column(name = "value")
    @Range(min = 0, max = 100)
    private int value;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "progress")
    private List<QuestProgress> questProgresses;

}
