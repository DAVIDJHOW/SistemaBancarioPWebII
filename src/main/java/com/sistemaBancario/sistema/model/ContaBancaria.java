package com.sistemaBancario.sistema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ContaBancaria {
	
	@Id
	@GeneratedValue
	private int numeroConta;
	
	@Column
	private String titular;
	
	@Column
	private Double saldo;
	
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public Double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor )
	{
		if(valor <=0 )
		{
			System.err.println("valor incorreto!");
		}
		
		else
		{
			this.saldo = this.saldo + valor;
		}
		
	}
	
	public void sacar(double valor)
	{
		if(this.saldo > 0 && this.saldo<=valor)
		{
			this.saldo = this.saldo - valor;
			System.out.println("Saldo atual: "+getSaldo());
		}
		
		else
		{
			System.err.println("saldo insuficiente!");
		}
	}
	
	
	
	
	

}
