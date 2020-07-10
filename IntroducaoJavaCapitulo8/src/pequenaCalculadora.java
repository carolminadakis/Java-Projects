import java.util.Scanner;

public class pequenaCalculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		imprimir("Escolha a opera��o que deseja fazer: " + "\n(0) Adi��o" + "\n(1) Subtra��o: ");
		Integer escolhaUsuario = scanner.nextInt();
		
		imprimir("Digite um n�mero: ");
		Double num1 = recebendoNumero(scanner);
		imprimir("Digite o segundo n�mero: ");
		Double num2 = recebendoNumero(scanner);

		Double resultado = operacaoEscolhida(escolhaUsuario, num1, num2);
		imprimir("O resultado da opera��o �: " + resultado);
		
		scanner.close();
	}
	
	static void imprimir (String texto) {
		System.out.print(texto);
	}
	
	static Double recebendoNumero (Scanner scanner) {
		Double numero = scanner.nextDouble();
		return numero;
	}
	
	static Double adicao (Double numeroUm, Double numeroDois) {
		Double resultadoAdicao = numeroUm + numeroDois;
		return resultadoAdicao;	
	}
	
	static Double subtracao (Double numeroUm, Double numeroDois) {
		Double resultadoSubtracao = numeroUm - numeroDois;
		return resultadoSubtracao;
	}
	
	static Double operacaoEscolhida (Integer operacao, Double numeroUm, Double numeroDois) {
		Double resultado = null;
		
		switch (operacao) {
		case 0: 
			resultado = adicao(numeroUm, numeroDois);
			break;
			
		case 1:
			resultado = subtracao(numeroUm, numeroDois);
			break;
			
		default:
			System.err.println("N�mero inv�lido!");
			System.exit(0);
		
		}
		return resultado; 
		
		
		
	}
	
}
