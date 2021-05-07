package AtividadeOPP;
import java.util.Scanner;

public class aviao2 {
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);// instanciou o teclado
		
		Aviao  aviao1= new Aviao();// instanciar
		
		//entradas
		System.out.println("Modelo da aeronave: ");
		aviao1.modelo = leia.next();
		System.out.println("Quantidade de assentos: ");
		aviao1.assentos = leia.nextInt();
		System.out.println("Comprimento: ");
		aviao1.comprimento = leia.nextDouble();
		System.out.println("Largura: ");
		aviao1.largura =leia.nextDouble();
		System.out.println("Altura: ");
		aviao1.altura = leia.nextDouble();
		System.out.println("Combustivel maximo: ");
		aviao1.combustivelMax = leia.nextDouble();
		
		System.out.printf("\nFicha técnica ");
		System.out.printf("\nModelo: %s", aviao1.modelo + "\nQuantidade de assentos: " + aviao1.assentos+ "\nComprimento: "+ aviao1.comprimento +"\nLargura: " +aviao1.altura+"\nAltura: "+aviao1.altura+"\nCombustivel maximo: "+aviao1.combustivelMax);
				
	}

}
