package informacaoproduto;

public class InformacaoProdutoComMetodoDeInstancia {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.nomeItem = "Caf�";
		produto.quantidadeItem = 7;
		
		System.out.println("� necess�rio repor estoque? " + produto.informacaoProdutoEmEstoque());
		
	}

}
