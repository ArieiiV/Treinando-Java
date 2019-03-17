package br.com.impacta.aplicacao;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class AppArrayString01 {
	public static void main(String[] args) {
	//o usuario informa o numero de pessoas de em uma sala
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas Pessoas tem na sala?"));
		String[] nomes = new String[quantidade];
		
		//obtendo cada um dos nomes
		for (int i = 0; i < nomes.length; i++) {
			nomes[i]=JOptionPane.showInputDialog("Informe o nome"+(i+1)+" de "+quantidade);
			JOptionPane.showMessageDialog(null, nomes[i]);		
			
		}
		
		Arrays.sort(nomes);
		
		//exibindo os nomes ordenados na tela
		for (String nome : nomes) {
			System.out.println(nome);
		}
	}
}
