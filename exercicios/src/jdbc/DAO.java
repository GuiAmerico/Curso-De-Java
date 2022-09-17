package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

	private Connection conexao;
	
	public int incluir(String sql, Object... atributos) {
		try {
			PreparedStatement pstm = getConexao()
					.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
			adicionarAtributos(pstm, atributos);
			
			if(pstm.executeUpdate() > 0) {
				ResultSet res = pstm.getGeneratedKeys();
				if(res.next()) {
					return res.getInt(1);
				}
			}
			
			return -1;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void close() {
		try {
			getConexao().close();
		} catch (SQLException e) {
			
		}finally {
			conexao = null;
		}
	}
	
	private void adicionarAtributos(PreparedStatement pstm, Object[] atributos) throws SQLException {
		int i = 1;
		for(Object atributo : atributos) {
			if(atributo instanceof String) {
				pstm.setString(i,(String) atributo);
			}else if(atributo instanceof Integer){
				pstm.setInt(i, (Integer) atributo);
			}
			i++;
		}
		
	}
	
	private Connection getConexao() {
		try {
			if(conexao != null && !conexao.isClosed()) {
				return conexao;
			}
		} catch (Exception e) {
			
		}
		
		conexao = FabricaConexao2.getConexao();
		return conexao;
	}
	
}
