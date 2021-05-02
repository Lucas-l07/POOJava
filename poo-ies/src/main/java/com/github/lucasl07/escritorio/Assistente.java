package com.github.lucasl07.escritorio;

public class Assistente extends Funcionario {

	@Override
	public void calculaSario() {
		setSalarioBase(getSalarioBase());
	}

}
