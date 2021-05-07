import java.util.Scanner;
import java.util.Locale; 

public class ExemploPara {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner leia = new Scanner(System.in);
	
	//variaveis
	final double HABITANTES = 3;
	double salario = 0.00;
	double filhos = 0;
	double mediaSalario = 0.00;
	double mediaFilhos = 0.00;
	double totalFilhos = 0.00;
	double maiorSalario = 0.00;
	double percentualSalarioAte100 = 0.00;
	double contadorPessoasSalario100 = 0;
	double totalSalario = 0.00;
	
	//%s = string
	//%d = int
	//%D= double
	
	for (int x=1; x<=HABITANTES; x++) {
		System.out.print("Informe o salario: ");
		salario = leia.nextDouble();
		System.out.print("Informe a quantidade de filhos: ");
		filhos = leia.nextDouble();
		totalSalario = totalSalario + salario;
	}
		
		//fora do laço
		mediaSalario = totalSalario / HABITANTES;
		
		//saidas
		System.out.printf("\nTotal dos salarios R$ %.2f", totalSalario);
		System.out.printf("\nMédia salarios R$ %2.f", mediaSalario);

	}

}
