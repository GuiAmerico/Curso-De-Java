package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		Usuario u1 = new Usuario("R.Gaúcho", "ronaldinho@email.com");
		em.getTransaction().begin();
		em.persist(u1);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		
		
		
	}

}
