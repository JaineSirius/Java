package exercicios;

import java.util.Scanner;

public class Evento {
	
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);  
		
		//variaveis
		double segundos=0;
		double minutos=0;
		double horas=0;
		
		//entradas
		System.out.println("Quantos segundos durou seu evento? ");
		segundos = leia.nextDouble();
		
		//processamento
		minutos = (segundos / 60);
		horas = (segundos / 3600);


		
		//saida
		System.out.printf("Seu evento durou "+segundos+" segundos, "+minutos+" minutos,e "+horas+" horas.");
		
	}
}



