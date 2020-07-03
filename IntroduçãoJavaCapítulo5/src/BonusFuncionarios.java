import java.util.Scanner;

public class BonusFuncionarios {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a meta de faturamento de 2019: ");
		Double metaAnual = scanner.nextDouble();
		
		System.out.print("Digite o faturamento da empresa no ano de 2019: ");
		Double faturamentoEmpresa = scanner.nextDouble();
		
		// Declarando as vari�veis
		Double media80Porcento = (metaAnual * 80) /100;
		Boolean bonus100Porcento = faturamentoEmpresa >= metaAnual;
		Boolean bonus80Porcento = (faturamentoEmpresa >= media80Porcento) && (faturamentoEmpresa < metaAnual);
		Double mediaSalarial = 0.0;
		
		// Teste l�gico para analisar se o funcion�rio ir� receber bonus
		// e caso receba, qual ser� o valor.
		
		if (bonus100Porcento) {
	
			System.out.print("Digite a m�dia salarial do funcion�rio(a) no ano de 2019: ");
			mediaSalarial = scanner.nextDouble();
			
			// Informando valor de bonus a ser pago
			System.out.println("O funcion�rio receber� de bonus, "
					+ "o valor referente a m�dia salarial de 2019."
					+ " R$ " + mediaSalarial);
			
		} else if (bonus80Porcento) { 
			System.out.print("Digite a m�dia salarial do funcion�rio(a) no ano de 2019: ");
			mediaSalarial = scanner.nextDouble();
			// Calculando bonus de 80%.
			Double media80PorcentoSalarial = (mediaSalarial * 80) / 100;
			
			// Informando valor de bonus a ser pago.
			System.out.println("O funcion�rio receber� de bonus, "
					+ "80% do valor referente a m�dia salarial de 2019."
					+ " R$ " + media80PorcentoSalarial);
			
		} else {
			// Caso a empresa n�o fature o m�nimo necess�rio de 80% da meta
			// os funcion�rios n�o receber�o bonus.
			System.out.println("O funcion�rio n�o receber� bonus.");
		}
			
	
		scanner.close();

	}

}
