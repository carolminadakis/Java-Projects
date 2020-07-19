package bibliotecaemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class UsandoBibliotecaDeEmail {

	public static void main(String[] args) throws EmailException {
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.googlemail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("caminadakis@gmail.com", "srm11061947"));
		email.setSSLOnConnect(true);
		email.setFrom("caminadakis@gmail.com");
		email.setSubject("Teste de envio de email");
		email.setMsg("Esta é uma mensagem teste, enviada diretamente do Eclipse.");
		email.addTo("acminadakis@gmail.com");
		email.send();
	}

}
