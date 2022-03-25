package Excesao;

public class TesteErro2 {

	public static void main(String[] args) {
		String frase = null;
		String novaFrase = null;
		try{
			novaFrase = frase.toUpperCase();
		}catch(NullPointerException e){
			System.out.println("Erro: " + e);
			frase = "Frase vazia";
		}finally{
			novaFrase = frase.toUpperCase();
		}
		
		System.out.println("Frase antiga: " + frase);
		System.out.println("Nova frase: " + novaFrase);

	}

}
