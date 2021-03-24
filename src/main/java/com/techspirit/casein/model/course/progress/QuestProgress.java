package com.techspirit.casein.model.course.progress;

import com.techspirit.casein.model.BaseEntity;
import com.techspirit.casein.model.course.Quest;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "quest_progresses")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true)
public class QuestProgress extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_progress_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private CourseProgress courseProgress;

    @ManyToOne
    @JoinColumn(name = "quest_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull
    private Quest quest;

    @Column(name = "finished")
    private boolean finished;

    @Column(name = "enabled")
    private boolean enabled;
}
