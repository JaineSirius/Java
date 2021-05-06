package Entidades;

public  abstract  class  Produtos
{
		
		// atributos
	
		private  String descricao;
		private String codigo  ;
		private double valorUnidade ;
		private  int estoque =  0 ;
	

		
		// construtor
		
		public Produtos ( String  codigo , String  descricao , double  valorUnidade , int  estoque )
		{
			super ();
			this.descricao = descricao;
			this.valorUnidade= valorUnidade;		
			this.estoque = estoque;
		//
		}
		
		public  String  getDescricao () {
			return descricao;
		}
		public  void  setDescricao ( String  descricao ) {
			this.descricao = descricao;
		}
		public  String  getCodigo () {
			return codigo;
		}
	
		public  double  getValorUnidade () {
			return valorUnidade;
		}
		public  void  setValorUnidade ( double  valorUnidade ) {
			this.valorUnidade = valorUnidade;
		}
		public  int  getEstoque () {
			return estoque;
		}
		
		//
		
		public  void  addEstoque ( int  addEstoque )
		{
			this.estoque =  this.estoque + addEstoque;
		}
		
		public  void  tiraEstoque ( int  tiraEstoque )
		{
			if ( this.estoque >= tiraEstoque)
			{
				this.estoque =  this.estoque - tiraEstoque;
				
			}
			
			else 
			{
				System.out.println( " Sem estoque disponível. " );
			}
		}
}
