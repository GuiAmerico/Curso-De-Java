package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o parâmetro de busca: ");
		String param = entrada.nextLine();
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoa WHERE nome LIKE ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + param + "%");
		stmt.execute();
		ResultSet resultado = stmt.executeQuery(); 
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			String nome = resultado.getString("nome");
			int codigo = resultado.getInt("codigo");
			pessoas.add(new Pessoa(codigo, nome));
			
		}
		
		for(Pessoa p : pessoas) {
			System.out.println("[" + p.getCodigo()+", "+p.getNome()+ "]");
		}
		conexao.close();
		entrada.close();
	}

}
