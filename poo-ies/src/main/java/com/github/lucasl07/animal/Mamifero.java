package com.github.lucasl07.animal;

public class Mamifero extends Animal {
	private String alimento;
	
	public Mamifero(String nome, Float comprimento, Integer numPatas, String cor, String ambiente,
			Float velocidadeMedia, String alimento) {
		super(nome, comprimento, numPatas, cor, ambiente, velocidadeMedia);
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	@Override
	public String dados() {
		return "Animal [nome=" + nome + ", comprimento=" + comprimento + ", numPatas=" 
				+ numPatas + ", cor=" + cor + ", ambiente=" + ambiente + ", velocidadeMedia=" 
				+ velocidadeMedia + ", alimento=" + alimento + "]";
	}
}
