package prova_II_unidade;

public class DBprodutos{
	private Produto[] estoqueprodutos;
	private int indice;
	private final static int MAX = 10;
	
	public DBprodutos(){
		this.indice = 0;
		estoqueprodutos = new Produto[MAX];
	}
	
	public void inserir(Produto p){
		if(this.indice < MAX){
			estoqueprodutos[indice] = p;
			indice++;
		}
		else{
			System.out.println("Limite do array ultrapassado");
		}
	}
	
	public void imprimirArray(){
		for(int i = 0; i < indice; i++){
			estoqueprodutos[i].imprimir();
			System.out.println("-------");
		}
	}
	
	public void removerUltimo(){
		estoqueprodutos[indice] = null;
		indice--;
	}
	
	public void remover(double valor){
		for(int i=0; i < indice; i++){
			if(estoqueprodutos[i].valor == valor){
				estoqueprodutos[i] = estoqueprodutos[indice-1];
				estoqueprodutos[indice-1] = null;
				indice--;
			}
		}
	}
	

}
