package exercicio02;

import console.Interacao;

public class ValorTroco {

	public static void main(String[] args) {
		
		Interacao interacao = new Interacao();
		
		Double valorProduto = interacao.lerDecimal("Digite o valor do produto: ");
		Double valorCliente = interacao.lerDecimal("Quantidade passada pelo cliente: ");
		Double resultado = (valorCliente - valorProduto);
		interacao.imprimir("O troco é de R$: " + resultado);
		
		interacao.fechar();
	}

}
