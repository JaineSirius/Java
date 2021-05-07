import java.util.Scanner;

public class SomaNumAteZeroDoWhile {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		
		//variaveis
		int numero = 0;
		int resultado = numero+numero;
		
		//entradas
		System.out.println("Insira um número: ");
		numero = leia.nextInt();
		//laços
		do
		{
			System.out.println("Insira outro número: ");
			numero = leia.nextInt();
		}
		//condiçao
		while (numero > 0);
		
			System.out.println(resultado);
	}

}
