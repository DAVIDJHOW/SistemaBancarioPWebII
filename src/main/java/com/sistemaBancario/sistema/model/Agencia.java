package com.sistemaBancario.sistema.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Agencia {
	
	@Id
	@GeneratedValue
	private Integer id ;
	
	@Column(name = "numero_agencia")
	private int numeroAgencia;
	
	@Column(name = "cidade_agencia")
	private String cidadeAgencia;
	
	@ManyToOne
	@JoinColumn(name = "id")
	private List<Cliente> clientes;
	
	
	public Agencia ()
	{
		
	}
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getCidadeAgencia() {
		return cidadeAgencia;
	}

	public void setCidadeAgencia(String cidadeAgencia) {
		this.cidadeAgencia = cidadeAgencia;
	}


	

	public List<Cliente> getClientes() {
		return clientes;
	}



	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroAgencia;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agencia other = (Agencia) obj;
		if (numeroAgencia != other.numeroAgencia)
			return false;
		return true;
	}
	
	
	
	
	
	
	

}
