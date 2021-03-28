package com.techspirit.casein.model.course.progress;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.techspirit.casein.model.BaseEntity;
import com.techspirit.casein.model.course.Page;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "page_progresses")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true)
public class PageProgress extends BaseEntity {

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quest_progress_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private QuestProgress questProgress;

    @ManyToOne
    @JoinColumn(name = "page_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull
    private Page page;

    @Column(name = "finished")
    private boolean finished;
}
