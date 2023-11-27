package LaçoDeRepetiçãoVETOR;

import java.util.Scanner;

public class Exercício01 {

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// atribuir valores ao vetor de acordo com o quadrado do seu índice
		// printe o vetor.

		// Ex:

		// [0] = 0

		// [1] = 1

		// [2] = 4

		// [3] = 9

		// entrada

		int[] vetor = new int[4];

		// System.out.println(vetor[0]); --> imprime o valor de UMA variável

		vetor[0] = 0;
		vetor[1] = 1;
		vetor[2] = 4;
		vetor[3] = 9;

		for (int índice = 0; índice < 4; índice++) {
			System.out.println(vetor[índice]);
		}

	}

}
