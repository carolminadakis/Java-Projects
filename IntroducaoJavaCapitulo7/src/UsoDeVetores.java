import java.util.Scanner;

public class UsoDeVetores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] tarefasDiarias = new String [5];
		System.out.println("Digite as 5 principais tarefas do seu dia a dia: ");
		
		//Loop para armazenamento das informações do usuário:
		for (int i = 0; i < tarefasDiarias.length; i++) {
			System.out.print("Tarefa " + (i+1) + ": ");
			tarefasDiarias[i] = scanner.nextLine();
			
		}
		
		//Loop para impressão das informações armazenadas:
		for (int i = 0; i < tarefasDiarias.length; i++) {
			
		System.out.println("Suas tarefas diárias são: " + 
		"(" + (i+1) + ") " + " " + tarefasDiarias[i]);
		
		}
		
		scanner.close();
	}

}
