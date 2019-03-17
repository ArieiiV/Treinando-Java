package br.com.impacta.programa;

public class OperadorTernario {
	public static void main(String[] args) {
		int idade = 14;
		String status = idade < 18 ? "Menor" : "Maior";
		System.out.println("Idade: " + idade);
		System.out.println("Status: " + status);
		System.out.println("-------------------------------------");
		System.out.println("Idade: " + idade + '\n' + (idade < 18 ? "Menor" : "Maior"));
		System.out.println("-------------------------------------");

		// Se o salário de um funcionário for
		// até R$ 3.000,00, Ele pagara 10% de imposto. Se o salário for superior a R$
		// 3.000,00 ele pagará 10% sobre R$ 3.000,00, mais 15% sobre oque exceder R$
		// 3.000,00
		
		double salario=3000;
		double salarioBase=3000;
		double imposto=
				(salario<=salarioBase?
						salario*0.10:
							(salario*0.10)+(salario-salarioBase*0.15));
		double resposta = imposto;
		System.out.println("imposto: "+resposta);
		System.out.println("salario: "+salario);
	}
}
