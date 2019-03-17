package br.com.impacta.programa;

import javax.swing.JOptionPane;

public class AdivinhaNumero {
	public static void main(String[] args) {
		/*
		 * 1. O programa gera um n�mero aleatorio de (0 a 100) 2. Iterativamente , o
		 * usu�rio � solicitado a informar um n�mero. 3.Se o usu�rio informar um valor
		 * menor que o n�mero gerado, o programa dever� responder:
		 * "Informe um n�mero maior" 4. Caso contr�rio, se o usu�rio fornecer um valor
		 * acima do n�mero gerado, o programa dever� responder: "Informe um n�mero meno"
		 * 5. Quando for informado um valor igual ao que o programa gerou, o programa
		 * deve responder: Voc� acertou em N tentativas.
		 */

		// gera��o de um n�mero aleatorio
		int numeroRandom = (int) (Math.random() * 100);
		//variavel representando o n�mero de tentativas
		int tentativas =0;
		//valor minimo de tentaivas
		int min = 0;
		//valor maximo de tentativas
		int max = 100;
		
		while(true) {
			tentativas++;
			//obtendo o valor do usuario
			int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero entre "+min+" e "+max));
			
			if(valor<min || valor>max) {
				continue;
			}
			if(valor<numeroRandom) {// se o valor informado for menor que o numero gerado
				min = valor+1;
			}else if(valor>numeroRandom) {// se o valor informado for maior que o numero gerado
				max = valor -1;
			}else {
				break;// aqui o usu�rio acertou
			}
		}
		JOptionPane.showMessageDialog(null,"Voc� acertou em "+tentativas+" tentativas");
	}
}
