package NovoBanco;

public abstract class ContaAbstrata {
	protected String numero;
	protected double saldo;
	
	public ContaAbstrata(String numero, double saldo){
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void creditar(double valor){
		this.saldo += valor;
	}
	
	public abstract void debitar(double valor) throws SIException;
	
	public void imprimirSaldo(){
		System.out.println("Conta: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
	}
	
}
