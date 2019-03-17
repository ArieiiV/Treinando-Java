package br.com.impacta.programa;

public class numerosAleatorios {
	public static void main(String[] args) {
		/*
		 * double numero=Math.random(); System.out.println(numero);
		 * 
		 * double numeroDois=Math.random()*100; System.out.println(numeroDois);
		 */

		int numeroTres = (int) (Math.random() * 30);
		System.out.println(numeroTres);
		System.out.println("---------------------");

		for (int i = 0; i < numeroTres; i++) {
			int n = (int) (Math.random() * 100);
			if (n > 50) {
				System.out.println(n);
			}

		}

	}
}
