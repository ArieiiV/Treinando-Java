package br.com.impacta.programa;

import javax.swing.JOptionPane;

public class AdivinhaNumero {
	public static void main(String[] args) {
		/*
		 * 1. O programa gera um número aleatorio de (0 a 100) 2. Iterativamente , o
		 * usuário é solicitado a informar um número. 3.Se o usuário informar um valor
		 * menor que o número gerado, o programa deverá responder:
		 * "Informe um número maior" 4. Caso contrário, se o usuário fornecer um valor
		 * acima do número gerado, o programa deverá responder: "Informe um número meno"
		 * 5. Quando for informado um valor igual ao que o programa gerou, o programa
		 * deve responder: Você acertou em N tentativas.
		 */

		// geração de um número aleatorio
		int numeroRandom = (int) (Math.random() * 100);
		//variavel representando o número de tentativas
		int tentativas =0;
		//valor minimo de tentaivas
		int min = 0;
		//valor maximo de tentativas
		int max = 100;
		
		while(true) {
			tentativas++;
			//obtendo o valor do usuario
			int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um número entre "+min+" e "+max));
			
			if(valor<min || valor>max) {
				continue;
			}
			if(valor<numeroRandom) {// se o valor informado for menor que o numero gerado
				min = valor+1;
			}else if(valor>numeroRandom) {// se o valor informado for maior que o numero gerado
				max = valor -1;
			}else {
				break;// aqui o usuário acertou
			}
		}
		JOptionPane.showMessageDialog(null,"Você acertou em "+tentativas+" tentativas");
	}
}
