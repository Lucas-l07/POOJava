package com.github.lucasl07.escritorio;

public  class Gerente extends Funcionario {

	@Override
	public void calculaSario() {
		setSalarioBase(getSalarioBase() * 2);
	}
	
}
