
import java.util.Locale;
import java.util.Scanner;

public class exemploedpara {

    public static void main(String[] args) {

        /*
         * PARA
        1- A prefeitura de uma cidade fez uma pesquisa 
        entre 20 de seus habitantes, coletando dados sobre o 
        salário e número de filhos. A prefeitura deseja saber:
        a) média do salário da população; 
        b) média do número de filhos; 
        c) maior salário; 
        d) percentual de pessoas com salário até R$100,00.
         */
        //[para - enquanto] - faça enquanto - final
      
    	 Locale.setDefault(Locale.US);
         Scanner leia = new Scanner(System.in);
         
        //variaveis
        final double HABITANTES = 3;
        double salario =0.00;
        double numeroFilhos=0.00; 
        double mediaSalario=0.00;
        double totalSalario=0.00; //dentro do laço
        double mediaFilhos=0.00;
        double totalFilhos=0.00;
        double maiorSalario=0.00; 
        double percentualPessoasSalarioAte100= 0.00;
        double contadorPessoasSalario100 = 0.00;
        
        //x++ = x = x + 1
        
        //%s = String
        //%d= int
        //%f= double
        
        for (int x=1;x<=HABITANTES;x++) {
            //dentro do laço
            System.out.printf("Informe o salário do habitante %d R$ :",x);
            salario = leia.nextDouble();
            System.out.print("Informe a quantidade de filhos: ");
            numeroFilhos = leia.nextDouble();
            System.out.println();
            totalSalario = totalSalario + salario; // totalSalario += Salario
            totalFilhos = totalFilhos + numeroFilhos;

        }
        //fora do laço
        //salarios
        mediaSalario = totalSalario /  HABITANTES ;
        System.out.printf("\nTotal dos salarios R$ %.2f",totalSalario);
        System.out.printf("\nMédia salarios: R$ %.2f", mediaSalario);
        
        //filhos
        mediaFilhos = totalFilhos / HABITANTES;
        System.out.printf("\nTotal dos filhos R$ %.2f",totalFilhos);
        System.out.printf("\nMédia filhos: R$ %.2f", mediaFilhos);
        
        if(maiorSalario > salario)
		{
			maiorSalario = salario;
		}
		if(salario <= 100)
		{
			percentualPessoasSalarioAte100++;
		}
		
		System.out.printf("\nMaior salarios: R$ %.2f",maiorSalario);
		percentualPessoasSalarioAte100 = (contadorPessoasSalario100 / HABITANTES)*100.00;
        System.out.printf("\nPercentual de salarios ate 100: R$ %.2f", percentualPessoasSalarioAte100);
		
        
        
        
        //fim
    }

}