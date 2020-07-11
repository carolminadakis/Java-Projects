package escritaarquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraDeArquivos {

	public static void main(String[] args) throws IOException {
		
		Path arquivo = Paths.get("C:\\Users\\carol\\OneDrive\\Documentos\\MeusProjetos\\ArquivosJava(Cap. 10).txt");
		
		List<String> linhas = Files.readAllLines(arquivo);
		
		for (int i = 0; i < linhas.size(); i++) {
			String nome = linhas.get(i);
			
			System.out.println("Item " + (i + 1)  + ": " + nome);
		}
		
	
	}

}
