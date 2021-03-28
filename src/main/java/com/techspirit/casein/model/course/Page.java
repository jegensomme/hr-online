package com.techspirit.casein.model.course;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.techspirit.casein.model.BaseEntity;
import com.techspirit.casein.model.NamedEntity;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "pages")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true)
public class Page extends BaseEntity {

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quest_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull
    private Quest quest;

    @Column(name = "title")
    @NotBlank
    @Size(max = 100)
    private String title;

    @Column(name = "text")
    @NotBlank
    private String text;

    @Column(name = "order")
    @Range(min = 0)
    private int order;
}
