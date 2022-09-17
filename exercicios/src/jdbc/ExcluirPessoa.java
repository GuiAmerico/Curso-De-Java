package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o codigo da pessoa que dejesa remover: ");
		int codigo = entrada.nextInt();
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoa WHERE codigo ?";
		PreparedStatement pstm = conexao.prepareStatement(sql);
		pstm.setInt(1, codigo);
		
		if(pstm.executeUpdate() > 0) {
			System.out.println("Pessoa excluída com sucesso");
		}else {
			System.out.println("Nada feito!");
		}
		conexao.close();
		entrada.close();

	}

}
