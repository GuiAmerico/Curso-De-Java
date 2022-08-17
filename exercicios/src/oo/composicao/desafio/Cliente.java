package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
	String nome;
	ArrayList<Compra> listaCompra = new ArrayList<>();
	
	
	void adicionarCompra(Compra compras) {
		this.listaCompra.add(compras);
	}
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for (Compra compra: listaCompra) {
			
			total += compra.obterValorTotal(); 
		}
		
		
		return total;
	}

}
