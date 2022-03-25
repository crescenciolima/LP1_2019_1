package prova_II_unidade;

public class Main {
	public static void main(String[] args) {
		Produto novo1 = new Produto("mouse", 10.0, 100);
		Produto novo2 = new Produto("teclado", 25.5, 200);
		Software novo3 = new Software("Avast", 12.99, 25, 12.1);
		Software novo4 = new Software("Winrar", 3.5, 120, 7.1);
		//novo1.imprimir();
		//novo2.imprimir();
		//novo3.imprimir();
		//novo4.imprimir();
		
		DBprodutos baseDados = new DBprodutos();
		baseDados.inserir(novo1);
		baseDados.inserir(novo2);
		baseDados.inserir(novo3);
		baseDados.inserir(novo4);
		baseDados.removerUltimo();
		baseDados.remover(25.5);
		baseDados.imprimirArray();
		

	}

}
