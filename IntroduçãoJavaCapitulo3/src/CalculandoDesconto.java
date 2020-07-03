import java.util.Scanner;

public class CalculandoDesconto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Usu�rio entra com o valor e a quantidade do produto.
		System.out.print("Digite o valor do produto: R$ ");
		Double valor = scanner.nextDouble();
		
		System.out.print("Digite a quantidade do produto: ");
		Integer quantidade = scanner.nextInt();
		
		// Analisando se a compra ter� desconto ou n�o.
		Double desconto = 0.0;
		Boolean compraComDesconto = quantidade >= 10;
		
		if (compraComDesconto) {
			desconto = 10.0;
		}
		// Calculando valor final da compra:
		Double subtotal = quantidade * valor;
		Double valorDesconto = (subtotal * desconto) / 100;
		Double valorTotal = subtotal - valorDesconto;
		
		// Imprimindo resultado final para usu�rio:
		System.out.println("O valor final da compra � de R$ " + valorTotal);
		
		scanner.close();
		
	}

}
