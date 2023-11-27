package LaçoDeRepetição;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício07 {

	static // importar

	Scanner entrada = new Scanner(System.in);

	DecimalFormat formatar = new DecimalFormat("0.00");

	public static void main(String[] args) {
		// // Descreva um algoritmo que leia 5 números inteiros
		// Escreva, para cada número lido, se o mesmo é par ou ímpar.

		// entrada

		System.out.println("Informe 5 números:");
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		int num3 = entrada.nextInt();
		int num4 = entrada.nextInt();
		int num5 = entrada.nextInt();

		String parÍmpar = entrada.next();

		// processo e saída

		if (num1 % 2 == 0) {
			System.out.println("O valor é par");
		} else {
			System.out.println("O valor é ímpar");
		}

		// Processo e saída para o segundo número
		if (num2 % 2 == 0) {
			System.out.println("O valor é par");
		} else {
			System.out.println("O valor é ímpar");
		}

		// Processo e saída para o terceiro número
		if (num3 % 2 == 0) {
			System.out.println("O valor é par");
		} else {
			System.out.println("O valor é ímpar");
		}

		// Processo e saída para o quarto número
		if (num4 % 2 == 0) {
			System.out.println("O valor é par");
		} else {
			System.out.println("O valor é ímpar");
		}

		// Processo e saída para o quinto número
		if (num5 % 2 == 0) {
			System.out.println("O valor é par");
		} else {
			System.out.println("O valor é ímpar");
		}
	}

}
