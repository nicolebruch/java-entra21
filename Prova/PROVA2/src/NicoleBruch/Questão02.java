package NicoleBruch;

import java.util.Scanner;

public class Questão02 {

	static // importar

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Questão 2)
		// Encontrar a maior sequência de números seguidos em um vetor.
		// o vetor {6, 0, 1, 5, 4, 3, 4, 5, 6, 1, 6} tem a maior sequência sendo
		// {3, 4, 5, 6}.
		// Exiba essa sequência.
		// Peça para o usuário inserir os valores do vetor.

		// auxiliar

		// entrada

		int[] valores = new int[11];

		// processo

		for (int i = 0; i < 11; i++) {
			System.out.println("Informe valores");
			valores[i] = scan.nextInt();

		}

		// saída

		System.out.println();

	}

}
