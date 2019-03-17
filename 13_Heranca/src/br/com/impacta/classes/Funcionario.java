package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;

//Herança
public class Funcionario extends Pessoa {

	private String cpf;
	private String cargo;
	
	private double salario;

	public Funcionario(Sexo sexo, double peso, double altura) {
		super(sexo, peso, altura);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// polimorfismo é sobreescrever o mesmo metodo da super classe
	@Override // @Override esta afirmando que é um metodo que esta sobreescrevendo a super
				// classe
	public String exibir() {
		String resultado = super.exibir() + "\n\nDADOS DO FUNCIONARO: " + "\n\n Salário: " + this.getSalario()
				+ "\nCPF: " + this.getCpf() + "\nCargo: " + this.getCargo();
		return resultado;
	}
}
