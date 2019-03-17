package br.com.impacta.programa;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPolimorfismo2 {
	public static void main(String[] args) {
		Pessoa p1 = new Aluno(Sexo.MASCULINO, 65, 2.00); // oque importa é o tipo de dados (Pessoa) ele só acessa dados
															// do tipo pessoa

		if (p1 instanceof Aluno) {
			Aluno a1 = (Aluno) p1; // ou  ((Aluno) p1).setCurso(new Curso("PHP", 40, 1200));
			a1.setCurso(new Curso("PHP", 40, 1200));
			a1.setMatricula(123456);
			JOptionPane.showMessageDialog(null, p1.exibir());
		}

		if (p1 instanceof Funcionario) {
			p1 = new Funcionario(Sexo.FEMINIMO, 20, 1.65);
			Funcionario f1 = (Funcionario) p1;
			f1.setCpf("12345678");
			f1.setCargo("Professor");
			f1.setSalario(1500);
			JOptionPane.showMessageDialog(null, p1.exibir());
		}

		p1 = new Pessoa(Sexo.FEMINIMO, 60, 1.70);
		JOptionPane.showMessageDialog(null, p1.exibir());

		// p1.setNome("Nestor");
		// p1.setIdade(28);
		//
		//
		// if (p1 instanceof Aluno) {
		// ((Aluno) p1).setMatricula(12345);
		// ((Aluno) p1).setCurso(new Curso("PHP", 40, 1200));
		// }else if(p1 instanceof Funcionario){
		// ((Funcionario)p1).setCpf("1234567810");
		// ((Funcionario)p1).setSalario(1500);
		// ((Funcionario)p1).setCargo("Professor");
		// }
		//
		// JOptionPane.showMessageDialog(null, p1.exibir());

	}

}
