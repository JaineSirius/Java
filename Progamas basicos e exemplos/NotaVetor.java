import java.util.Locale;
import java.util.Scanner;

public class NotaVetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in); //criar o teclado

        // 4 pessoas - nome - vetor
        // 4 nota [inteiro entre 1-10] - vetor
     	// nome - nota - ate 5 > ainda não/acima de de 5 > muito bem
        
        String nomes[] = new String[4]; //tamnho
        int notas[] = new int[4];
        
        for (int x=0; x<nomes.length; x++)
		{
			System.out.printf("Digite o nome do aluno %d: ",x+1);
			nomes[x] = leia.next();
			System.out.print("Digite a nota do aluno: ");
			notas[x] = leia.nextInt();
		}
        
		for (int x=0; x<notas.length; x++)
			{
				if (notas[x] <=5)
				{
					System.out.printf("%s Sua nota é %d - ainda não!\n", nomes[x]	, notas [x]);
				}
				if  (notas[x] >5)
				{
					System.out.printf("%s Sua nota é %d - Muito bem!\n", nomes[x]	, notas [x]);
				}
		}
      
        
        
        

        
        
	}

}
