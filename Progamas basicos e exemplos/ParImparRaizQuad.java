import  java.util.Scanner ;

public class ParImparRaizQuad {

		public  static  void  main ( String [] args ) {
			
			Scanner leia = new Scanner(System.in); 
			int numero;
			
			System.out.println ( " Escreva um n�mero positivo: " );
			numero = leia.nextInt ();
			
			if (numero <= 0 ) {
				System.out.println( " N�mero igual a 0 ou negativo! " );
			}
			else  if (numero %  2  ==  0 ) {
				System.out.println( " O n�mero � par " );
				
				System.out.println( " E a raiz quadrada do n�mero �: " + Math . sqrt (numero));	
			}
			else {
				System.out.println( " O n�mero � �mpar e ele ao quadrado: " + Math . pow (numero,2 ));
				 	
				}
			}
		}



