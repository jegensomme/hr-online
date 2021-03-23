package com.techspirit.casein.model;

import com.techspirit.casein.model.accessors.NamedEntity;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true)
public class Course extends NamedEntity {

    @Column(name = "description", nullable = false)
    @NotNull
    private String description;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
    @OrderBy(value = "order ASC")
    private List<Quest.OrderedQuest> orderedQuests;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
    private Set<Position> positions;
}
