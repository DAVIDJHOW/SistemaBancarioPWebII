package com.sistemaBancario.sistema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Agencia {
	
	@Id
	@GeneratedValue
	private Integer id ;
	
	@Column(name = "numero_agencia")
	private int numeroAgencia;
	
	@Column(name = "cidade_agencia")
	private String cidadeAgencia;

}
