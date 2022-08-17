package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o nome: ");
		String nome = entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "INSERT INTO pessoa(nome) "
				+ "VALUES (?);";
		System.out.println(sql);
		PreparedStatement pstm = conexao.prepareStatement(sql);
		pstm.setString(1, nome);
		
		pstm.execute();
		System.out.println("Incluido com sucesso");
		entrada.close();

	}

}
