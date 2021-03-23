package com.techspirit.casein.model;

import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true, exclude = {"link"})
public class User extends NamedEntity {

    @Column(name = "link")
    @URL
    @NotBlank
    private String link;

    @Column(name = "registered")
    @NotNull
    private LocalDateTime registered;

    @OneToOne
    @JoinColumn(name = "profile_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Profile profile;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user")
    private CourseProgress courseProgress;
}
