package br.com.impacta.classes;

//Classe abastrata não pode ser instanciada.
//Só posso ter metodo abastrato se a classe for abastrata
public abstract class Documento {
	private String numero;
	private int digitos;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		if (numero.length() != this.getDigitos()) {
			throw new NumberFormatException("Documento Inválido !");
		}
		this.numero = numero;
	}

	protected int getDigitos() {
		return digitos;
	}

	public void setDigitos(int digitos) {
		this.digitos = digitos;
	}

	// Metodo abastrato é um metodo que é implementado em classes secundarias
	// Metodo abastrato aplica polimorfismo
	public abstract String exibir();

}
