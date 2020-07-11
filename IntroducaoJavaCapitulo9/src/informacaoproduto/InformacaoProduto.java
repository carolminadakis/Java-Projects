package informacaoproduto;

public class InformacaoProduto {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nomeItem = "Café";
		produto.quantidadeItem = 12;
		
		imprimirInformacaoEstoque(produto);
		

	}
	
	static void imprimirInformacaoEstoque (Produto item) {
		if (item.quantidadeItem < 10) {
			
			System.out.println("Item: " + item.nomeItem + " possui " + item.quantidadeItem + " unidades , precisa repor estoque.");
		} else {
			System.out.println("Item: " + item.nomeItem + " possui " + item.quantidadeItem + " unidades , não precisa repor estoque.");

		}
		
	}

}
