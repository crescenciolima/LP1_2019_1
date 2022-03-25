package reinoAnimal;

public class Peixe extends Animal {
	private String corEscama;
	
	public Peixe(double peso, int idade, int membros, String corEscama){
		super(peso, idade, membros);
		this.corEscama = corEscama;
	}
	
	@Override
	public void locomover(){
		System.out.println("Nadando");
	}
	
	@Override
	public void alimentar(){
		System.out.println("Comendo planctons");
	}
	
	@Override
	public void emitirsom(){
		System.out.println("Peixe nao faz som");
	}
	
	public void soltarBolha(){
		System.out.println("Soltar uma bolha");
	}
	
}
