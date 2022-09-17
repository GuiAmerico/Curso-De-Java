package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento02 {

	public static void main(String[] args) {
		Assento assento = new Assento("4D");
		Cliente cliente = new Cliente("Joseph", assento);
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		dao.incluirAtomico(cliente);
	}
}
