package br.com.impacta.programa;

public class ExemploDoWhileRandom {
	public static void main(String[] args) {
		int contador = (int) (Math.random() * 20);
		do {
			System.out.println("Possição: " + contador);
			contador--;
		} while (contador > 10);

		System.out.println("----------Finalizado----------");
	}
}
