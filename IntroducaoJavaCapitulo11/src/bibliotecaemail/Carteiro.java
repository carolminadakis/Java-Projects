package bibliotecaemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Carteiro {
	
	static void enviar (String para, String assunto, String mensagem) throws EmailException {
		
	Email email = new SimpleEmail();
	email.setHostName("smtp.googlemail.com");
	email.setSmtpPort(465);
	email.setAuthenticator(new DefaultAuthenticator("caminadakis@gmail.com", "srm11061947"));
	email.setSSLOnConnect(true);
	email.setFrom("caminadakis@gmail.com");
	email.setSubject(assunto);
	email.setMsg(mensagem);
	email.addTo(para);
	email.send();
}
}

