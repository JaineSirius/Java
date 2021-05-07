package Entity;

public class Conta 
{
	//THIS
	//inicio
	//atributos
	public int numero;
	public String cpf;
	public double saldo;
	public boolean ativa;
	public char opcao;
	
	//metodos
	public void debito(double valor)
	{
		saldo = saldo - valor;
	}
	
	public void credito(double valor)
	{
		saldo = saldo + valor;
	}

}
