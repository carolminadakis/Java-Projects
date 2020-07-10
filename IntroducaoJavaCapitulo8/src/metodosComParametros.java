import java.util.Scanner;

public class metodosComParametros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String [] cursos = new String[] { "Java EE", "Spring", "Java OO Avan�ado" };
		
		
	imprimirTraco();
	
	System.out.println("Escolha dentre os cursos abaixo: ");
	
	iteracao(cursos);
	
		System.out.println("O curso que voc� deseja � o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
		testeLogicoParaValidarPosicaoEscolhida(posicaoCursoEscolhido, cursos);
		
		imprimirTraco();
		
		String [] formasPagamento = new String [] { "Cart�o", "Boleto" };
		
		System.out.println("Escolha dentre as formas de pagamento abaixo: ");
		
		iteracao(formasPagamento);
		
		System.out.println("Sua forma de pagamento escolhida �: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
		
		testeLogicoParaValidarPosicaoEscolhida(posicaoFormaPagamentoEscolhida, formasPagamento);
		
			
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		System.out.println("O curso escolhido foi: " + cursoEscolhido + " e a forma de pagamento � " + formaPagamentoEscolhida);
		
		
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
			System.err.println("Posi��o inv�lida!");
			System.exit(1);
			
		}
	}

}
