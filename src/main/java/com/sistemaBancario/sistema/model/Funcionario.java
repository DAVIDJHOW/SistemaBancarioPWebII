package com.sistemaBancario.sistema.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Funcionario extends Pessoa {
	
	@Column
	private int codigo;
	@Column 
	private double salario;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
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
		Funcionario other = (Funcionario) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	
	
	
	
	
	

}
