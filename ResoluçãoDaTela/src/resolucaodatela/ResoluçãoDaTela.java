package resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Resolu��oDaTela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit tela = Toolkit.getDefaultToolkit();
		Dimension d = tela.getScreenSize();
		System.out.print("A resolu��o da tela �: ");
		System.out.println(d.width + "x" + d.height);
		

	}

}
