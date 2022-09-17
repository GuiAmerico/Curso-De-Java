package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAO dao = new DAO();
		String sql = "INSERT INTO pessoa (nome) VALUES (?)";
		System.out.println(dao.incluir(sql, "Pelé"));
		System.out.println(dao.incluir(sql, "Maradona"));
		System.out.println(dao.incluir(sql, "Fenômeno"));
		System.out.println(dao.incluir(sql, "R. Gaúcho"));

		dao.close();
	
	}
	
	
}
