import java.util.Scanner;

public class GastoMensal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Double totalMes = 0.0;
		
		System.out.print("Digite o valor pago nos t�picos relacionados abaixo: ");
		
		System.out.print("Luz: R$ ");
		totalMes += scanner.nextDouble();
		
		System.out.print("�gua: R$ ");
		totalMes += scanner.nextDouble();
		
		System.out.print("Tefefone: R$ ");
		totalMes += scanner.nextDouble();
		
		System.out.print("Mensalidade Escolar: R$ ");
		totalMes += scanner.nextDouble();
		
		System.out.print("Cart�o de Cr�dito: R$ ");
		totalMes += scanner.nextDouble();
		
		System.out.print("Supermecado: R$ ");
		totalMes += scanner.nextDouble();
		
		System.out.println("O total gasto no m�s foi de R$ " + totalMes);
		
		scanner.close();
	}

}
