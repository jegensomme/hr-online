package com.techspirit.casein.model.course;

import com.techspirit.casein.model.NamedEntity;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "quests")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true)
public class Quest extends NamedEntity {

    @Column(name = "description")
    @NotNull
    private String description;

    @OneToMany(mappedBy = "quest")
    @OrderBy(value = "order ASC")
    private List<Page> pages;

    @OneToMany(mappedBy = "quest")
    @OrderBy(value = "order ASC")
    private List<Question> questions;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Course course;

    @Column(name = "order")
    @Range(min = 0)
    private int order;
}
