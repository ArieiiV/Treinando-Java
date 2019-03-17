package br.com.impacta.classes.exercicios;

public class Imovel {
	private String desc;
	private double area;
	private String endereco;
	private double preco;

	/*
	 * Regras de negocio para a classe imovel: - A area minima é de 20m² e maxima de
	 * 200m² - O preço do imovel não pode ser superior a 400 mil reais, se a area
	 * for até 60m²
	 */

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area =this.validarArea(area);
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = this.validarPreco(preco);
	}

	// métodos de validação
	private double validarArea(double area) {
		if (area < 20) {
			return 20;
		} else if (area > 200) {
			return 200;
		}
		return area;
	}

	/*
	 * WARNING!!
	 * Essa validação só funcionará se o valor da a´rea for previamente conhecido.Isso exige que
	 * a atribuição da area ocorra antes da atribuição do preço
	 * 
	 *  Esse processo não é bem vindo em POO e deve ser evitado
	 */
	private double validarPreco(double preco) {
		//this.getArea() é usado para acessar o valor retornado pelo metodo getArea()
		if (this.getArea() <= 60 && preco >400000) {
			return 400000;
		}
		return preco;
	}

}
