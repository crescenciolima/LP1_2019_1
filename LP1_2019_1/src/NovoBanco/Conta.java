package NovoBanco;

public class Conta extends ContaAbstrata {
	public Conta(String numero, double saldo){
		super(numero, saldo);
	}
	
	@Override
	public void debitar(double valor) throws SIException{
		if(saldo >= valor){
			saldo -= valor;
		}else{
			SIException e = new SIException(saldo);
			throw e;
		}
	}
}
