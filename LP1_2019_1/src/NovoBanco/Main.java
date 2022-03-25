package NovoBanco;

public class Main {

	public static void main(String[] args) throws SIException{
		Conta conta1 = new Conta("123", 15.5);
		ContaImposto conta2 = new ContaImposto("456", 200.0);
		ContaAbstrata conta3 = new Conta("987", 150.0);
		conta1.imprimirSaldo();
		conta1.creditar(100.0);
		conta1.imprimirSaldo();
		conta1.debitar(200.0);
		conta1.imprimirSaldo();
		String bola = "bola";
		
		ContaAbstrata[] BaseDados = new ContaAbstrata[3];
		BaseDados[0] = conta1;
		BaseDados[1] = conta2;
		BaseDados[2] = conta3;
	
		BaseDados[0].creditar(10.0);
		BaseDados[0].imprimirSaldo();
		
		for(int i=0; i < BaseDados.length; i++){
			System.out.println("__________________");
			System.out.println("Endereco de memoria do objeto" + BaseDados[i]);
			BaseDados[i].imprimirSaldo();
		}
	}
}
