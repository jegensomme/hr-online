package com.techspirit.casein.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

//@Entity
//@Table(name = "pages")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true)
public class Page extends BaseEntity {

    private Quest quest;

    private String name;

    private int order;

    private List<PageElement> pageElements;
}
