package com.example.demo.persistence.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "Team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String country;
}
