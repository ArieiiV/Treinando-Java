package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

public class LeituraDadosPessoais {
	public static void main(String[] args) {

		// obtendo o nome de uma pessoa
		String nome = JOptionPane.showInputDialog("Informe seu Nome: ");
		double salarioBase = 3000;

		// int idade = JOptionPane.showInputDialog("Informe sua Idade: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua Idade: "));

		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu sal�rio: "));
		String cpf = JOptionPane.showInputDialog("Informe seu CPF: ");

		// produzindo a resposta para o usu�rio

		String resposta = "Nome informado: " + nome + "\nCPF informado: " + cpf + "\nIdade Informada: " + idade
				+ "\nSal�rio Informado: " + salario + "\nImposto cobrado: "
				+ (salario <= salarioBase ? salario * 0.10 : (salario * 0.10) + (salario - salarioBase * 0.15));
		;
		JOptionPane.showMessageDialog(null, resposta);

	}
}
