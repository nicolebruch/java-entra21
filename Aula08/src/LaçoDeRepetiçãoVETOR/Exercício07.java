package LaçoDeRepetiçãoVETOR;

import java.util.Scanner;

public class Exercício07 {

	static // importar
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// algoritmo que coloque o número 0 no índice que o usuário escolheu
		// e por fim printe o vetor.

		// entrada

		int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Escolha um indice");
		int indice = scan.nextInt();
		// indice que o usuario escolheu, coloque o numero 0
		vetor[indice] = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);

		}

	}
}