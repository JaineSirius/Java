import java.util.Scanner;

public class SomaNumAteZeroDoWhile {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		
		//variaveis
		int numero = 0;
		int resultado = numero+numero;
		
		//entradas
		System.out.println("Insira um n�mero: ");
		numero = leia.nextInt();
		//la�os
		do
		{
			System.out.println("Insira outro n�mero: ");
			numero = leia.nextInt();
		}
		//condi�ao
		while (numero > 0);
		
			System.out.println(resultado);
	}

}
