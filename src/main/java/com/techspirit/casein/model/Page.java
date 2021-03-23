package com.techspirit.casein.model;

import com.techspirit.casein.model.accessors.NamedEntity;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "pages")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true)
public class Page extends NamedEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quest_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull
    private Quest quest;

    @Column(name = "order")
    @Range(min = 0)
    private int order;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "page")
    private List<PageElement> pageElements;
}
