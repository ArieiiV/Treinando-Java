package br.com.impacta.programa;

import javax.swing.JOptionPane;

public class MesesAnoSwitchNovo {
	public static void main(String[] args) {
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês de (1 a 12)"));
		if (mes < 1 || mes > 12) {
			JOptionPane.showMessageDialog(null, "MÊs inválido");
			return;
		}
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano"));
		int dias;

		switch (mes) {
		case 1:
		case 4:
		case 6:
		case 9:
		case 11:
			dias = 30;
			break;
		case 3:
		case 5:
		case 7:
		case 10:
		case 8:
		case 12:
			dias = 31;
			break;
		default:
			dias = ano % 4 == 0 ? 29 : 28;

		}

		JOptionPane.showMessageDialog(null, "O Mês informado possuí: " + dias + " dias.");
	}
}
