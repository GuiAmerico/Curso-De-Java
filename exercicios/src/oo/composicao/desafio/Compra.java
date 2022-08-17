package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
	
	ArrayList<Item> listaItem = new ArrayList<>();
	
	
	
	void adicionarItem(Produto p, int quantidade) {
		this.listaItem.add(new Item(p,quantidade));
	}
	
	void adicionarItem(String nome,double preco, int quantidade) {
		Produto produto = new Produto(nome,preco);
		this.listaItem.add(new Item(produto,quantidade));
	}
	
	
	double obterValorTotal() {

	double total = 0 ;
	
	for(Item item : listaItem) {
		
		total += item.quantidade * item.produto.preco;
		
	}
	
	return total;
	}

}
