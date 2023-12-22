package ecommerce.model;

public class Ecommerce2 {
    private String titular;
    private String endereco;
    private float valor;

    public Ecommerce2(String titular, String endereco, float valor) {
        super();
        this.titular = titular;
        this.endereco = endereco;
        this.valor = valor;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void pagar(float valor) {
        this.setValor(this.getValor() + valor);
    }

    public void visualizar() {
        String info = "";
        switch (this.titular) {
            case "Nome":
                info = "Nome";
                break;
            case "Endereço":
                info = "Endereço";
                break;
            
        }
        System.out.println("\n\n***********************************************************");
        System.out.println("Dados do Cliente:");
        System.out.println("***********************************************************");
        System.out.println(info + ": " + this.titular);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Valor da Compra: " + valor);
    }

	public boolean valor(float valor) {
		// TODO Auto-generated method stub
		return false;
	}
}