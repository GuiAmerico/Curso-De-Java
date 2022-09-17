package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


import modelo.basico.Usuario;

public class ObterUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "SELECT u FROM Usuario u";
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		
		List<Usuario> usuarios = query.getResultList();
		
		for(Usuario usuario: usuarios) {
			System.out.println("Nome: " + usuario.getNome() + " | ID: " + usuario.getId() + "| Email: " + usuario.getEmail());
		}
		
		em.close();
		emf.close();
	}

}
