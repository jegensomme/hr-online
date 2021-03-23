package com.techspirit.casein.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "work_schedules")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class WorkSchedule extends BaseEntity {

    @OneToMany(mappedBy = "workSchedule")
    List<Profile> profiles;
}
