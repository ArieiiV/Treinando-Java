package br.com.impacta.classes.exercicios;


public class Curso {

	private String desc;
	private int ch;
	private double mensalidade;

	public void atribuir(String desc, int ch, double mensalidade) {
		this.desc = desc;

		if (ch < 4) {
			this.ch = 4;
		} else {
			this.ch = ch;
		}

		if (mensalidade < 0) {
			this.mensalidade = 0;
		} else {
			this.mensalidade = mensalidade;
		}

	}

	public String apresentar() {
		String resposta = "Descrição: " + this.desc + 
				"\nCarga Horária: " + this.ch +
				"\nMensalidade:" + this.mensalidade;
		return resposta;
	}

}
