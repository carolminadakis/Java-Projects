
public class Aluno {
	
	String nome;
	
	boolean vemDepois (Aluno aluno) {
		if(aluno == null) {
			return false;
		} 
		return nome.compareTo(aluno.nome) > 0;

		}
}
