package br.com.impacta.programa;

public class OperadoresLogicos {
	public static void main(String[] args) {
		int x = 10;
		int y = 15;

		boolean b1 = (x < y && y < 20); // b1 = true
		boolean b2 = (x > 10 && --y > 0); // b2 = false , x=10, y=15 printou 15 pq ja n�o leu o resto das intru��es
											// depois do &&
		System.out.println("b2: " + b2 + "\nx: " + x + "\ny: " + y);
		System.out.println("------------------------------------");

		/*
		 * boolean b3 = (x > 10 & --y > 0); // n�o � short circuit vai printar o y como
		 * 14 ele verifica as duas op��es System.out.println("b3: " + b2 + "\nx: " + x +
		 * "\ny: " + y); System.out.println("------------------------------------");
		 */

		boolean b4 = (++x == 10 || y-- == 15); // b4=true, x=11,y=14,
		System.out.println("b4: " + b4 + "\nx: " + x + "\ny: " + y);
		System.out.println("------------------------------------");

	}
}
