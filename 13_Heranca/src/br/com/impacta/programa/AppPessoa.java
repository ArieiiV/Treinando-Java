package br.com.impacta.programa;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {
	public static void main(String[] args) {
		
		//objeto funcionario,referncia Funcionario
		Funcionario func1 = new Funcionario(Sexo.MASCULINO,65,1.95);
		
		func1.setNome("Gerson");
		func1.setIdade(24);
		func1.setCargo("Motoboy");
		func1.setCpf("12345678910");
		func1.setSalario(3000);
		

		
		//objeto Pessoa, referencia Pessoa;
		Pessoa pessoa1 = new Pessoa(Sexo.FEMINIMO, 97, 1.65);
		pessoa1.setNome("Andreia");
		pessoa1.setIdade(89);
		
		
		
		JOptionPane.showMessageDialog(null, pessoa1.exibir());
		
		//Objeto Funcionaro, Referencia Pessoa
		pessoa1=func1;
		
		JOptionPane.showMessageDialog(null, pessoa1.exibir());
		
	}
}
