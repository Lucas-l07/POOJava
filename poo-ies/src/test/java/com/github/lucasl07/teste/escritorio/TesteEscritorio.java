package com.github.lucasl07.teste.escritorio;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.github.lucasl07.escritorio.Assistente;
import com.github.lucasl07.escritorio.Funcionario;
import com.github.lucasl07.escritorio.Gerente;
import com.github.lucasl07.escritorio.Vendedor;

public class TesteEscritorio {
	private List<Funcionario> salarioFuncionarios;

	@Before
	public void setup() {
		salarioFuncionarios = new ArrayList<>();
	}
	
	@Test
	public void verificarSalarioBase() throws Exception {
		Funcionario gerente1 = new Gerente();
		Funcionario assistente1 = new Assistente();
		Vendedor vendedor1 = new Vendedor();
		
		gerente1.calculaSario();
		assistente1.calculaSario();
		vendedor1.vendaProduto(100.00);
		vendedor1.vendaProduto(200.00);
		vendedor1.calculaSario();
		
		salarioFuncionarios.add(gerente1);
		salarioFuncionarios.add(assistente1);
		salarioFuncionarios.add(vendedor1);
		
		assertEquals(Double.valueOf(2000.00), gerente1.getSalarioBase());
		assertEquals(Double.valueOf(1000.00), assistente1.getSalarioBase());
		assertEquals(Double.valueOf(1045.00), vendedor1.getSalarioBase());
	}
	
}
