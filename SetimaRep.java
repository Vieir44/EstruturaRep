package estruturaRepeticao;

import java.util.Scanner;

public class SetimaRep {

	public static void main(String[] args) {
		
		int funcionarios, salario;
		double totalSalarios = 0;
		
		Scanner ler = new Scanner(System.in);

		System.out.print("Qual a quantidade de funcionários na empresa? ");
		funcionarios = ler.nextInt();
		


		for (int i = 1; i <= funcionarios; i++) {
			System.out.print("Digite o salário do funcionário " + i + ": ");
			salario = ler.nextInt();
			
			totalSalarios += salario;
		}

		double mediaSalarial = totalSalarios / funcionarios;

		System.out.println("A média salarial da empresa é: " + mediaSalarial);

		ler.close();

	}

}
