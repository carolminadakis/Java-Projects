import java.util.Scanner;

public class CalculoQuadrado {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o n�mero no qual deseja calcular o quadrado: ");
		Integer numero = scanner.nextInt();
		
		Integer numeroQuadrado = numero * numero;
		
		System.out.println("O valor do n�mero " + numero + " ao quadrado �: " + numeroQuadrado);
		
		scanner.close();
	}

}
