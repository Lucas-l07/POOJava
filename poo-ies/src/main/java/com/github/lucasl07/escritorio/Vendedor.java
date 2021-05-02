package com.github.lucasl07.escritorio;

public class Vendedor extends Funcionario {
	private Double comissao;
	
	
	public Vendedor() {
		this.comissao = 0.00;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double valorProdutoVendido) {
		this.comissao = valorProdutoVendido;
	}

	@Override
	public void calculaSario() {
		setSalarioBase(getSalarioBase() + getComissao());
	}

	public void vendaProduto(Double valorProduto) {
		setComissao(getComissao() + (valorProduto * 0.15));
	}
	
}
