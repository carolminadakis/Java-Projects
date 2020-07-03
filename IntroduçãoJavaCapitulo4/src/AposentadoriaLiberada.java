import java.util.Scanner;

public class AposentadoriaLiberada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a idade do requerente: ");
		Integer idadeRequerente = scanner.nextInt();
		
		System.out.print("Digite o tempo de contribuição do requerente: ");
		Integer tempoDeContribuicao = scanner.nextInt();
		
		Boolean idadeMinima = idadeRequerente >= 55;
		Boolean contribuicaoMinima = tempoDeContribuicao >= 25;
		
		Boolean podeAposentar = idadeMinima && contribuicaoMinima;
		
		if(podeAposentar) {
			System.out.println("O requerente tem " + idadeRequerente + " anos de idade"
					+ " e " + tempoDeContribuicao + " anos de contribuição, podendo assim se aposentar.");
		} else {
			System.out.println("O requerente tem " + idadeRequerente + " anos de idade"
					+ " e " + tempoDeContribuicao + " anos de contribuição, NÃO podendo assim se aposentar.");
		}
		
		scanner.close();
		
	}

}
