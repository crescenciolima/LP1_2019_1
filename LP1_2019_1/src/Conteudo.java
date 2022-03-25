
public class Conteudo {
	protected String nome;
	protected int ano;
	protected String genero;
	
	public Conteudo(String nome, int ano, String genero){
		this.nome = nome;
		this.ano = ano;
		this.genero = genero;
	}
	
	public Conteudo(String nome, int ano){
		this.nome = nome;
		this.ano = ano;
		this.genero = null;
	}
	
	public void imprimir(){
		System.out.println("Titulo: " + this.nome);
		System.out.println("Ano: " + this.ano);
		System.out.println("Genero: " + this.genero);
	}
	
	public void setGenero(String genero){
		this.genero = genero;
	}
}
