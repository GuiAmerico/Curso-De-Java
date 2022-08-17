package oo.composicao;

import java.util.ArrayList;

public class Compra {
	String cliente;
	ArrayList<Item> itens = new ArrayList<>() ;
	
	void adicionarItem(String nome, int quantidade,double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
	
	void adicionarItem(Item item) {
		this.itens.add(item);
		item.compra = this;
	}
	
	double obterValorTotal() {
		double total = 0;
		System.out.println("Produto");
		for(Item item: itens) {
			System.out.println(item.nome +" "+ item.preco +" ("+ item.quantidade +")" );
			total += item.preco * item.quantidade;
		}
		System.out.print("Total da compra: ");
		return total;
	}
	
}
