package br.com.impacta.programa;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Automovel;

public class AppAutomovel {
	public static void main(String[] args) {
		Automovel automovel = new Automovel();

		automovel.atribuir("Ford", "Fusion", -5);
		JOptionPane.showMessageDialog(null, automovel.retornar());

		// System.out.println(automovel.marca);
		// System.out.println(automovel.modelo);
		// System.out.println(automovel.ano);
	}
}
