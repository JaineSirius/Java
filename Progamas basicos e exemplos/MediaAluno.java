package exercicios;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		
			Scanner leia = new Scanner(System.in);  
			
			//variaveis
			double nota1=0;
			double nota2=0;
			double nota3=0;
			double media=0;
			
			//entradas
			System.out.println("Nota 1 :");
			nota1 = leia.nextDouble();
			System.out.println("Nota 2 :");
			nota2 = leia.nextDouble();
			System.out.println("Nota 3 :");
			nota1 = leia.nextDouble();
			
			//processamento
			media =  ((nota1 * 2)+(nota2 * 3)+(nota3 * 5))/10 ;
			
			//saida
			System.out.printf("Sua média é "+media);
			
	

	
	}

}
