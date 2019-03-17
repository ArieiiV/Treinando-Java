package br.com.impacta.programa;

import javax.swing.JOptionPane;

public class MesesAnoSwitch {
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
			dias = 30;
			break;
		case 2:
			dias = ano % 4 == 0 ? 29 : 28;
			break;
		case 3:
			dias = 31;
			break;
		case 4:
			dias = 30;
			break;
		case 5:
			dias = 31;
			break;
		case 6:
			dias = 30;
			break;
		case 7:
			dias = 31;
			break;
		case 8:
			dias = 31;
			break;
		case 9:
			dias = 30;
			break;
		case 10:
			dias = 31;
			break;
		case 11:
			dias = 30;
			break;
			default: dias =31;

		}

		JOptionPane.showMessageDialog(null, "O Mês informado possuí: " + dias + " dias.");
	}
}
