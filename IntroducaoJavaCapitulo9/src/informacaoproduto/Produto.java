package informacaoproduto;

public class Produto {
	
	String nomeItem;
	
	Integer quantidadeItem;

	Boolean informacaoProdutoEmEstoque () {
		
		if (quantidadeItem < 10) {
			System.out.println("Produto: " + nomeItem);
			System.out.println("Quantidade: " + quantidadeItem);
			return true ;
		} else {
			System.out.println("Produto: " + nomeItem);
			System.out.println("Quantidade: " + quantidadeItem);
			
			return false;
		}
	}
}
