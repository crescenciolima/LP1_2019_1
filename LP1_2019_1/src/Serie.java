
public class Serie extends Conteudo{
	private int quant_episodios;
	
	public Serie(String nome, int ano, String genero, int episodios){
		super(nome, ano, genero);
		this.quant_episodios = episodios;	
	}

		public void imprimir(){
			super.imprimir();
			System.out.println("Quantidade de Episodios: " + this.quant_episodios);
		}
}
