package br.com.impacta.programa;

import javax.swing.JOptionPane;

public class LeituraNumeros {
	public static void main(String[] args) {
		/*
		 * O usu�rio informa v�rios n�mero. Apenas os n�meros positivos ser�o mostrados
		 * Se o n�mero negativo for informado o programa o ignorar�.
		 * O programa ser� interrompido apenas se for informado o valor 0.
		 */
		while(true) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero"));
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
