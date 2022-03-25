public class test {
	
	public static void main(String[] args) {
		Conta nova = new Conta("123-4", 1000.00);
		System.out.println(nova.getNumero());
		
		String test = "456-7";
		double saldoInicial = 2000.00;
		
		Conta nova2 = new Conta(test, saldoInicial);
		System.out.println(nova2.getNumero());
		
		Conta nova3;
		nova3 = new Conta("091-2", 3500.0);
		
		Conta nova4 = new Conta("654-x");
		System.out.println(nova4.getSaldo());
		
		Conta nova5 = new Conta();
		nova5.setNumero("yu123");
		nova5.setSaldo(2300.0);
		System.out.println(nova5.getNumero());
		
		Poupanca novaPoup = new Poupanca("3.3-x");
		novaPoup.renderJuros(0.01);
		
		
	}
}
