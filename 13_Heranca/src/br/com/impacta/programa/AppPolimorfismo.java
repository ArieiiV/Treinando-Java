package br.com.impacta.programa;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPolimorfismo {
	public static void main(String[] args) {

		// variavel � criada na compila��o p1
		// objeto � criado na execu��o new Funcionario
		Pessoa p1 = new Funcionario(Sexo.MASCULINO,72,1.75);// oque importa � o tipo de dados (Pessoa) ele s� acessa dados do tipo pessoa
		p1.setNome("Nestor");
		p1.setIdade(28);
		((Funcionario)p1).setCpf("123456");
		((Funcionario)p1).setCargo("Atendente");
		((Funcionario)p1).setSalario(3000);
		
		JOptionPane.showMessageDialog(null,p1.exibir());//esta exibindo o exibir da classe Funcionario, metodos

//		Funcionario f1 = (Funcionario) p1;// n�o foda-se eu quero ser um funcionario, agora consigo setar o cpf carga e salario
//											// pq sou sim um funcionario
//		f1.setCargo("Atendente");
//		f1.setCpf("1234569");
//		f1.setSalario(3000);

	}
}
