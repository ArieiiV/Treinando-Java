package br.com.impacta.programa;

import javax.swing.JOptionPane;

public class SenhaAleatoria {
	public static void main(String[] args) {
		/*
		 * Escrever um conjunto de instru��es que permitam
		 * produzir uma senha com 6 digitos, cada um gerado aleatoriamente
		 * cada digito deve ser entre zero e nove
		 */
		
		
		String senha="";
		
		for (int i = 0; i < 6; i++) {
			senha+=(int)(Math.random()*10);
			
		}
		JOptionPane.showMessageDialog(null, "Senha gerada: "+senha);
	}
}
