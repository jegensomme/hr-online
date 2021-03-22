package com.techspirit.casein.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

//@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
//@Table(name = "dialogs")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true)
public class Dialog extends PageElement {

    private boolean with_action;
}
