package Lista02a;

import java.util.Scanner;

public class Condicional01 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Pedir um valor
		// Mostrar na tela se o valor é positivo ou negativo.

		// entrada

		System.out.println("Informe um valor.");
		int valor = scan.nextInt();

		// processo e saída

		if (valor > 0) {
			System.out.println("O número é positivo.");
		} else if (valor < 0) {
			System.out.println("O número é negativo.");
		}

	}

}