/**
 * 
 */
package idiomadosistema;

import java.util.Locale;

/**
 * @author carol
 * Programa mostra qual � o idioma do sistema.
 */
public class IdiomaDoSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale loc = Locale.getDefault();
		System.out.print("O idioma do meu sistema �: ");
		System.out.println(loc.getDisplayLanguage());

	}

}
