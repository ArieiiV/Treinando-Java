package br.com.impacta.classes;

public class Automovel {
	private String marca;
	private String modelo;
	private int ano;

	// GETTERS e SETERS são os unicos metodos que acessan os atributos da classe
	// e os demais meotods acessam os getters e setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano=this.validarAno(ano);
	}

	// metodos validadores do ano
	private boolean anoEhNegativo(int ano) {
		return ano < 0;
	}

	private boolean anoEhMenorQue1970(int ano) {
		return ano < 1970;
	}

	private int validarAno(int ano) {
		if (this.anoEhNegativo(ano)) {
			return 0;
		} else if (this.anoEhMenorQue1970(ano)) {
			return 1970;
		} else {
			return ano;
		}
	}

	// metodo para atribuir valores
	public void atribuir(String marca, String modelo, int ano) {
		// This não acessa variavel local, somente atributos da classe (não apenas
		// variavel, mas também metodo)
		// Usamos o this aqui para fazer referencia aos atributos fora do metodo
		// Sendo assim o compilador não se confunde com os parametos passados que
		// possuem o mesmo nome dos atributos
		// declarados na classe
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);

	}

	// public void imprimirMsg() {
	// System.out.println(marca);
	// System.out.println(modelo);
	// System.out.println(ano);
	// }

	public String retornar() {
		String resposta = "Marca: " + this.getMarca() + "\nModelo: " + this.getModelo() + "\nAno: " + this.getAno();
		// public void > Não retorna nada no metodo
		// public String > retorna um valor do tipo string
		return resposta;

	}
}
