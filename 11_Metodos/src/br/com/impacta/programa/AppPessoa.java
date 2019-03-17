package br.com.impacta.programa;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Endereco;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;
import br.com.impacta.utilitarios.Calculos;

public class AppPessoa {
	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Leandro");
		pessoa1.setIdade(23);
		pessoa1.setSexo(Sexo.MASCULINO);
		pessoa1.setPeso(150);
		pessoa1.setAltura(1.95);

		/*
		 * antes de setar qualquer coisa em setendereco precisa criar o objeto Endereço
		 * e preenche-lo
		 */
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Av Paulista");
		endereco.setCidade("São-Paulo");
		endereco.setNumero(1009);

		/*
		 * Referencia o objeto criado do endereço e atribui para endereço de pessoa
		 */
		pessoa1.setendereco(endereco);

		JOptionPane.showMessageDialog(null, pessoa1.exibir());

		/*
		 * Quando se cria um metodo static não precisa criar um objeto para chama-lo
		 * Pode chamar o metodo static através da propria classe nesse exemplo
		 * >"Endereco"
		 */
		double soma = Calculos.calcularSoma(50, 22);
		System.out.println(soma);

	}
}
