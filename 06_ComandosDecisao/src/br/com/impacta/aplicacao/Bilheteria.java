package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

public class Bilheteria {
	public static void main(String[] args) {
		/*
		 * Em um evento, valor do bilhete é cobrado da seguinte forma: - Se o
		 * participante tiver até 5 anos não paga nada - Se ele tiver acima de 5 anos
		 * até 17 paga 20 reais - Acima de 17 até 59 anos paga 40 reais. - Acima de 59
		 * anos paga 15 reais. Escreva um programa que solicite o nome e a idade do
		 * participante.
		 * 
		 * 
		 * O programa deve mostrar : - O nome do participante: - A idade: - O valor do
		 * bilhete:
		 */

		int idadeParticipante = Integer.parseInt(JOptionPane.showInputDialog("Idade do Participante"));
		String nomeParticipante = JOptionPane.showInputDialog("Nome do particiante");
		double valorBilhete;

		if (idadeParticipante <= 5) {
			valorBilhete = 0;
		} else if (idadeParticipante > 5 && idadeParticipante <= 17) {
			valorBilhete = 20;
		} else if (idadeParticipante > 17 && idadeParticipante <= 59) {
			valorBilhete = 40;
		} else {
			valorBilhete = 15;
		}
		String resposta = "Nome do Participante:" + nomeParticipante + "\n Idade do participante: " + idadeParticipante
				+ "\n Valor do bilhete: " + valorBilhete;
		JOptionPane.showMessageDialog(null, resposta);
	}
}
