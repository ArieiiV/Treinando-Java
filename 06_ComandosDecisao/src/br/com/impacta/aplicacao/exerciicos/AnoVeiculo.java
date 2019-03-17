package br.com.impacta.aplicacao.exerciicos;

import javax.swing.JOptionPane;

public class AnoVeiculo {
	public static void main(String[] args) {
		/*
		 * Escreva um programa que solicite a marca o modelo o ano de um veiculo Se o
		 * ano for inferior a 1999, nao tera valor para IPVA Além diss, a marca e o
		 * modelo devem ser informados, Verificar se é nulo ou vazio Se não o usuáro
		 * receberá uma msg e o programa será encerrado.
		 * 
		 * Como resposta, mostrar na tela:
		 * 
		 * A marca do veiculo O modelo O ano Mostrar se paga ou não IPVA
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

		int anofab = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de Fabricação"));
		
		String resposta1 = "O modelo é:" + modelo + "\nA marca do veiculo é:" + marca + "\n O ano deo veiculo é" + anofab
				+ "\nVocê não paga IPVA";
		String resposta2 = "O modelo é:" + modelo + "\nA marca do veiculo é:" + marca + "\n O ano deo veiculo é" + anofab
				+ "\nVocê paga IPVA";

		if (anofab > 1999) {
			JOptionPane.showMessageDialog(null, resposta1);
		}else {
			JOptionPane.showMessageDialog(null, resposta2);
		}

	}
}
