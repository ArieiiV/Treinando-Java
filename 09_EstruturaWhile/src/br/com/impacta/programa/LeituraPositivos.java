package br.com.impacta.programa;

import javax.swing.JOptionPane;

public class LeituraPositivos {
	public static void main(String[] args) {
		/*
		 * O usuário informa alguns números, Enquanto ele informar um 
		 * número positivo o programa apresenta na tela o número informado
		 * Se ele informar 0 ou negativo, o programa é interompido.
		 */
		
		
		while(true) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
			if(numero<=0) {
				break;
			}
			System.out.println(numero);
		}
		System.out.println("---------------Finalizado");
	}
}
