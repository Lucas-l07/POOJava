package com.github.lucasl07.escritorio;

public abstract class Funcionario {
	protected String nome;
	protected Integer matricula;
	protected Double salarioBase;
	
	
	public Funcionario() {
		this.salarioBase = 1000.00;
	}

	public abstract void calculaSario();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
}
