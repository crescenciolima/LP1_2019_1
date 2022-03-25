
public class Conta {
	protected String numero;
	protected double saldo;
	
	public Conta(String num, double sal){
		this.numero = num;
		this.saldo = sal;
	}
	
	public Conta(String num){
		this.numero = num;
		this.saldo = 0.0;
	}
	
	public Conta(){
		this.numero = null;
		this.saldo = 0.0;
	}
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void setNumero(String numero){
		this.numero = numero;
	}
	
	public String getNumero(){
		return numero;
	}
	
	public void creditar(double valor){
		saldo = saldo + valor;
	}
	
	public void debitar(double valor){
		if(saldo > valor){
			saldo = saldo - valor;
		}
		else{
			System.out.println("Saldo insuficiente");
		}
		
	}
}
