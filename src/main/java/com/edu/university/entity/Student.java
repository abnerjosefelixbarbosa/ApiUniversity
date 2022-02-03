package com.edu.university.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@Entity
@Table(name = "tb_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotEmpty(message = "Name is empty.")
    @NotNull(message = "Name requered.")
    private String name;
    @NotNull(message = "Matriculation requered.")
    @Pattern(regexp = "(([0-9]{9}))$",message = "Matriculation invalided.")
    private String matriculation;
    @NotEmpty(message = "RG is empty.")
    @NotNull(message = "RG requered.")
    private String rg;
    @NotNull(message = "CPF requered.")
    @Pattern(regexp = "([0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2})$",message = "CPF invalided.")
    private String cpf;
    @NotNull(message = "Email requered.")
    @Pattern(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$",message = "Email invalided.")
    private String email;
    private boolean aprovado;
}
