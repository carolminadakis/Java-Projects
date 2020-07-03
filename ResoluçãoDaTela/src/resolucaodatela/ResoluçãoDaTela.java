package resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResoluçãoDaTela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit tela = Toolkit.getDefaultToolkit();
		Dimension d = tela.getScreenSize();
		System.out.print("A resolução da tela é: ");
		System.out.println(d.width + "x" + d.height);
		

	}

}
