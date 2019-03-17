package br.com.impacta.programa;

import javax.swing.JOptionPane;

public class LeituraNumeros {
	public static void main(String[] args) {
		/*
		 * O usuário informa vários número. Apenas os números positivos serão mostrados
		 * Se o número negativo for informado o programa o ignorará.
		 * O programa será interrompido apenas se for informado o valor 0.
		 */
		while(true) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
			if(numero==0) {
				break;
			}
			if(numero <0) {
				continue;
				
			}
			System.out.println(numero);
		}
		System.out.println("---------------Finalizado");
	}
}
