package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarPessoa {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conexao = FabricaConexao.getConexao();
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o nome da pessoa: ");
		String nome = entrada.nextLine();
		System.out.print("Informe o novo nome da pessoa: ");
		String novoNome = entrada.nextLine();
		String sql = "UPDATE pessoa SET nome = ? WHERE nome = ?";
		PreparedStatement pstm = conexao.prepareStatement(sql);
		pstm.setString(1, nome);
		pstm.setString(2, novoNome);
		pstm.execute();
		//ResultSet resultado = pstm.executeQuery(sql);
		System.out.println("UPDATE realizado com sucesso");
		
		conexao.close();
		entrada.close();

	}

}
