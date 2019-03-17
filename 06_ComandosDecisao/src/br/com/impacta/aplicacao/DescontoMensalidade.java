package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

public class DescontoMensalidade {
	public static void main(String[] args) {
		/*
		 * Em uma escola o desconto na mensalidade ocorre da seguinte forma: - Existem
		 * dois periodos, Se o periodo for diurno havera um desconto de 10% - Alem
		 * disso, se a ,média final do aluno for superior a 9 havera um desconto de 15%
		 * - Os descontos sao cumulativos. Escreva um programa que solicite: o peridodo
		 * do aluno (1 - diurno, 2- noturno) a media final o valor da mensalidade
		 * 
		 * Emm seguida, apresente o valor da mensalidade o valor do desconto a
		 * mensalidade final
		 */

		int periodo = Integer.parseInt(JOptionPane.showInputDialog("Informe o Perido do aluno"));
		double mensalidade = Double.parseDouble((JOptionPane.showInputDialog("O valor da mensalidade")));
		double media = Double.parseDouble(JOptionPane.showInputDialog("Média Final"));

		double desconto = 0;

		if (periodo == 1) {
			desconto = mensalidade * 0.1;
		}
		if (media > 9) {
			desconto += mensalidade * 0.15;
		}

		String resposta = "Mensalidade sem desconto:" + mensalidade + "\nDesconto: " + desconto
				+ "\n Mensalidade com desconto: " + (mensalidade - desconto);
		
		JOptionPane.showMessageDialog(null,resposta);

	}
}
