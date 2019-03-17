package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.enumerados.MesesAno;

public class DiasRestantes01 {
	public static void main(String[] args) {

		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano"));

		int[] meses = { 31, ano % 4 == 0 ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		MesesAno ma = (MesesAno) JOptionPane.showInputDialog(null, "Selecione o m�s", "Meses",
				JOptionPane.QUESTION_MESSAGE, null, MesesAno.values(), MesesAno.MAR�O);

		int mes = ma.ordinal();// retorna a posi��o de acordo com a ordem

		int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia"));

		if (dia < 1 || dia > meses[mes]) {
			JOptionPane.showMessageDialog(null, "Dia inv�lido para o m�s informado");
			return;
		}

		int diasRestantes = meses[mes] - dia;

		for (int i = mes + 1; i < meses.length; i++) {
			diasRestantes += meses[i];
		}

		JOptionPane.showMessageDialog(null, "Restam " + diasRestantes + " dias para acabar o ano");

	}
}
