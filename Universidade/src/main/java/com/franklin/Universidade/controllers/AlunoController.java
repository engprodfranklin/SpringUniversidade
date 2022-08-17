package com.franklin.Universidade.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.franklin.Universidade.entities.Aluno;
import com.franklin.Universidade.repositories.AlunoRepository;

@RestController
@RequestMapping(value = "/Aluno")
public class AlunoController {
	
	@Autowired
	private AlunoRepository alunorepository;
	
	@GetMapping
	public List<Aluno> findAll(){
		List<Aluno> lista_completa = alunorepository.findAll();
		return lista_completa;
	}
	
	@GetMapping(value = "/{matricula}")
	public Aluno findById(@PathVariable int matricula) {
		Aluno result = alunorepository.findById(matricula).get();
		return result;
	}
	
	@PostMapping
	public Aluno Inserir(@RequestBody Aluno aluno) {
		Aluno inserir = alunorepository.save(aluno);
		return inserir;
	}

}
