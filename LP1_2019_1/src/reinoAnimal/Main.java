package reinoAnimal;

public class Main {

	public static void main(String[] args) {
		Mamifero m = new Mamifero(10.0, 2, 4, "Marrom");
		Reptil r = new Reptil(2.0, 1, 4, "Verde");
		Peixe p = new Peixe(1.0, 3, 0, "Azul");
		Canguru c = new Canguru(50.0, 5, 2, "Marrom");
		
		m.locomover();
		r.locomover();
		p.locomover();
		c.locomover();

	}

}
