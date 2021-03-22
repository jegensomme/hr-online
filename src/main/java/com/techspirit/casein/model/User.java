package com.techspirit.casein.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

//@Entity
//@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true, exclude = {"link"})
public class User extends BaseEntity {

    private String name;

    private String email;

    private String link;

    private Photo photo;

    private LocalDateTime registered;

    private List<Position> positions;

    private List<Progress> progresses;
}
