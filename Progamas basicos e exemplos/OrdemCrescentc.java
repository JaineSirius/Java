package Exercicios0504;

import java.util.Scanner;

public class OrdemCrescentc {

	public static void main(String[] args) {
				
			Scanner leia = new Scanner(System.in);  

			// Faça um programa que entre com três números e coloque em ordem crescente.
			
			//variaveis
			int n1=0;
			int n2=0;
			int n3=0;
			
			//entradas
			System.out.println("Digite o primeiro numero: ");
				n1 = leia.nextInt();
			System.out.println("Digite o segundo numero: ");
				n2 = leia.nextInt();
			System.out.println("Digite o terceiro numero: ");
				n3 = leia.nextInt();

			//saidas
				if (n1 < n2) {
					if (n2 < n3) 
					{
						System.out.println(n1 +"\n" + n2 +"\n" + n3);
					}
					else  if (n1 < n3)
					{
						System.out.println(n1  +"\n"+ n3+ "\n" + n2);
					}
					else 
					{
						System.out.println(n3  +"\n"+ n1+"\n"+ n2);
					}
				}
				else  if (n2 < n3) {
					if (n1 < n3)
					{
						System.out.println(n2 +  n1 +  n3);
					}
					else 
					{
						System.out.println(n1 + n2 + n3);
					}
				}
					else
					{
						System.out.println(n3 +  n2 + n1);
				
					}


	}

}
