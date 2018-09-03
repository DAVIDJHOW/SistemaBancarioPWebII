package com.sistemaBancario.sistema.model;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cliente extends Pessoa {
	
	@Column
	private String RG;
	
	@ManyToOne
	@JoinColumn(name = "numeroConta")
	private List<ContaBancaria> contas;

	public String getRG() {
		return RG;
	}
	
	
	
	
	

	public List<ContaBancaria> getContas() {
		return contas;
	}






	public void setContas(List<ContaBancaria> contas) {
		this.contas = contas;
	}






	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((RG == null) ? 0 : RG.hashCode());
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
		Cliente other = (Cliente) obj;
		if (RG == null) {
			if (other.RG != null)
				return false;
		} else if (!RG.equals(other.RG))
			return false;
		return true;
	}
	
	

}
