package estruturaRepeticao;

import java.util.Scanner;

public class SetimaRep {

	public static void main(String[] args) {
		
		int funcionarios, sal;
		double totalSalarios = 0, mediasal;
		
		Scanner ler = new Scanner(System.in);

		System.out.print("Qual a quantidade de funcionários na empresa? ");
		funcionarios = ler.nextInt();
		


		for (int i = 1; i <= funcionarios; i++) {
			System.out.print("Digite o salário do funcionário " + i + ": ");
			sal = ler.nextInt();
			
			totalSalarios += sal;
		}

		mediasal = totalSalarios / funcionarios;

		System.out.println("A média salarial da empresa é: " + mediasal);

		ler.close();

	}

}
