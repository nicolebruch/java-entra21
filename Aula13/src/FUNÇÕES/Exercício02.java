package FUNÇÕES;

import java.util.Scanner;

public class Exercício02 {

	public static String cubo(int num1, int num2, int cubo1, int cubo2, int quadrado1, int quadrado2) {

		cubo1 = num1 * num1 * num1;
		cubo2 = num2 * num2 * num2;

		quadrado1 = num1 * num1;
		quadrado2 = num2 * num2;

		String condição1 = "Os números são 5.";
		String condição2 = "Os números somados resultam em 5.";
		String condição3 = "A diferença dos números é 5.";

		// Algum dos dois números for 5

		if (num1 == 5 || num2 == 5) {

			return condição1 + " " + cubo1 + " e " + cubo2;

		}
		// A soma deles é 5

		else if (num1 + num2 == 5) {
			return condição2 + " " + cubo1 + " e " + cubo2;

		}

		// A diferença deles é 5

		else if ((num1 - num2) == 5 || (num2 - num1) == 5) {
			return condição3 + " " + cubo1 + " e " + cubo2;

			// Nenhuma dessas condições forem satisfeitas

		} else {
			return quadrado1 + " e " + quadrado2;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um valor");
		int num1 = scan.nextInt();

		System.out.println("Informe outro valor");
		int num2 = scan.nextInt();

		System.out.println(cubo(num1, num2, num2, num2, num2, num2));

		// Faça um código que receba duas entradas do usuário

		// Printe cada entrada ao cubo se:
		// Algum dos dois números for 5
		// A soma deles é 5
		// A diferença deles é 5

		// Se nenhuma dessas condições forem satisfeitas, printe cada entrada ao
		// quadrado

	}

}
