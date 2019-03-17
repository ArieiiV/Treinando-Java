package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;

public class Aluno extends Pessoa {
	private int matricula;
	private Curso curso;

	public Aluno(Sexo sexo, double peso, double altura) {
		super(sexo,peso,altura);
	}
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	@Override
	public String exibir() {
		String resultado=super.exibir()+"DADOS DO ALUNO: "+
						 "\n\nMatricula: "+this.getMatricula()+
						 "\nCurso: "+this.getCurso().exibir();
		
						 
		return resultado;
	}

}
