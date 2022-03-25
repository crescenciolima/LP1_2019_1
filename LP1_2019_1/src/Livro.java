
public class Livro {
	private int anoPublicacao;
	private String titulo;
	
	void definirValores(int ano, String title){
		anoPublicacao = ano;
		titulo = title;
	}
	
	void imprimirLivro(){
		System.out.println("Nome do livro: " + titulo);
		System.out.println("Ano Publicacao: " + anoPublicacao);
	}
}
