import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);  

	// Faça um programa que entre com três números e coloque em ordem crescente.
	
	//variaveis
	int numero1=0;
	int numero2=0;
	int numero3=0;
	
	//entradas
	System.out.println("Digite o primeiro numero: ");
		numero1 = leia.nextInt();
	System.out.println("Digite o segundo numero: ");
		numero2 = leia.nextInt();
	System.out.println("Digite o terceiro numero: ");
		numero3 = leia.nextInt();

	//saidas
		// verificando primeiro numero
		if (numero1 >= numero2 && numero1 >= numero3) {
			System.out.println(numero1);
		}
		else  if (numero2 >= numero1 && numero2 >= numero3) {
			System.out.println(numero2);
		}
		else  if (numero3 >= numero1 && numero3 >= numero2) {
			System.out.println(numero3);
		}
	}

}
