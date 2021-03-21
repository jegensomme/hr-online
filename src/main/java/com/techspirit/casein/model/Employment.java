package com.techspirit.casein.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "employment")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Employment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    String name;
}
