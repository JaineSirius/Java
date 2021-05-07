
import java.util.Locale;
import java.util.Scanner;

public class exemploedpara {

    public static void main(String[] args) {

        /*
         * PARA
        1- A prefeitura de uma cidade fez uma pesquisa 
        entre 20 de seus habitantes, coletando dados sobre o 
        sal�rio e n�mero de filhos. A prefeitura deseja saber:
        a) m�dia do sal�rio da popula��o; 
        b) m�dia do n�mero de filhos; 
        c) maior sal�rio; 
        d) percentual de pessoas com sal�rio at� R$100,00.
         */
        //[para - enquanto] - fa�a enquanto - final
      
    	 Locale.setDefault(Locale.US);
         Scanner leia = new Scanner(System.in);
         
        //variaveis
        final double HABITANTES = 3;
        double salario =0.00;
        double numeroFilhos=0.00; 
        double mediaSalario=0.00;
        double totalSalario=0.00; //dentro do la�o
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
            //dentro do la�o
            System.out.printf("Informe o sal�rio do habitante %d R$ :",x);
            salario = leia.nextDouble();
            System.out.print("Informe a quantidade de filhos: ");
            numeroFilhos = leia.nextDouble();
            System.out.println();
            totalSalario = totalSalario + salario; // totalSalario += Salario
            totalFilhos = totalFilhos + numeroFilhos;

        }
        //fora do la�o
        //salarios
        mediaSalario = totalSalario /  HABITANTES ;
        System.out.printf("\nTotal dos salarios R$ %.2f",totalSalario);
        System.out.printf("\nM�dia salarios: R$ %.2f", mediaSalario);
        
        //filhos
        mediaFilhos = totalFilhos / HABITANTES;
        System.out.printf("\nTotal dos filhos R$ %.2f",totalFilhos);
        System.out.printf("\nM�dia filhos: R$ %.2f", mediaFilhos);
        
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