package com.sistemaBancario.sistema.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.engine.internal.Cascade;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa  {
	
	@Id
	private Integer id;
	
	@Column
	private String nome;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "id")
	private List<Endereco>  endereco;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

	
	
	

}
