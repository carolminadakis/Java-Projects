import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Pedindo que usu�rio entre com os n�meros e opera��o desejada.
		
		System.out.print("Digite um n�mero: ");
		Double numero1 = scanner.nextDouble();
		
		System.out.print("Escolha uma das opea��es abaixo, pelo n�mero referente\n1 - Adi��o\n2 - Subtra��o\n3 - Multiplica��o\n4 - Divis�o: ");
		Integer operacao = scanner.nextInt();
		
		System.out.print("Digite outro n�mero: ");
		Double numero2 = scanner.nextDouble();
		
		// Definindo opera��o a ser realizada, trabalhando com IF.
		
		Double resultado = null;
		
		if(operacao.equals(1)) {
			resultado = numero1 + numero2;
		}
		if(operacao.equals(2)) {
			resultado = numero1 - numero2;
		}
		if(operacao.equals(3)) {
			resultado = numero1 * numero2;
		}
		if(operacao.equals(4)) {
			resultado = numero1 / numero2;
		}
		
		// Imprimindo resultado final
		
		System.out.println("O resultado da opera��o �: " + resultado);
		
		scanner.close();

	}

}
