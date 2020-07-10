//PROGRAMA CONTÉM ERRO

import java.util.Scanner;

public class projetoTabuada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Integer multiplicador = 0;
		
		Integer multiplicando = recebendoValor(scanner);
		
		imprimirTabuada(multiplicando, multiplicador);
		
		scanner.close();
	}
	
	static void imprimirTabuada (Integer multiplicando, Integer multiplicador) {
		Integer resultado = multiplicando * multiplicador;
		System.out.println(multiplicando + " X " + multiplicador + " = " + resultado);
		if (++multiplicador <= 10) {
			imprimirTabuada(multiplicando, multiplicador);
		}
	}
	
	static void imprimir (String texto) {
		System.out.print(texto);
	
	}
	
	static Integer recebendoValor (Scanner scanner) {
		imprimir("Digite o valor para calcular a tabuada: ");
		Integer numeroUsuario = scanner.nextInt();
		return numeroUsuario;
	}

}
