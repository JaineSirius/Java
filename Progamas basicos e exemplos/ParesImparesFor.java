import java.util.Locale;
import java.util.Scanner;

public class ParesImparesFor {
	
	public static void main(String[] args)
	{
		Scanner leia = new Scanner (System.in);
		
		//variaveis
		double numero = 0, Par = 0, Impar = 0;
	
		//entradas e condi�oes
		for (int x=1; x<=10; x++) 
		{
			System.out.print("Digite o "+x+" n�mero: \n");
			numero = leia.nextDouble();
			
			if (numero%2==0) 
			{
				Par++;
			}
			
			else
			{
				Impar++;		
			}
			
		}
		
		//saidas
		System.out.print("Foram digitados "+Par+" n�meros pares\n");
		System.out.print("Foram digitados "+Impar+" n�meros �mpares");
        
	}

}
