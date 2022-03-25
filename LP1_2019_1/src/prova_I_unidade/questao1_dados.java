package prova_I_unidade;

public class questao1_dados {
	public int contMulheres = 0, assinantes = 0;
	
	public void verificaSexo(int sexo){
		if(sexo == 2){
			assinantes++;
		}
		else{
			contMulheres++;
		}
	}
	
	public void imprimir(){
		System.out.println(contMulheres);
	}

}
