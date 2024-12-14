package com.example.demo.repositories;

import com.example.demo.entities.Aluno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Integer> {
    public List<Aluno> findByNome(String nome);
    public List<Aluno> findByNomeAndEmailOrderByNomeDesc(String nome, String email);
    public List<Aluno> findByIdade(int idade);
    public List<Aluno> findByIdadeBetween(int idade, int idade2);

}
