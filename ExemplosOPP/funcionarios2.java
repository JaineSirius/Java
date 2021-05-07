package AtividadeOPP;
import java.util.Scanner;

public class funcionarios2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);// instanciou o teclado
		
		funcionarios funcionarios1= new funcionarios();// instanciar
		
		//entradas
		System.out.println("Nome: ");
		funcionarios1.nome = leia.next();
		System.out.println("cpf: ");
		funcionarios1.cpf = leia.next();
		System.out.println("Ano de nascimentos: ");
		funcionarios1.anoNasc = leia.next();
		System.out.println("Cargo: ");
		funcionarios1.cargo = leia.next();
		
		System.out.println("Funcionario 1 ");
		System.out.println("Nome: "+funcionarios1.nome+"\nModelo: "+funcionarios1.cpf+"\nAno de nascimento: "+funcionarios1.anoNasc+"\nCargo: "+funcionarios1.cargo);

	}

}
