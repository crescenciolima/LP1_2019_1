package Excesao;

import javax.swing.JOptionPane;

public class ProjetoInterfaceSimples {

	public static void main(String[] args) {
		String primeiroNumero = JOptionPane.showInputDialog("Entre o primeiro Numero: ");
		String segundoNumero = JOptionPane.showInputDialog("Digite o segundo Numero: ");
		int numero1 = Integer.parseInt(primeiroNumero);
		int numero2 = Integer.parseInt(segundoNumero);
		int soma = numero1 + numero2;
		JOptionPane.showMessageDialog(null, "Resultado da soma: " + soma);

	}

}
