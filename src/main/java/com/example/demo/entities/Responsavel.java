package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity @Setter @Getter @AllArgsConstructor @NoArgsConstructor
public class Responsavel {

    @Id @GeneratedValue
    private int id;
    private String nome;
    private String telefone;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;
}
