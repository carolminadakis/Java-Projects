package escritaarquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> linhas = new ArrayList<String>();

		System.out.println("Digite sua lista de tarefas, para finalizar, aperte 'X'.");
		
		String tarefas;
		int i = 1;
		while (true) {
			System.out.print("Tarefa " + i + " - ");
			tarefas = scanner.nextLine();
			
			if ("x".equals(tarefas)) {
				break;
			}
			
			linhas.add(tarefas);
			i++;
			
		}
		
			Path arquivo = Paths.get("C:\\Users\\carol\\OneDrive\\Documentos\\MeusProjetos\\ArquivosJava(Cap. 10).txt");
			Files.write(arquivo, linhas);
			
			scanner.close();
	}
}
