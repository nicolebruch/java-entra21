package NicoleBruch;

import java.util.Scanner;

public class Questão01Corrigida {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// // Questão 1)
		// Crie um programa para encontrar o maior número que pode ser criado
		// reordenando o
		// vetor.
		// Por exemplo:
		// {1, 2, 3, 0, 4, 6}
		// Deverá ter a saída: 643210

		// e o vetor não possui números negativos

	
		// entrada

		int vetor[] = new int[6];

		// processo

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Insira o valor no vetor");
			vetor[i] = scan.nextInt();
		}
		String resultado = " ";

		for (int i = 0; i < vetor.length; i++) {
			int maiorValor = Integer.MIN_VALUE;
			int indiceMaior = 0;

			for (int j = 0; j < vetor.length; j++) {
				if (vetor[j] > maiorValor) {
					maiorValor = vetor[j];
					indiceMaior = j;

				}

			}

			resultado += maiorValor + " ";
			vetor[indiceMaior] = -1;

		}

		System.out.println(resultado);
	}

}
