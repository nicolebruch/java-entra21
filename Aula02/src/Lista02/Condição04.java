package Lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Condição04 {

	static // importar

	Scanner entrada = new Scanner(System.in);
	DecimalFormat formatar = new DecimalFormat("0.0");

	public static void main(String[] args) {

		// Dado um valor
		// Definir se ele é par ou não

		// entrada

		System.out.println("Informe o valor 1.");
		final int num1 = entrada.nextInt();

		// processo - num1 % 2 == 0

		if (num1 % 2 == 0) {
			System.out.println(num1 + " é par.");
		} else
			System.out.println(num1 + " é ímpar.");

	}

}
