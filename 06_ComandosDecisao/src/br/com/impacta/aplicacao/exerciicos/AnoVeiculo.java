package br.com.impacta.aplicacao.exerciicos;

import javax.swing.JOptionPane;

public class AnoVeiculo {
	public static void main(String[] args) {
		/*
		 * Escreva um programa que solicite a marca o modelo o ano de um veiculo Se o
		 * ano for inferior a 1999, nao tera valor para IPVA Al�m diss, a marca e o
		 * modelo devem ser informados, Verificar se � nulo ou vazio Se n�o o usu�ro
		 * receber� uma msg e o programa ser� encerrado.
		 * 
		 * Como resposta, mostrar na tela:
		 * 
		 * A marca do veiculo O modelo O ano Mostrar se paga ou n�o IPVA
		 *
		 */

		String marca = JOptionPane.showInputDialog("Digite a marca do veiculo");

		if (marca.equals(null)) {
			JOptionPane.showMessageDialog(null, "A marca do Veiculo deve ser informada");
			return;
		}
		if (marca.trim().equals("")) {
			JOptionPane.showMessageDialog(null, "A marca do Veiculo deve ser informada");
			return;
		}

		String modelo = JOptionPane.showInputDialog("Digite o modelo do veiculo");

		if (modelo.equals(null)) {
			JOptionPane.showMessageDialog(null, "O modelo do Veiculo deve ser informada");
			return;
		}
		if (modelo.trim().equals("")) {
			JOptionPane.showMessageDialog(null, "O modelo do Veiculo deve ser informada");
			return;
		}

		int anofab = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de Fabrica��o"));
		
		String resposta1 = "O modelo �:" + modelo + "\nA marca do veiculo �:" + marca + "\n O ano deo veiculo �" + anofab
				+ "\nVoc� n�o paga IPVA";
		String resposta2 = "O modelo �:" + modelo + "\nA marca do veiculo �:" + marca + "\n O ano deo veiculo �" + anofab
				+ "\nVoc� paga IPVA";

		if (anofab > 1999) {
			JOptionPane.showMessageDialog(null, resposta1);
		}else {
			JOptionPane.showMessageDialog(null, resposta2);
		}

	}
}
