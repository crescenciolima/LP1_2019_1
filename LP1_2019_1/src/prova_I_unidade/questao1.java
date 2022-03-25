package prova_I_unidade;

import java.util.Scanner;

public class questao1 {
	public static void main(String[] args){
		questao1_dados teste = new questao1_dados();
		Scanner ent = new Scanner(System.in);
		int resposta = 1;
		while(resposta == 1){
			System.out.println("Digite 1-fem e 2-mas");
			int sexo = ent.nextInt();
			teste.verificaSexo(sexo);
			System.out.println("Outro 1-sim e 2-nao");
			resposta = ent.nextInt();
		}
		teste.imprimir();
	}
}
