package com.sistemaBancario.sistema.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Transacao {
	
	
	@Id
	@GeneratedValue
	private int numero;
	private String data;
	private Double valor;
	
	
	
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	

}
