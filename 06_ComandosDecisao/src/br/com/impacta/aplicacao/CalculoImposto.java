package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

public class CalculoImposto {
	public static void main(String[] args) {
		/*
		 * Se um funcionário receber como salário um valor superior a R$ 1.000,00, ele
		 * terá um desconto de 10% sobre o que ultrapassar R$1.000,00 Escreva um
		 * programa que solicite o nome e o salário e apresente como resposta : nome
		 * salário o valor do desconto
		 */

		String nome = JOptionPane.showInputDialog("Nome do Funcionário");
		if (nome == null || nome.trim().equals("")) {
			JOptionPane.showMessageDialog(null, "O nome deve ser informado");
			return;
		}

		double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário"));

		double desconto;

		if (salario > 1000) {
			desconto = (salario - 1000) * 0.1;

		} else {
			desconto = 0;
		}
		String resposta = "Nome do funcionário: " + nome + "\nSalário: " + salario + "\nDesconto: " + desconto;

		JOptionPane.showMessageDialog(null, resposta);
	}
}
