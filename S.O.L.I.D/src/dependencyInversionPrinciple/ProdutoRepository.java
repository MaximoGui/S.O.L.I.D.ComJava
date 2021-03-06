package dependencyInversionPrinciple;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {
	
	private DBConnection dBConnection;
	
	public ProdutoRepository(DBConnection dBConnection) {
		this.dBConnection = dBConnection;
	}
	
	public List<Produto> buscarProdutos() {
		//retorna a lista de produtos da base de dados
		return new ArrayList<>();	
	}
	
	public void salvarProduto(Produto produto) {
		//salva a lista de produtos na base de dados
	}
}
