package br.com.impacta.programa;

import javax.swing.JOptionPane;//ctrl+shift+o retira os imports que nao estao sendo usdos e coloca os que faltam
import br.com.impacta.classes.Endereco;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {
	public static void main(String[] args) {

		//pessoa1
		Pessoa pessoa1 = new Pessoa(Sexo.MASCULINO, 15, 1.5);
		Endereco endereco = new Endereco("Av Paulista",1009,"São-Paulo");
		pessoa1.setendereco(endereco);
		//alterando a idade de pessoa1
		pessoa1.setIdade(30);
		JOptionPane.showMessageDialog(null, pessoa1.exibir());
		
		//pessoa2
		Pessoa pessoa2 = new Pessoa(Sexo.FEMINIMO,12.60,1.99,"Leandro",22,
					                new Endereco("Al Santos",954,"São Paulo")); 
		//aterando o numero do endereço de pessoa2
		pessoa2.getendereco().setNumero(94);
		
		JOptionPane.showMessageDialog(null,pessoa2.exibir());
		

	}
}
