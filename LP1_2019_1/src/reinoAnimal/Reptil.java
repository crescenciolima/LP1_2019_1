package reinoAnimal;

public class Reptil extends Animal{
	private String corEscama;
	
	public Reptil(double peso, int idade, int membros, String corEscama){
		super(peso, idade, membros);
		this.corEscama = corEscama;
	}
	
	@Override
	public void locomover(){
		System.out.println("Rastejando");
	}
	
	@Override
	public void alimentar(){
		System.out.println("Comendo Vegetais");
	}
	
	@Override
	public void emitirsom(){
		System.out.println("Som de reptil");
	}
	
}
