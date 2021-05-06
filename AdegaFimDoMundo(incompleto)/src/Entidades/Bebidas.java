package Entidades;

public class Bebidas extends Produtos{

		private  String marca;

		public  Bebidas ( String  codigo , String  descricao , double  valorUnidade , int  estoque , String  marca ) {
			super (codigo, descricao, valorUnidade, estoque);
			this.marca = marca;
		}

		public  String  getMarca () {
			return marca;
		}

		public  void  setMarca ( String  marca ) {
			this.marca = marca;
		}
}
