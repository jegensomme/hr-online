package com.techspirit.casein.model.accessors;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true)
public abstract class NamedEntity extends BaseEntity {

    @Column(name = "name")
    @NotBlank
    @Size(max = 100)
    private String name;
}
