package com.techspirit.casein.model;

import lombok.*;

import javax.persistence.*;

//@Entity
//@Table(name = "positions")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true)
public class Position extends BaseEntity {

    private String name;

    private Course course;
}
