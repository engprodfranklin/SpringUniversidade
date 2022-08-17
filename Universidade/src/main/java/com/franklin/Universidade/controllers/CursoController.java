package com.franklin.Universidade.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.franklin.Universidade.entities.Curso;
import com.franklin.Universidade.repositories.CursoRepository;

@RestController
@RequestMapping(value = "/Curso")
public class CursoController {
	
	@Autowired
	private CursoRepository cursoRepository;
	
	@GetMapping
	public List<Curso> findAll(){
		List<Curso> lista_completa = cursoRepository.findAll();
		return lista_completa;
	}
	
	@GetMapping(value = "/{codigocurso}")
	public Curso findById(@PathVariable int codigocurso) {
		Curso resultado = cursoRepository.findById(codigocurso).get();
		return resultado;
	}
	
	@PostMapping
	public Curso Inserir(@RequestBody Curso curso) {
		Curso inserir = cursoRepository.save(curso);
		return inserir;
	}
}
