package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido {

	public static void main(String[] args) {

		DAO<Object> dao = new DAO<>();
		Produto produto = new Produto("Geladeira" , 2898.21);
		Pedido pedido = new Pedido();
		ItemPedido item = new ItemPedido(pedido,produto,2);
		
		dao.abrirT().incluir(produto)
		.incluir(pedido)
		.incluir(item)
		.fecharT()
		.fechar();
	}

}
