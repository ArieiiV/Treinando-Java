package br.com.impacta.programa;

import javax.swing.JOptionPane;

public class LeituraPositivos {
	public static void main(String[] args) {
		/*
		 * O usu�rio informa alguns n�meros, Enquanto ele informar um 
		 * n�mero positivo o programa apresenta na tela o n�mero informado
		 * Se ele informar 0 ou negativo, o programa � interompido.
		 */
		
		
		while(true) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero"));
			if(numero<=0) {
				break;
			}
			System.out.println(numero);
		}
		System.out.println("---------------Finalizado");
	}
}
