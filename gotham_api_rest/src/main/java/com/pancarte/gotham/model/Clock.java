package com.pancarte.gotham.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name ="clock")
@Getter
@Setter
public class Clock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_clock")
    private int id;

    @Column(name = "id_employee")
    private int idEmployee;

    @Column(name = "date_clock_in")
    private Timestamp dateClockIn;

    @Column(name = "date_clock_out")
    private Timestamp dateClockOut;}
