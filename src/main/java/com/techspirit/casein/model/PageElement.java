package com.techspirit.casein.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

//@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
//@Table(name = "page_elements")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true)
public class PageElement extends BaseEntity {

    private Page page;

    private String text;
}
