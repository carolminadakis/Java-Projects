import java.util.Scanner;

public class metodosComParametros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String [] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };
		
		
	imprimirTraco();
	
	System.out.println("Escolha dentre os cursos abaixo: ");
	
	iteracao(cursos);
	
		System.out.println("O curso que você deseja é o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
		testeLogicoParaValidarPosicaoEscolhida(posicaoCursoEscolhido, cursos);
		
		imprimirTraco();
		
		String [] formasPagamento = new String [] { "Cartão", "Boleto" };
		
		System.out.println("Escolha dentre as formas de pagamento abaixo: ");
		
		iteracao(formasPagamento);
		
		System.out.println("Sua forma de pagamento escolhida é: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
		
		testeLogicoParaValidarPosicaoEscolhida(posicaoFormaPagamentoEscolhida, formasPagamento);
		
			
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		System.out.println("O curso escolhido foi: " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
		
		
		scanner.close();
	}
	
	static void imprimirTraco () {
		System.out.println("-------------------------------------------");
	}
	
	static void iteracao (String[] vetor) {

		for (int i = 0; i < vetor.length; i++) {
		System.out.println("[ " + i + " ]" + vetor[i]);
		}
		
	}
	
	static void testeLogicoParaValidarPosicaoEscolhida (Integer posicaoUsuario, String [] tamanho) {
		Boolean posicaoValida = posicaoUsuario >= 0 && posicaoUsuario < tamanho.length;
		if (!posicaoValida) {
			System.err.println("Posição inválida!");
			System.exit(1);
			
		}
	}

}
