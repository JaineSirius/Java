package AtividadeOPP;
import java.util.Scanner;

public class eletronicos2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);// instanciou o teclado
		
		eletronicos eletronicos1= new eletronicos();// instanciar
		
		//entradas
		System.out.println("Marca: ");
		eletronicos1.marca = leia.next();
		System.out.println("Modelo: ");
		eletronicos1.modelo = leia.next();
		System.out.println("Memoria interna: ");
		eletronicos1.memoriaInt = leia.next();
		System.out.println("Memoria ram: ");
		eletronicos1.ram = leia.next();
		
		System.out.println("Ficha técnica ");
		System.out.println("Marca: "+eletronicos1.marca+"\nModelo: "+eletronicos1.modelo+"\nMemoria interna: "+eletronicos1.memoriaInt+"\nMemoria ram: "+eletronicos1.ram);
	}	
}