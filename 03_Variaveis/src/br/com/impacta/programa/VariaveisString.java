package br.com.impacta.programa;

import javax.swing.JOptionPane;

public class VariaveisString {
	public static void main(String[] args) {
		String nome = "Karoline Vieira";
		String email = "k@hotmail.com";
		String curso = "Curso: \"Java Programer\" \nCarga Horária: '100 horas'";
		String texto = "Nome: " + nome + "\nEmail: " + email + "\n" + curso;
		System.out.println(texto);
		JOptionPane.showMessageDialog(null, texto);

		// System.out.println(curso);
	}
}
