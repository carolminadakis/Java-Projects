import java.util.Scanner;

public class AnaliseDeNotas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota do aluno(a): ");
		Double nota = scanner.nextDouble();
		
		Boolean aprovado = nota >= 70.0;
		
		if (aprovado) {
			System.out.println("Sua nota é: " + nota + ", você está APROVADO(A)!");
		} else {
			System.out.println("Sua nota é: " + nota + ", você está REPROVADO(A)!");
		}
		
		scanner.close();

	}

}
