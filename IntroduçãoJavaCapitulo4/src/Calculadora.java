import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Pedindo que usuário entre com os números e operação desejada.
		
		System.out.print("Digite um número: ");
		Double numero1 = scanner.nextDouble();
		
		System.out.print("Escolha uma das opeações abaixo, pelo número referente\n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão: ");
		Integer operacao = scanner.nextInt();
		
		System.out.print("Digite outro número: ");
		Double numero2 = scanner.nextDouble();
		
		// Definindo operação a ser realizada, trabalhando com IF.
		
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
		
		System.out.println("O resultado da operação é: " + resultado);
		
		scanner.close();

	}

}
