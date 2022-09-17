package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto("Lápis", 3.53);
		Produto produto2 = new Produto("Celular", 2304.32);
		Produto produto3 = new Produto("Notebook", 3453.21);
		Produto produto4 = new Produto("Microondas", 399.99);
		Produto produto5 = new Produto("Vassoura", 24.98);
		Produto produto6 = new Produto("Televisão", 1202.20);
		DAO<Produto> dao = new DAO<>(Produto.class);
		
		dao.abrirT().incluir(produto).fecharT();
		dao.abrirT().incluir(produto2).fecharT();
		dao.abrirT().incluir(produto3).fecharT();
		dao.abrirT().incluir(produto4).fecharT();
		dao.abrirT().incluir(produto5).fecharT();
		
		dao.incluirAtomico(produto6).fechar();
	}
	
}
