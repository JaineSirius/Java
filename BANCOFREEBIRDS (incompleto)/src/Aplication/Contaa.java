package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entity.Conta;
import sun.util.resources.ext.LocaleNames_zh;

public class Contaa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);// instanciou o teclado
		
		Conta cont1 = new Conta();// instanciar
		
		System.out.println("CONTA: ");
		cont1.numero = leia.nextInt();
		System.out.println("CPF: ");
		cont1.cpf = leia.next();
		System.out.println("SALDO: ");
		cont1.saldo = leia.nextDouble();
		System.out.println("CONTA 1-DEBITO/2-CREDITO");
		cont1.opcao = leia.next().charAt(0);
		
		//if (cont1.opcao == '1')
		//{
			//cont1.credito(valor)
		//}
		
		System.out.printf("CPF: %s\n",cont1.cpf);
		
		
	}

}
