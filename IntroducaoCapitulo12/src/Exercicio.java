import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Exercicio {

	public static void main(String[] args) throws IOException, EmailException {
		Path arquivo = Paths.get("C:\\Users\\carol\\OneDrive\\Documentos\\ExercícioCap12.txt");
		
		List<String> nomes = Files.readAllLines(arquivo);
		
		ListaAlunos listaAlunos = new ListaAlunos();
		
		for (int i = 0; i < nomes.size(); i++) {
			String nome = nomes.get(i);
			Aluno aluno = new Aluno();
			
			aluno.nome = nome;
			listaAlunos.adicionar(aluno);
		}
		
		listaAlunos.ordenar();
		
		String mensagem = "Os alunos são: \n";
		
		for (int i = 0; i < listaAlunos.tamanho(); i++) {
			Aluno aluno = listaAlunos.obter(i);
			mensagem += aluno.nome + "\n";
		}
		
		enviarEmail ("carol@gmail.com", "Lista alunos", mensagem);
		
		System.out.println("E-mail enviado!");
	}
	
	static void enviarEmail (String para, String assunto, String mensagem) throws EmailException {
		Email email  = new SimpleEmail();
		
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("ca@gmail.com", "senha"));
		email.setSSLOnConnect(true);
		email.setFrom("ca@gmail.com");
		email.setSubject(assunto);
		email.setMsg("Os alunos são: " + mensagem);
		email.addTo(para);
		
		email.send();
	}

}
