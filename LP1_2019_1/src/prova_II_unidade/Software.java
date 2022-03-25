package prova_II_unidade;

public class Software extends Produto{
	private double versao;
	
	public Software(String descricao, double valor, int qtestoque, double versao){
		super(descricao, valor, qtestoque);
		this.versao = versao;
	}

	public void imprimir(){
		super.imprimir();
		System.out.println("Versao: " + this.versao);
	}
}
