package com.franklin.Universidade.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.franklin.Universidade.entities.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
