package br.com.impacta.programa;

public class VariaveisInteiras {
	public static void main(String[] args) {
		// declarando variaveis
		byte quantAlunos = 127; // não pode receber mais que 127;
		short quantFans = 32767;
		int quantGraos = 10000000;// int é o inteiro padrão
		long quantMoleculas = 1600000000;
		// variaveis duvidosas:soma
		byte operando1 = 120;
		byte operando2 = 10;
		/*
		 * byte soma = operando1 + operando2; nunca vai receber o valor da soma,o
		 * compilador não tem analisa o o valor que vc atribiui em variaveis, vai estar
		 * abaixo de 127
		 */
		byte soma = (byte) (operando1 + operando2);/*
													 * aqui funciona eu estou avisando o compilador que o valor irá
													 * caber um byte com typecast, coerção não é um casting uma conversão e sim uma coerção
													 */
		System.out.println(quantAlunos);
		System.out.println(quantFans);
		System.out.println(quantGraos);
		System.out.println(quantMoleculas);
		System.out.println(soma);
	}

}
