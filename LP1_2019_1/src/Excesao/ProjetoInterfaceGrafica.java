package Excesao;

import javax.swing.*;

public class ProjetoInterfaceGrafica {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Titulo da janela");
		janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		JLabel texto = new JLabel("Hello interface");
		JPanel painel = new JPanel();
		janela.getContentPane().add(painel);
		painel.add(texto);
		janela.pack();
		janela.setVisible(true);
	}

}
