package com.github.lucasl07.teste.animal;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.lucasl07.animal.Mamifero;
import com.github.lucasl07.animal.Peixe;

public class TesteAnimal {
	
	@Test
	public void dadosCamelo() throws Exception {
		Mamifero camelo = new Mamifero("Camelo", 150f, 4, "Amarelo", "Terra", 2.0f, "Água");
		
		// Puxando do Método dados
		assertEquals(camelo.dados(), "Animal [nome=Camelo, comprimento=150.0, numPatas=4, "
									+ "cor=Amarelo, ambiente=Terra, velocidadeMedia=2.0, "
									+ "alimento=Água]");
		
		// Puxando do pelos métodos getters
		assertEquals("Camelo", camelo.getNome());
		assertEquals(Float.valueOf(150f), camelo.getComprimento());
		assertEquals(Integer.valueOf(4), camelo.getNumPatas());
		assertEquals("Amarelo", camelo.getCor());
		assertEquals("Terra", camelo.getAmbiente());
		assertEquals(Float.valueOf(2f), camelo.getVelocidadeMedia());
		assertEquals("Água", camelo.getAlimento());
	}
	
	@Test
	public void dadosTubarao() throws Exception {
		Peixe tubarao = new Peixe("Tubarão", 300f, 0, "Cinzento", "Mar", 1.5f, "Barbatanas e cauda");
		
		// Puxando do Método dados
		assertEquals(tubarao.dados(), "Animal [nome=Tubarão, comprimento=300.0, numPatas=0, "
				+ "cor=Cinzento, ambiente=Mar, velocidadeMedia=1.5, "
				+ "caracteristica=Barbatanas e cauda]");
		
		// Puxando do pelos métodos getters
		assertEquals("Tubarão", tubarao.getNome());
		assertEquals(Float.valueOf(300f), tubarao.getComprimento());
		assertEquals(Integer.valueOf(0), tubarao.getNumPatas());
		assertEquals("Cinzento", tubarao.getCor());
		assertEquals("Mar", tubarao.getAmbiente());
		assertEquals(Float.valueOf(1.5f), tubarao.getVelocidadeMedia());
		assertEquals("Barbatanas e cauda", tubarao.getCaracteristica());
	}
	
	@Test
	public void dadosUrsoDoCanada() throws Exception {
		Mamifero ursoDoCanada = new Mamifero("Urso-do-Canadá", 180f, 4, "Vermelho", "Terra", 
				0.5f, "Mel");
		
		// Puxando do método dados
		assertEquals(ursoDoCanada.dados(), "Animal [nome=Urso-do-Canadá, comprimento=180.0, numPatas=4, "
				+ "cor=Vermelho, ambiente=Terra, velocidadeMedia=0.5, "
				+ "alimento=Mel]");
		
		// Puxando do pelos métodos getters
		assertEquals("Urso-do-Canadá", ursoDoCanada.getNome());
		assertEquals(Float.valueOf(180f), ursoDoCanada.getComprimento());
		assertEquals(Integer.valueOf(4), ursoDoCanada.getNumPatas());
		assertEquals("Vermelho", ursoDoCanada.getCor());
		assertEquals("Terra", ursoDoCanada.getAmbiente());
		assertEquals(Float.valueOf(0.5f), ursoDoCanada.getVelocidadeMedia());
		assertEquals("Mel", ursoDoCanada.getAlimento());
	}
}
