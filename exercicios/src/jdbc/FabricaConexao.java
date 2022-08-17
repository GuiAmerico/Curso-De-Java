package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	
	public static Connection getConexao() {
		final String url = "jdbc:mysql://localhost/curso_java?verifyServerCertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "4d3c2b1a";
		
		try {
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		
	};

}
