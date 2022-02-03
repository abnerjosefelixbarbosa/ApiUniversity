package com.edu.university.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "tb_inscription")
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
