package com.franklin.Universidade.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_curso")
public class Curso implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigocurso;
	
	@Column(length = 50)
	private String nomedocurso;
	
	@Column(length = 10)
	private String duracaodocurso;
	
	@Column(length = 15)
	private String datapublicacao;
	
	public Curso() {}

	public Curso(int codigocurso, String nomedocurso, String duracaodocurso, String datapublicacao) {
		super();
		this.codigocurso = codigocurso;
		this.nomedocurso = nomedocurso;
		this.duracaodocurso = duracaodocurso;
		this.datapublicacao = datapublicacao;
	}

	public int getCodigocurso() {
		return codigocurso;
	}

	public void setCodigocurso(int codigocurso) {
		this.codigocurso = codigocurso;
	}

	public String getNomedocurso() {
		return nomedocurso;
	}

	public void setNomedocurso(String nomedocurso) {
		this.nomedocurso = nomedocurso;
	}

	public String getDuracaodocurso() {
		return duracaodocurso;
	}

	public void setDuracaodocurso(String duracaodocurso) {
		this.duracaodocurso = duracaodocurso;
	}

	public String getDatapublicacao() {
		return datapublicacao;
	}

	public void setDatapublicacao(String datapublicacao) {
		this.datapublicacao = datapublicacao;
	}
	
}
