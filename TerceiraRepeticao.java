package estruturaRepeticao;

import java.util.Scanner;

public class TerceiraRepeticao {

	public static void main(String[] args) {
		int inicio, fim;

		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o número inicial: ");
		inicio = ler.nextInt();
		
		System.out.println("Informe o número final: ");
	    fim = ler.nextInt();

		for(int i = inicio; i<=fim ; i++) {
			if (i%2 == 1) {
				System.out.println("O número é ímpar " +i);
			}
			else {
				System.out.println("O número é par");
			}
		}
		ler.close();




	}

}
