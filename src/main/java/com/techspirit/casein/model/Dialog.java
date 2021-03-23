package com.techspirit.casein.model;

import lombok.*;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;

@Entity
@Table(name = "dialogs")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true)
public class Dialog extends PageElement {

    @Column(name = "with_action")
    private boolean withAction;

    @Column(name = "order")
    @Range(min = 0)
    private int order;
}
