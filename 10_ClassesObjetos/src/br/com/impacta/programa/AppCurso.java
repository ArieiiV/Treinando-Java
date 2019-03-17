package br.com.impacta.programa;

import br.com.impacta.classes.exercicios.Curso;

public class AppCurso {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.desc="Curso Java";
		curso1.ch=100;
		curso1.mensalidade=45.50;
		
		String resp1="curso1\n"+
		"Carga Horaria: "+curso1.ch+
		"\nDescrição: "+curso1.desc+
		"\nMensalidade: "+curso1.mensalidade;
		
		System.out.println(resp1);
		System.out.println("----------------------------------------");
		
		
		
		Curso curso2 = new Curso();
		curso2.ch=250;
		curso2.desc="Curso web";
		curso2.mensalidade=55.60;
		
		System.out.println("curso2");
		System.out.println("Carga Horaria: "+curso2.ch);
		System.out.println("Descrição: "+curso2.desc);
		System.out.println("Mensalidade: "+curso2.mensalidade);
		
		
		
	}

}
