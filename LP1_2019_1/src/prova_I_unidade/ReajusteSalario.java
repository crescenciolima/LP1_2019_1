package prova_I_unidade;
import java.util.Scanner;

public class ReajusteSalario {
	
	public static void salarioReajuste(double salario){
		System.out.println("Novo salário: " + (salario+(salario*0.15)));
		System.out.println("Reajuste: " + salario*0.15);
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o salaraio: ");
		double salario = entrada.nextDouble();
		salarioReajuste(salario);

	}

}
