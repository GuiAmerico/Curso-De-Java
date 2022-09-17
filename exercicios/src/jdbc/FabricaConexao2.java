package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao2 {
	
	public static Connection getConexao() {
		try {
		Properties prop = getProperties();
		final String url = prop.getProperty("banco.url");
		final String usuario = prop.getProperty("banco.usuario");
		final String senha = prop.getProperty("banco.senha");
		
		
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		
	};
	
	public static Properties getProperties() throws IOException {
		Properties prop = new Properties();
		String caminho = "/conexao.properties";
		prop.load(FabricaConexao2.class.getResourceAsStream(caminho));
		return prop;
	}

}
