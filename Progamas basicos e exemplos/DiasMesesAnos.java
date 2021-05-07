package exercicios;

import java.util.Scanner;

public class DiasMesesAnos {
	
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);  
		
		//variaveis
		int anos=0;
		int meses=0;
		int dias=0;
		
		//entradas
		System.out.println("Quantos dias voce tem? ");
		dias = leia.nextInt();
		
		//processamento
		meses = (dias % 365) / 30;
		anos =  (dias / 365);
		dias = (dias % 365) % 30;

		
		//saida
		System.out.printf("Voce tem "+anos+" anos, "+meses+" meses,e "+dias+" dias de vida.");
		
	}
}
