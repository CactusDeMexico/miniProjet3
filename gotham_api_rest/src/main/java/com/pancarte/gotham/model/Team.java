package com.pancarte.gotham.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "team")
@Getter
@Setter
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_team")
    private int id;

    @Column(name = "team_name")
    private String teamName;

    @Column(name = "id_manager")
    private int idManager;

    @Column(name = "id_teamate")
    private int idTeamate;


}
