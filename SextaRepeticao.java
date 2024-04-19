package estruturaRepeticao;

import java.util.Scanner;

public class SextaRepeticao {

	public static void main(String[] args) {
		
		int numero;
		
		int fatorar = 1;
    
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = ler.nextInt();
		
			for (int i = 1; i <= numero; i++) {
				fatorar *= i;
				
			}

			
		  System.out.println("O fatorial de é " + numero + " é: " + fatorar);
		  
		  ler.close();
	}

}
