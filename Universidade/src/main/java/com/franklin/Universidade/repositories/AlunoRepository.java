package com.franklin.Universidade.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.franklin.Universidade.entities.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{

}
