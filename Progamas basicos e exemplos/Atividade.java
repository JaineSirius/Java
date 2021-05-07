import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {

		//2 - CADASTRO BASE CLIENTES LOJA
		//NOME, ANO DE  NASCIMENTO, GENERO
		//MOSTRA A IDADE DA PESSOA CADASTRADA
		//CADASTRA OUTRA PESSOA E COMPARAR PRA SABE QUEM É MAIS VELHO, MAIS NOVO OU TEM A MESMA IDADE
		//NOME, ANO NASCIMENTO, IDADE, É MAIS NOVO[A]/VELHO[A]

		Scanner leia = new Scanner (System.in);

		//variaveis
		String nome;
		//String nome2;
		int anoNasc = 0;
		//int anoNasc2 = 0;
		int idade = 2021 - anoNasc;
		//int idade2 = 2021 - anoNasc2;
		int genero = 0;
		//int genero2 = 0;
		int maiorIdade = 0;
		
		for (int x=1; x<=2; x++) 
		{
			System.out.print("Cliente "+x+"\n");
			System.out.print("Digite seu nome : \n");
			nome = leia.next();
			System.out.println("Digite seu ano de nascimento: ");
			anoNasc = leia.nextInt();
			System.out.println("Genero 1-Feminino, 2-Masculino, 3-Outros: ");
			genero = leia.nextInt();
			
		if () 
		{
			Par++;
		}
			
		else
		{
			Impar++;		
		}
			
			
		}
	}
}
