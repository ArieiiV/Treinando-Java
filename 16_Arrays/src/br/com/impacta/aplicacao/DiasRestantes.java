package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

public class DiasRestantes {
	public static void main(String[] args) {
		/*
		 * Neste exercicio o usuario informa 3 dados, dia , mes e ano. o ano é usado
		 * para determinar quantos dias tem no mes de fevereiro
		 * 
		 * Com base nestas informações apresentar na tela, quantos dias restam para
		 * terminar o ano.
		 * 
		 */

		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano"));

		int[] meses = { 31, ano % 4 == 0 ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês"));

		if (mes < 1 || mes > 12) {
			JOptionPane.showMessageDialog(null, "Mês inválido !! ");
			return;
		}

		int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia"));
		if (dia < 1 || dia > meses[mes - 1]) {
			JOptionPane.showMessageDialog(null, "Dia inválido para o mês informado");
			return;
		}

		int diasRestantes = meses[mes - 1] - dia;

		for (int i = mes; i < meses.length; i++) {
			diasRestantes += meses[i];
		}

		JOptionPane.showMessageDialog(null, "Restam " + diasRestantes + " dias para acabar o ano");

	}
}
