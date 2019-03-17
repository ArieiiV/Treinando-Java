package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;

public class Pessoa {
	private String nome;
	private int idade;
	private Sexo sexo;
	private double peso;
	private double altura;
	private Endereco endereco;

	// construtores
	// construtores servem para alterar como os objetos serão criados

	public Pessoa(Sexo sexo, double peso, double altura) {
		this.setNome("Não informado");
		this.setAltura(altura);
		this.setSexo(sexo);
		this.setPeso(peso);
	}

	// sobrecarga do construtor Pessoa
	public Pessoa(Sexo sexo, 
			double peso, 
			double altura, 
			String nome
			) {
		this(sexo,peso,altura);//se beneficia da referencia do construtor de cima
		this.setNome(nome);
	}

	public Pessoa(Sexo sexo, 
			double peso, 
			double altura, 
			String nome, 
			int idade
			) {		
		this(sexo, peso, altura,nome);//quando se beneficia do this como metodo, ele sempre tem de ser em primeiro lugar 
		this.setIdade(idade);
	}

	public Pessoa(Sexo sexo, //Sexo que é enum
			double peso,     // Peso da pessoa e deve ser positivo
			double altura,   //Altura da pessoa, positiva
			String nome,     //nome da pessoa
			int idade,       //idade da pessoa 
			Endereco endereco
			)
	{

		this(sexo,peso,altura,nome,idade);
		this.setendereco(endereco);
	}

	// getters e setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Endereco getendereco() {
		return endereco;
	}

	public void setendereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String exibir() {
		String resultado = "DADOS DA PESSOA:" + "\n\n Nome: " + this.getNome() + "\n Idade: " + this.getIdade()
				+ "\n Sexo: " + this.getSexo() + "\n Peso:" + this.getPeso() + "\n Altura: " + this.getAltura()
				+ "\n\n " + (this.getendereco() == null ? "Endereço não informado" : this.getendereco().exibir());
		return resultado;
	}

	/*
	 * 
	 */

}
