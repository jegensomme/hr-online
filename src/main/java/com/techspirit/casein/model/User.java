package com.techspirit.casein.model;

import lombok.*;
import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true, exclude = {"link"})
public class User extends NamedEntity {

    @Column(name = "email")
    @Email
    @NotBlank
    @Size(max = 100)
    private String email;

    @Column(name = "link")
    @URL
    @NotBlank
    private String link;

    @OneToOne(mappedBy = "user")
    private Photo photo;

    @Column(name = "registered")
    @NotNull
    private LocalDateTime registered;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    private Set<Position> positions;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private Set<CourseProgress> courseProgresses;
}
