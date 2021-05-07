package exercicios;

import java.util.Scanner;

public class IdadeDias {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);  
		
		//variaveis
		int anos=0;
		int meses=0;
		int dias=0;
		int totaldias;
		
		//entradas
		System.out.println("Quantos anos voce tem? ");
		anos = leia.nextInt();
		System.out.println("Quantos meses? ");
		meses = leia.nextInt();
		System.out.println("Quantos dias? ");
		dias = leia.nextInt();
		
		//processamento
		totaldias = ((anos * 365)+(meses * 30)+ dias);
		
		//saida
		System.out.printf("Voce tem "+totaldias+" dias de vida.");
		

	}

}
