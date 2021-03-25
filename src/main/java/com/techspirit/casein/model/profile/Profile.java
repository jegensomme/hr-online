package com.techspirit.casein.model.profile;

import com.techspirit.casein.model.NamedEntity;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "profiles")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true)
public class Profile extends NamedEntity {

    @Column(name = "email")
    @Email
    @NotBlank
    @Size(max = 100)
    private String email;

    @OneToOne(mappedBy = "profile")
    private Photo photo;

    @Column(name = "entry_date")
    @NotNull
    private LocalDate entryDate;

    @ManyToOne
    @JoinColumn(name = "position_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull
    private Position position;
}
