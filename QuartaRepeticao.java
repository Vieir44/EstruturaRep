package estruturaRepeticao;

import java.util.Scanner;

public class QuartaRepeticao {

	public static void main(String[] args) {
		double valor, media ,soma = 0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int i=1; i<=5; i++) {
			System.out.println("Informe um número: ");
			valor = ler.nextInt();
			soma += valor;
		}
		media = soma/5;
		System.out.println("A soma dos valores é "+ soma +" e a media dos valores é "+ media);

	}

}
