package com.techspirit.casein.model.course;

import com.techspirit.casein.model.NamedEntity;
import com.techspirit.casein.model.profile.Position;
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

    @Column(name = "description")
    @NotNull
    private String description;

    @OneToMany(mappedBy = "course")
    @OrderBy(value = "order ASC")
    private List<Quest> quests;

    @OneToMany(mappedBy = "course")
    private Set<Position> positions;
}
