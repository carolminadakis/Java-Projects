import java.util.Scanner;

public class BonusFuncionarios {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a meta de faturamento de 2019: ");
		Double metaAnual = scanner.nextDouble();
		
		System.out.print("Digite o faturamento da empresa no ano de 2019: ");
		Double faturamentoEmpresa = scanner.nextDouble();
		
		// Declarando as variáveis
		Double media80Porcento = (metaAnual * 80) /100;
		Boolean bonus100Porcento = faturamentoEmpresa >= metaAnual;
		Boolean bonus80Porcento = (faturamentoEmpresa >= media80Porcento) && (faturamentoEmpresa < metaAnual);
		Double mediaSalarial = 0.0;
		
		// Teste lógico para analisar se o funcionário irá receber bonus
		// e caso receba, qual será o valor.
		
		if (bonus100Porcento) {
	
			System.out.print("Digite a média salarial do funcionário(a) no ano de 2019: ");
			mediaSalarial = scanner.nextDouble();
			
			// Informando valor de bonus a ser pago
			System.out.println("O funcionário receberá de bonus, "
					+ "o valor referente a média salarial de 2019."
					+ " R$ " + mediaSalarial);
			
		} else if (bonus80Porcento) { 
			System.out.print("Digite a média salarial do funcionário(a) no ano de 2019: ");
			mediaSalarial = scanner.nextDouble();
			// Calculando bonus de 80%.
			Double media80PorcentoSalarial = (mediaSalarial * 80) / 100;
			
			// Informando valor de bonus a ser pago.
			System.out.println("O funcionário receberá de bonus, "
					+ "80% do valor referente a média salarial de 2019."
					+ " R$ " + media80PorcentoSalarial);
			
		} else {
			// Caso a empresa não fature o mínimo necessário de 80% da meta
			// os funcionários não receberão bonus.
			System.out.println("O funcionário não receberá bonus.");
		}
			
	
		scanner.close();

	}

}
