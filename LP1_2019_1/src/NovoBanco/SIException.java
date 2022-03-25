package NovoBanco;

public class SIException extends Exception {
	private double saldo;
	
	public SIException(double saldo){
		super("Saldo Insuficiente");
		this.saldo = saldo;
	}

}
