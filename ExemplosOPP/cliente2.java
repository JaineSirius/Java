package AtividadeOPP;

import java.util.Scanner;

import AtividadeOPP.clientes;

public class cliente2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);// instanciou o teclado
		
		clientes  cliente1= new clientes();// instanciar
		
		//entradas
		
		//emails
		System.out.println("Digite seu email: ");
		cliente1.email = leia.next();
		
		//nomes
		System.out.println("Digite seu nome: ");
		cliente1.nome = leia.next();
		
		//cpf
		System.out.println("Digite seu cpf: ");
		cliente1.cpf = leia.next();
		
		//data
		System.out.println("Digite seu ano de nascimento:");
		cliente1.dataNasc = leia.nextInt();
		
		System.out.printf("\nDados do cliente ");
		System.out.println("\nEmail: "+ cliente1.email +"\nNome: "+cliente1.nome+"\nCPF: "+cliente1.cpf+"\nAno nascimento: "+cliente1.dataNasc);
		
		
	} 

}
