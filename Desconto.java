import java.util.Scanner;
/**
 * Desconto
 */
public class Desconto {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: R$ ");
		Double preco = scanner.nextDouble();
		
		Double frete = 0.0;
		Boolean valorSemFrete = preco >= 100;
		
		if(!valorSemFrete) {
			frete = 15.0;
		}
		
		Double totalCompra = preco + frete;
		
		System.out.println("O valor total da compra é de: R$ " + totalCompra);
		
		scanner.close();
    }
}

