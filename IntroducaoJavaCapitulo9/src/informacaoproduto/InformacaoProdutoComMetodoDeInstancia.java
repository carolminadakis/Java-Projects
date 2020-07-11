package informacaoproduto;

public class InformacaoProdutoComMetodoDeInstancia {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.nomeItem = "Café";
		produto.quantidadeItem = 7;
		
		System.out.println("É necessário repor estoque? " + produto.informacaoProdutoEmEstoque());
		
	}

}
