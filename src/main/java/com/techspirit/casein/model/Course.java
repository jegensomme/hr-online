package com.techspirit.casein.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;
import java.util.Map;

//@Entity
//@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true)
public class Course extends BaseEntity {

    private String name;

    private String description;

    private Map<Integer, Quest> quests;

    private List<Position> positions;
}
