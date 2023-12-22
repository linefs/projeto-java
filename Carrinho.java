package ecommerce.model;

public class Carrinho extends Ecommerce2 {
	
	private float compra;

	public Carrinho(String titular, String endereco, float valor, float compra) {
		super(titular, endereco, valor);
		this.compra = compra;
		
	}

	public float getCompra() {
		return compra;
	}

	public void setCompra(float compra) {
		this.compra = compra;
	}

	public boolean adicionarValor(float valor) { 
		   if (this.getValor() + this.getCompra() >= valor) {
		      this.setValor(this.getValor() + valor);
		      return true;
		   } else {
		      System.out.println("\n Saldo Insuficiente!");
		      return false;
}
}
}