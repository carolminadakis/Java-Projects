import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a altura: ");
		Double altura = scanner.nextDouble();
		
		System.out.print("Digite o peso: ");
		Double peso = scanner.nextDouble();
		
		Double resultadoAltura = altura * altura;
		
		Double resultadoImc = peso / resultadoAltura;
		
		System.out.println("O resultado do IMC é: " + resultadoImc);
		
		scanner.close();

	}

}
