package Excesao;

public class TesteErro {

	public static void main(String[] args) {
		System.out.println("Inicio do Main");
		try{
		metodo1();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Erro: " + e);
		}
		System.out.println("Fim do Main");

	}


public static void metodo1(){
	System.out.println("Inicio do metodo 1");
	
		metodo2();
		
	System.out.println("Fim do metodo 1");
	}
	
	public static void metodo2(){
		System.out.println("Inicio do metodo 2");
		int [] matriz = new int[10];
			for (int i = 0; i < 15; i++){
				matriz[i] = i;
				System.out.println(matriz[i]);
		}
		
		System.out.println("Fim do metodo 2");
	}
	
}