package reinoAnimal;

public class Mamifero extends Animal{
	protected String corPelo;
	
	public Mamifero(double peso, int idade, int membros, String corPelo){
		super(peso, idade, membros);
		this.corPelo = corPelo;
	}
	
	@Override
	public void locomover(){
		System.out.println("Correndo");
	}
	
	@Override
	public void alimentar(){
		System.out.println("Mamando");
	}
	
	@Override
	public void emitirsom(){
		System.out.println("Som de Mamifero");
	}

}
