import java.util.Locale;
import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in); //criar o teclado
        
        //jeito 1
        String nomes[] = new String[3]; //nomes[1],[2],[3]
        //jeito2
        String apostolos[] = {"LUCAS","PAULO","JOAO", "JUDAS","MATHEUS"};
        //String nome1, nome2, nome3;
        
        //jeito1
		nomes[0] = "PAULO";
		nomes[1] = "MADALENA";
		nomes[2] = "JAINE";
		
		for (int x=0; x<nomes.length; x++)
		{
			System.out.println(nomes [x]);
		}
		for (int x=0; x<apostolos.length; x++)
		{
			System.out.println(apostolos [x]);
		}
		
		
		
	}

}
