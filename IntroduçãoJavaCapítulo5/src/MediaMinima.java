import java.util.Scanner;


public class MediaMinima {
	
	//Declarando constantes:
	
	static final Double MEDIA_MINIMA = 150.0;
	static final Double NOTA_POR_MATERIA = 60.0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota de Português do aluno(a): ");
		Double notaPortugues = scanner.nextDouble();
		
		System.out.print("Digite a nota de Matemática do aluno(a): ");
		Double notaMatematica = scanner.nextDouble();
		
		// Declaração das variáveis
		Double mediaAluno = notaMatematica + notaPortugues;
		Boolean notaMinima = notaPortugues >= NOTA_POR_MATERIA && notaMatematica >= NOTA_POR_MATERIA;
		Boolean mediaAprovado = mediaAluno >= MEDIA_MINIMA;
		Boolean alunoAprovado = notaMinima && mediaAprovado;
		
		
		if(alunoAprovado) {
			System.out.println("O aluno obteve nota " + notaPortugues + " em Português e "
					+ notaMatematica + " em Matemática, totalizando: " + mediaAluno + " pontos, "
							+ "portanto o aluno(a) está APROVADO(A).");
			
		} else {
		 System.out.println("O aluno obteve nota " + notaPortugues + " em Português e "
				+ notaMatematica + " em Matemática, totalizando: " + mediaAluno + " pontos, "
				+ "portanto o aluno(a) está REPROVADO(A).");
	}
	
		
		scanner.close();

	}

}
