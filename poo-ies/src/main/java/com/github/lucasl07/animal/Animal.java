package com.github.lucasl07.animal;

public class Animal {
	protected String nome;
	protected Float comprimento;
	protected Integer numPatas;
	protected String cor;
	protected String ambiente;
	protected Float velocidadeMedia;
	
	public Animal(String nome, Float comprimento, Integer numPatas, String cor, String ambiente,
			Float velocidadeMedia) {
		super();
		this.nome = nome;
		this.comprimento = comprimento;
		this.numPatas = numPatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidadeMedia = velocidadeMedia;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Float getComprimento() {
		return comprimento;
	}
	public void setComprimento(Float comprimento) {
		this.comprimento = comprimento;
	}
	public Integer getNumPatas() {
		return numPatas;
	}
	public void setNumPatas(Integer numPatas) {
		this.numPatas = numPatas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public Float getVelocidadeMedia() {
		return velocidadeMedia;
	}
	public void setVelocidadeMedia(Float velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}

	public String dados() {
		return "Animal [nome=" + nome + ", comprimento=" + comprimento + ", numPatas=" 
				+ numPatas + ", cor=" + cor + ", ambiente=" + ambiente + ", velocidadeMedia=" 
				+ velocidadeMedia + "]";  
	}
}	
