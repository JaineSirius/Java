
import java.util.Scanner;


public class Categoria {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);  
		
		//10-14 infantil
		//15-17 juvenil
		//18-25 adulto
		
		//variaveis
		int idade=0;
		
		//entradas
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		
		if (idade >=  10  && idade <=  14 ) {
			System.out.println ( " Voce esta na classe Infantil! " );
		}
		else  if (idade >=  15  && idade <=  17 ) {
			System.out.println ( " Voce esta na classe Juvenil! " );
		}
		else  if (idade >=  18  && idade >= 25 ) {
			System.out.println ( " Voce esta na classe Adulto " );
		}
		else {
			System.out.println( " Não se encaixa em nenhuma categoria. " );
		}
		

	}

}


