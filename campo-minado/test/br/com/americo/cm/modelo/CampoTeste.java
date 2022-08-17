package br.com.americo.cm.modelo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.americo.cm.excecao.ExplosaoException;

public class CampoTeste {
	private Campo campo;
	
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}
	
	@Test
	void testeVizinhoRealDistancia1Esquerda() {
		Campo vizinho = new Campo(3, 2);
		
		boolean foiAdicionado = campo.adicionarVizinho(vizinho);
		
		assertTrue(foiAdicionado);
	}
	
	@Test
	void testeVizinhoRealDistancia1Direita() {
		Campo vizinho = new Campo(3, 4);
		
		boolean foiAdicionado = campo.adicionarVizinho(vizinho);
		
		assertTrue(foiAdicionado);
	}
	
	@Test
	void testeVizinhoRealDistancia1Cima() {
		Campo vizinho = new Campo(2, 3);
		
		boolean foiAdicionado = campo.adicionarVizinho(vizinho);
		
		assertTrue(foiAdicionado);
	}@Test
	void testeVizinhoRealDistancia1Baixo() {
		Campo vizinho = new Campo(4, 3);
		
		boolean foiAdicionado = campo.adicionarVizinho(vizinho);
		
		assertTrue(foiAdicionado);
	}
	
	@Test
	void testeVizinhoRealDistancia2() {
		Campo vizinho = new Campo(4, 2);
		
		boolean foiAdicionado = campo.adicionarVizinho(vizinho);
		
		assertTrue(foiAdicionado);
	}
	
	@Test
	void testeNaoVizinho() {
		Campo vizinho = new Campo(5, 1);
		
		boolean foiAdicionado = campo.adicionarVizinho(vizinho);
		
		assertFalse(foiAdicionado);
	}
	@Test
	void testeValorPadraoAtributoMarcado() {
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacao() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacao2Chamadas() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAbriCampoNaoMinadoNaoMarcado() {
		assertTrue(campo.abrir());
	}
	
	@Test
	void testeAbriCampoNaoMinadoMarcado() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbriCampoMinadoMarcado() {
		campo.alternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbriCampoMinadoNaoMarcado() {
		campo.minar();
		
		assertThrows(ExplosaoException.class, () -> campo.abrir());
		
	}
	
	@Test
	void testeAbriComVizinhos1() {
		Campo vizinho1 = new Campo(2,2);
		Campo vizinhoDoVizinho1 = new Campo(1,1);
		
		campo.adicionarVizinho(vizinho1);
		vizinho1.adicionarVizinho(vizinhoDoVizinho1);
		
		campo.abrir();
		
		assertTrue(vizinho1.isAberto() && vizinhoDoVizinho1.isAberto());
	}

	@Test
	void testeAbriComVizinhos2() {
		Campo vizinho1 = new Campo(2,2);
		Campo vizinhoDoVizinho1 = new Campo(1,2);
		Campo vizinho2 = new Campo(1,1);
		
		vizinho2.minar();
		campo.adicionarVizinho(vizinho1);
		vizinho1.adicionarVizinho(vizinhoDoVizinho1);
		vizinho1.adicionarVizinho(vizinho2);
		
		campo.abrir();
		
		assertTrue(vizinho1.isAberto() && vizinho2.isFechado());
	}
	
	
}
