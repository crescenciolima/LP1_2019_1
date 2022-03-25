
public class Filme extends Conteudo{
	private String diretor;
	
	public Filme(String nome, int ano, String genero, String diretor){
		super(nome, ano, genero);
		this.diretor = diretor;
	}
	
	public void imprimir(){
		super.imprimir();
		System.out.println("Diretor: " + this.diretor);
	}
}
