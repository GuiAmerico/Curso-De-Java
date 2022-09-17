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
		System.out.print("Digite o novo nome: ");
		String novoNome = entrada.nextLine();
		System.out.print("Digite o ID da pessoa que você deseja mudar o nome: ");
		int codigo = entrada.nextInt();
		String sql = "UPDATE pessoa SET nome = ? WHERE codigo = ?";
		
		PreparedStatement pstm = conexao.prepareStatement(sql);
		pstm.setString(1, novoNome);
		pstm.setInt(2, codigo);
		pstm.execute();
		System.out.println("UPTADE realizado com sucesso");
		entrada.close();
		conexao.close();

	}

}
