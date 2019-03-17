package br.com.impacta.programa;

import javax.swing.JOptionPane;

public class VariaveisChar {
	public static void main(String[] args) {
		char letra = 'a';
		char linha = '\n';
		char numero = 65;
		char simbolo = 27554;
		
		System.out.println("letra: " + letra);
		System.out.println("linha: "+linha);
		System.out.println("numero: " + numero);
		System.out.println("simbolo: " + simbolo);
		JOptionPane.showMessageDialog(null, "simbolo: "+simbolo);

	}
}
