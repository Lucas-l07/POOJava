package com.github.lucasl07.animal;

public class Peixe extends Animal {
	private String caracteristica;
	
	public Peixe(String nome, Float comprimento, Integer numPatas, String cor, 
				String ambiente, Float velocidadeMedia, String caracteristica) {
		super(nome, comprimento, numPatas, cor, ambiente, velocidadeMedia);
		this.caracteristica = caracteristica;
	}

	public String getCaracteristica() {
		return caracteristica;
	}
	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	@Override
	public String dados() {
		return "Animal [nome=" + nome + ", comprimento=" + comprimento + ", numPatas=" 
				+ numPatas + ", cor=" + cor + ", ambiente=" + ambiente + ", velocidadeMedia=" 
				+ velocidadeMedia + ", caracteristica=" + caracteristica + "]";
	}
}
