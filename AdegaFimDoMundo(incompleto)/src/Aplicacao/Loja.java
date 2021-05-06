package Aplicacao;

import  java.util. * ;

import Entidades.Bebidas;


public  class  Loja 
{

	public  static  void  main ( String [] args )
	{
		
		Bebidas bebidas;
		int opcao;
		int x;
		int quantidade;
		
		
		Locale . setDefault ( Locale . US );
		Scanner leia =  new  Scanner ( System.in );
		List  < Bebidas > lista =  new  ArrayList <> ();
		List < Bebidas > carrinho =  new  ArrayList <> ();
		
		lista. add (bebidas =  new  Bebidas ( " 93383 " , " Vinho " , 10.00 , 10 , "" ));
		lista. add (bebidas =  new  Bebidas ( " 6540155 " , " Ceveja lata " , 3.50 , 10 , "" ));
		lista. add (bebidas =  new  Bebidas ( " 453456 " , " Whisky " , 99.99 , 10 , "" ));
		lista. add (bebidas=  new  Bebidas ( " 35454 " , " Energetico " , 20.00 , 10 , "" ));
		lista. add (bebidas =  new  Bebidas ( " D00158 " , "Vodka " , 30.00 , 10 , "" ));

		boolean confirma [] =  new boolean [lista.size()];
		for (x =  0 ; x<confirma.length;x++ )
		{
			confirma [x] = true ;
		}
		
		do{	
				System.out.println("Adega fim do mundo");
				System.out.println( " \n Produtos \n " );
				for  (x = 0; x<lista.size(); x++ )
				{
					System.out.printf( " %d - %s \n " , x+1, lista.get(x).getDescricao());
				}
				System.out.printf( " %d - Carrinho \n " , x + 1 );
				System.out.printf( " %d - Sair \n " , x + 2 );
				System.out.printf( " \n Selecione um produto: " );
				opcao = leia.nextInt ();
				
				if (opcao < lista.size() && opcao >=  0 )
				{
					if (confirma [opcao] ==  true )
					{
						if (lista . get (opcao) . getEstoque () > 0 )
						{
							System.out.printf( " Descrição: %s %s | Unidade de Valor: R$ %2f | Disponível em estoque: %d \n " , lista . get (opcao) . getDescricao (), lista . get (opcao) . getMarca () , lista . get (opcao) . getValorUnidade (), lista . get (opcao) . getEstoque ());
							System.out.printf( " \n Quantidade: " );
							quantidade = leia.nextInt ();
							
							 if (quantidade <= lista . get (opcao) . getEstoque () && quantidade >= 0 )
							 {
								 lista . get (opcao) . tiraEstoque (quantidade);
								 carrinho . add (bebidas =  new  Bebidas (lista . get (opcao) . getCodigo (), lista . get (opcao) . getDescricao (), lista . get (opcao) . getValorUnidade (), quantidade, lista . get (opcao) . getMarca ()));
								
								 if (quantidade >  0 )
								 {
									confirma [opcao] =  false ;
								 }
							 }
								 else  if (quantidade > lista . get (opcao) . getEstoque ())
								 {
									 System.out.println( " \n Quantidade não disponível em estoque. \n " );
								 }
								 else
								 {
									 System.out.println( " \n Opção inválida. " );
								 }
						}
						else {
							System.out.println(" fora de estoque " );
						}
						}	 
					else
					{
						System.out.println( " Finalize seu carrinho antes de voltar a comprar este item. " );
					}
				}
					
				else  if (opcao == x)
				{
					if (carrinho . size () == 0 )
					{
						System.out.println( " O carrinho esta vazio \n Redirecionado para menu pricipal \n " );
					}
					else
					{
						System.out.println( " Carrinho " );
						Entidades.Loja Loja =  new  Entidades.Loja ( " Adega fim do mundo " , " CNPJ: 0000.0000.0000-1 " );
						Loja.emitirNota (carrinho);
						carrinho.clear();
		
						for (x =  0 ; x < confirma.length; x ++ )
						{
							confirma [x] = true ;
						}
					}
						
				}
				else  if (opcao == (x + 1 ))
				{
					System.out.println( " Fim do programa " );
				}
		
				else 
				{
					System.out.println( " \n Opção inválida. Tente outra opção. " );
				}
		  } while (opcao != (lista . size () + 1 ));
	}
		
	public  static  void  limpa ()
	{
		for ( int y =  0 ; y <= 10 ; y ++ )
		{
			System.out.println();
		}
	}
}