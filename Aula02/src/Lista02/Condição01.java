package Lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Condição01 {

	static // importar

	Scanner entrada = new Scanner(System.in);
	DecimalFormat formatar = new DecimalFormat("0.0");

	public static void main(String[] args) {

		// Dados dois números inteiros
		// Descrever algoritmo para informar o maior valor entre eles.

		// entrada

		System.out.println("Informe o valor 1.");
		final int num1 = entrada.nextInt();
		System.out.println("Informe o valor 2.");
		final int num2 = entrada.nextInt();

		// processo e saída - maior valor entre 1 e 2

		if (num1 > num2) {
			System.out.println("O maior número é o 1 ");
		} else if (num1 < num2) {
			System.out.println("O maior número é o 2 ");
		}

	}

}
