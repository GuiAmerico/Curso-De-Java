package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Sobrinho;
import modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		
		Tio tio01 = new Tio("Nabuzodonozor");
		Tio tio02 = new Tio("Kakekiko");
		
		Sobrinho sobrinho01 = new Sobrinho("Nélio");
		Sobrinho sobrinho02 = new Sobrinho("Junior");
		
		tio01.getSobrinhos().add(sobrinho01);
		sobrinho01.getTios().add(tio01);

		tio01.getSobrinhos().add(sobrinho02);
		sobrinho02.getTios().add(tio01);

		tio02.getSobrinhos().add(sobrinho01);
		sobrinho01.getTios().add(tio02);

		tio02.getSobrinhos().add(sobrinho02);
		sobrinho02.getTios().add(tio02);
		
		DAO<Object> dao = new DAO<>();
		dao.abrirT().incluir(tio01)
		.incluir(tio02)
		.incluir(sobrinho01)
		.incluir(sobrinho02)
		.fecharT().fechar();

	}

}
