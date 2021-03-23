package com.techspirit.casein.model;

import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

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

    @ManyToMany(mappedBy = "quests")
    private Set<Course> courses;

    @Embeddable
    @Data
    public static class OrderedQuestKey implements Serializable {

        private Integer courseId;

        private Integer questId;
    }

    @Entity
    @Table(name = "course_quests")
    public static class OrderedQuest extends EmbeddedKeyEntity<OrderedQuestKey> {

        @EmbeddedId
        private OrderedQuestKey id;

        @ManyToOne(fetch = FetchType.LAZY)
        @MapsId("courseId")
        @JoinColumn(name = "course_id")
        @OnDelete(action = OnDeleteAction.CASCADE)
        private Course course;

        @ManyToOne
        @MapsId("questId")
        @JoinColumn(name = "quest_id")
        @OnDelete(action = OnDeleteAction.CASCADE)
        private Quest quest;

        @Column(name = "order")
        @Range(min = 0)
        private int order;
    }
}
