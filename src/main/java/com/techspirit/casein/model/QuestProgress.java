package com.techspirit.casein.model;

import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.Range;

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
    @NotNull
    private CourseProgress courseProgress;

    @ManyToOne
    @JoinColumn(name = "quest_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull
    private Quest quest;

    @ManyToOne
    @JoinColumn(name = "current_page_id")
    private Page currentPage;

    @Column(name = "value")
    @Range(min = 0, max = 100)
    private int value;
}
