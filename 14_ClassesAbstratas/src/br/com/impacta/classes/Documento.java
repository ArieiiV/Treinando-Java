package br.com.impacta.classes;

//Classe abastrata n�o pode ser instanciada.
//S� posso ter metodo abastrato se a classe for abastrata
public abstract class Documento {
	private String numero;
	private int digitos;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		if (numero.length() != this.getDigitos()) {
			throw new NumberFormatException("Documento Inv�lido !");
		}
		this.numero = numero;
	}

	protected int getDigitos() {
		return digitos;
	}

	public void setDigitos(int digitos) {
		this.digitos = digitos;
	}

	// Metodo abastrato � um metodo que � implementado em classes secundarias
	// Metodo abastrato aplica polimorfismo
	public abstract String exibir();

}
