package Lista02a;

import java.util.Scanner;

public class Condicional02 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Pedir um valor
		// Mostrar se ele é par ou impar

		// entrada

		System.out.println("Informe um valor.");
		int valor = scan.nextInt();

		// processo e saída

		if (valor % 2 == 0) {
			System.out.println("O valor é Par");
		} else {
			System.out.println("O valor é Ímpar");
		}

	}

}
