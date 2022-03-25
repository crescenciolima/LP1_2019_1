package prova_II_unidade;

public class Produto {
	protected String descricao;
	protected double valor;
	protected int qtestoque;
	
	public Produto(String descricao, double valor, int qtestoque){
		this.descricao = descricao;
		this.valor = valor;
		this.qtestoque = qtestoque;
	}
	
	public void imprimir(){
		System.out.println("Descricao " + this.descricao);
		System.out.println("Valor: " + this.valor);
		System.out.println("Quantidade em estoque: " + this.qtestoque);
	}	
}
