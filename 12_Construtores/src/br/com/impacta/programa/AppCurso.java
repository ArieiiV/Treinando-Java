package br.com.impacta.programa;

import javax.swing.JOptionPane;

import br.com.impacta.classes.exercicios.Curso;

public class AppCurso {
	public static void main(String[] args) {
		
		String cursoDesc= JOptionPane.showInputDialog("Nome do curso");
		int cursoCh =Integer.parseInt(JOptionPane.showInputDialog("Carga horária do curso"));
		double cursoValor= Double.parseDouble(JOptionPane.showInputDialog("Valor do curso"));
		

		Curso curso = new Curso();
		curso.atribuir(cursoDesc, cursoCh, cursoValor);
		JOptionPane.showMessageDialog(null, curso.apresentar());

	}
}
