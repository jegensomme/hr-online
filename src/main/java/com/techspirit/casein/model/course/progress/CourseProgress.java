package com.techspirit.casein.model.course.progress;

import com.techspirit.casein.model.BaseEntity;
import com.techspirit.casein.model.course.Course;
import com.techspirit.casein.model.course.Quest;
import com.techspirit.casein.model.profile.User;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
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
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Course course;

    @ManyToOne
    @JoinColumn(name = "current_quest_id")
    private Quest quest;

    @Column(name = "value")
    @Range(min = 0, max = 100)
    private int value;

    @OneToMany(mappedBy = "progress")
    private List<QuestProgress> questProgresses;

}