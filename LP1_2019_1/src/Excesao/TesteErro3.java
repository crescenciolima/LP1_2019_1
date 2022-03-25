package Excesao;

public class TesteErro3 {
	
	public static void aumentarLetras() throws NullPointerException{
		String frase = null;
		String novaFrase = null;
		novaFrase = frase.toUpperCase();
		System.out.println("Frase antiga: " + frase);
		System.out.println("Nova frase: " + novaFrase);
	}
	
	public static void main(String[] args) {
		try{
			aumentarLetras();
		}catch(NullPointerException e){
			System.out.println("Erro: " + e);
		}
	}
}
