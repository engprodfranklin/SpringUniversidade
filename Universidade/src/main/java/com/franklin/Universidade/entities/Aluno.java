package com.franklin.Universidade.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_aluno")
public class Aluno implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(length = 50, nullable = true, unique = true)
	private int matricula;
	
	@Column(length = 50)
	private String nome;
	
	@Column(length = 11)
	private String dtnascimento;
	
	@Column(length = 50, nullable = true)
	private String telefone;
	
	@Column(length = 50)
	private String bairro;
	
	@Column(length = 10)
	private String cep;
	
	@ManyToOne
	@JoinColumn(name = "fk_codigocurso")
	private Curso curso;

	
	public Aluno() {}
	
	public Aluno(int matricula, String nome, String dtnascimento, String telefone, String bairro, String cep,
			Curso curso) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.dtnascimento = dtnascimento;
		this.telefone = telefone;
		this.bairro = bairro;
		this.cep = cep;
		this.curso = curso;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDtnascimento() {
		return dtnascimento;
	}

	public void setDtnascimento(String dtnascimento) {
		this.dtnascimento = dtnascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
}
