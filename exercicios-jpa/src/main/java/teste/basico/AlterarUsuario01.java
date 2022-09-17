package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Usuario usuario = em.find(Usuario.class, 4L);
		usuario.setNome("Ribamar");
		usuario.setEmail("ribamar@email.com");
		em.merge(usuario);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();

	}

}
