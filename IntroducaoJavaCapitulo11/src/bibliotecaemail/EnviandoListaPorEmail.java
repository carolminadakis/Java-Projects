package bibliotecaemail;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.mail.EmailException;

public class EnviandoListaPorEmail {

	public static void main(String[] args) throws EmailException {
		Scanner scanner = new Scanner (System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		String tarefas;
		int i = 0;
		
		while (true) {
		imprimir("Tarefa " + (i+1) + ": ");
		tarefas = scanner.nextLine();
		
		if("x".equals(tarefas)) {
			break;
		}
		linhas.add(tarefas);
		i++;
	
		}
		
		String tarefa = "";
		
		for(int iteracao = 0; iteracao < linhas.size(); iteracao++) {
			
			tarefa += linhas.get(iteracao) + "\n";
		}
		String mensagem = "Suas tarefas: \n" + tarefa;
		
		imprimir("Digite seu email: ");
		String para = scanner.next();
		
		Carteiro.enviar(para, "Sua lista de tarefas", mensagem);
		
		imprimir("Fim!");
		
		scanner.close();
	}
	
	static void imprimir (String texto) {
		System.out.println(texto);
	}

}
